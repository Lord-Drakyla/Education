package manzilin.lesson.MyParking.impl;

import manzilin.lesson.MyParking.DAO.Database;
import manzilin.lesson.MyParking.DAO.OwnerDAO;
import manzilin.lesson.MyParking.entities.Owner;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class OwnerDAOImpl implements OwnerDAO {
    private final Database pool;

    public OwnerDAOImpl(Database pool) {
        this.pool = pool;
    }

    @Override
    public List<Owner> getList() throws SQLException {
        List<Owner> owners = new LinkedList<>();
        try (Connection connection = pool.getConnection();
             Statement statement = connection.createStatement();
        ) {
            ResultSet set = statement.executeQuery(
                    "select id_owner, name, birthday from owners order by id_owner");
            while (set.next()) {
                Owner owner = new Owner();
                owner.setId(set.getInt(1));
                owner.setName(set.getString("name"));
                owner.setBirthDay(set.getDate("birthday").toLocalDate());
                owners.add(owner);
            }

        }
        return owners;
    }

    @Override
    public Owner getById(int id) throws SQLException {
        Owner owner = new Owner();
        try (Connection connection = pool.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "select id_owner, name, birthday from owners where id_owner = ?")
        ) {
            statement.setInt(1, id);
            ResultSet set = statement.executeQuery();
            set.next();
            owner.setId(id);
            owner.setName(set.getString("name"));
            owner.setBirthDay(set.getDate("birthday").toLocalDate());
        }
        return owner;
    }

    @Override
    public int insert(Owner owner) throws SQLException {
        try (Connection connection = pool.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "insert into owners (name, birthday) values (?,?) returning id_owner")
        ) {
            statement.setString(1, owner.getName());
            statement.setDate(2, Date.valueOf(owner.getBirthDay()));
            ResultSet set = statement.executeQuery();
            set.next();

            return set.getInt(1);
        }
    }

    @Override
    public int update(Owner owner) throws SQLException {
        try (Connection connection = pool.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "UPDATE owners SET name = ?, birthday = ? WHERE id_owner = ?;")
        ) {
            statement.setString(1, owner.getName());
            statement.setDate(2, Date.valueOf(owner.getBirthDay()));
            statement.setInt(3, owner.getId());
            return statement.executeUpdate();
        }
    }

    @Override
    public int delete(Owner owner) throws SQLException {

        try (Connection connection = pool.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "DELETE FROM owners WHERE id_owner = ?;")
        ) {
            statement.setInt(1, owner.getId());
            return statement.executeUpdate();
        }
    }
}

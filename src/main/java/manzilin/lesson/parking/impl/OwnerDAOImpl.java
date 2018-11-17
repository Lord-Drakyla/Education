package manzilin.lesson.parking.impl;

import manzilin.lesson.parking.dao.Database;
import manzilin.lesson.parking.dao.OwnerDAO;
import manzilin.lesson.parking.entities.Owner;

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
            ){
            ResultSet set = statement.executeQuery("select id_owner, name, birthdate from owners order by id_owner");
            while (set.next()) {
                Owner owner = new Owner();
                owner.setId(set.getInt(1));
                owner.setName(set.getString("name"));
                owner.setBirthDate(set.getDate("birthdate"));
                owners.add(owner);
            }

        }
        return owners;
    }

    @Override
    public Owner getById(int id) {
        return null;
    }

    @Override
    public int insert(Owner owner) throws SQLException {
        try (Connection connection = pool.getConnection();
             PreparedStatement statement = connection.prepareStatement("insert into owners (name, birthdate) values (?,?) returning id_owner")
        ){
            statement.setString(1, owner.getName());
            statement.setDate(2, owner.getBirthDate());
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();

            return resultSet.getInt(1);
        }
    }

    @Override
    public int update(Owner owner) {
        return 0;
    }

    @Override
    public int delete(Owner owner) {
        return 0;
    }
}

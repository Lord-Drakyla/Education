package manzilin.lesson.MyParking.impl;

import manzilin.lesson.MyParking.DAO.ContractDAO;
import manzilin.lesson.MyParking.DAO.Database;
import manzilin.lesson.MyParking.entities.Contract;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class ContractDAOImpl implements ContractDAO {
    private final Database pool;

    public ContractDAOImpl(Database pool) {
        this.pool = pool;
    }

    @Override
    public List<Contract> getList() throws SQLException {
        List<Contract> contracts = new LinkedList<>();
        try (Connection connection = pool.getConnection();
             Statement statement = connection.createStatement();
        ) {
            ResultSet set = statement.executeQuery(
                    "select id_contract, owner, signDate from contracts order by id_contract");
            while (set.next()) {
                Contract contract = new Contract();
                setState(set, contract);
                contracts.add(contract);
            }

        }
        return contracts;
    }

    @Override
    public Contract getById(int id) throws SQLException {
        Contract contract = new Contract();
        try (Connection connection = pool.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "select id_contract, owner, signDate from contracts where id_contract = ?")
        ) {
            statement.setInt(1, id);
            ResultSet set = statement.executeQuery();
            set.next();
            setState(set, contract);
        }
        return contract;
    }

    @Override
    public int insert(Contract contract) throws SQLException {
        try (Connection connection = pool.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "insert into contracts (owner, signDate) values (?,?) returning id_contract")
        ) {
            statement.setInt(1, contract.getOwner().getId());
            statement.setDate(2, Date.valueOf(contract.getSignDate()));
            ResultSet set = statement.executeQuery();
            set.next();

            return set.getInt(1);
        }
    }

    @Override
    public int update(Contract contract) throws SQLException {
        try (Connection connection = pool.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "UPDATE contracts SET owner = ?, signDate = ? WHERE id_contract = ?;")
        ) {
            statement.setInt(1, contract.getOwner().getId());
            statement.setDate(2, Date.valueOf(contract.getSignDate()));
            statement.setInt(3, contract.getId());
            return statement.executeUpdate();
        }
    }

    @Override
    public int delete(Contract contract) throws SQLException {

        try (Connection connection = pool.getConnection();
             PreparedStatement statement = connection.prepareStatement(
                     "DELETE FROM contracts WHERE id_contract = ?;")
        ) {
            statement.setInt(1, contract.getId());
            return statement.executeUpdate();
        }
    }

    private void setState(ResultSet set, Contract contract) throws SQLException {
        contract.setId(set.getInt(1));
        contract.setSignDate(set.getDate("signDate").toLocalDate());
        contract.setOwner(new OwnerDAOImpl(pool).getById(set.getInt("owner")));
//                contract.setPlaces(set.getString("owner"));
    }
}

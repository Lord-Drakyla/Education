package manzilin.lesson.parking.impl;

import org.postgresql.ds.PGPoolingDataSource;
import manzilin.lesson.parking.dao.ContractDAO;
import manzilin.lesson.parking.dao.Database;
import manzilin.lesson.parking.dao.OwnerDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseImpl implements Database {

    private final PGPoolingDataSource pool;
    private final ContractDAO contractDAO;
    private final OwnerDAO ownerDAO;

    public DatabaseImpl() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Ошибка при подключении к БД", e);
        }

        pool = new PGPoolingDataSource();
        pool.setServerName("localhost");
        pool.setDatabaseName("postgres");
        pool.setUser("postgres");
        pool.setPassword("postgres");
        pool.setMaxConnections(10);
        pool.setInitialConnections(10);

        contractDAO = new ContractDAOImpl(this);
        ownerDAO = new OwnerDAOImpl(this);
    }

    @Override
    public Connection getConnection() throws SQLException {
        return pool.getConnection();
    }

    @Override
    public ContractDAO getContractDAO() {
        return contractDAO;
    }

    @Override
    public OwnerDAO getOwnerDAO() {
        return ownerDAO;
    }
}

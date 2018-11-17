package manzilin.lesson.MyParking.impl;

import org.postgresql.ds.PGPoolingDataSource;
import manzilin.lesson.MyParking.DAO.ContractDAO;
import manzilin.lesson.MyParking.DAO.Database;
import manzilin.lesson.MyParking.DAO.OwnerDAO;

import java.sql.Connection;
import java.sql.SQLException;

public class PostgresDatabaseImpl implements Database {

    private final PGPoolingDataSource pool;
    private final ContractDAO contractDAO;
    private final OwnerDAO ownerDAO;

    public PostgresDatabaseImpl() {
        pool = new PGPoolingDataSource();
        contractDAO = new ContractDAOImpl(this);
        ownerDAO = new OwnerDAOImpl(this);
    }
    public void start(){
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Ошибка при подключении к БД", e);
        }
        pool.setServerName("localhost");
        pool.setDatabaseName("postgres");
        pool.setUser("postgres");
        pool.setPassword("postgres");
        pool.setMaxConnections(10);
        pool.setInitialConnections(10);

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

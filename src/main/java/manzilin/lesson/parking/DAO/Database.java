package manzilin.lesson.parking.DAO;


import java.sql.Connection;
import java.sql.SQLException;

public interface Database {
    Connection getConnection() throws SQLException;

    ContractDAO getContractDAO();

    OwnerDAO getOwnerDAO();
}

package manzilin.lesson.MyParking.DAO;

import manzilin.lesson.MyParking.entities.Contract;

import java.sql.SQLException;
import java.util.List;

public interface ContractDAO {
    List<Contract> getList() throws SQLException;

    Contract getById(int id) throws SQLException;

    int insert(Contract contract) throws SQLException;

    int update(Contract contract) throws SQLException;

    int delete(Contract contract) throws SQLException;

}

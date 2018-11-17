package manzilin.lesson.MyParking.DAO;

import manzilin.lesson.MyParking.entities.Owner;

import java.sql.SQLException;
import java.util.List;

/**
 * Интерфейс работы с базой данных
 * по владельцам машин
 */

public interface OwnerDAO {

    List<Owner> getList() throws SQLException;

    Owner getById(int id) throws SQLException;

    int insert(Owner owner) throws SQLException;

    int update(Owner owner) throws SQLException;

    int delete(Owner owner) throws SQLException;

}

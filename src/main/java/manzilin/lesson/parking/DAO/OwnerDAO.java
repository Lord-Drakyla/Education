package manzilin.lesson.parking.dao;

import manzilin.lesson.parking.entities.Owner;

import java.sql.SQLException;
import java.util.List;

public interface OwnerDAO {

    List<Owner> getList() throws SQLException;

    Owner getById(int id);

    /**
     * запись владельца в бд
     *
     * @param owner владелец
     * @return идентификатор нового объекта бд
     */
    int insert(Owner owner) throws SQLException;

    int update(Owner owner);

    int delete(Owner owner);

}

package manzilin.lesson.parking.DAO;

import java.sql.Connection;

public interface Database {
    Connection getconnection();
    Contracts contracts();
    Owners owners();
}

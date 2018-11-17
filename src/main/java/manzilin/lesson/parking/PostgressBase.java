package manzilin.lesson.parking;

import manzilin.lesson.parking.DAO.Contracts;
import manzilin.lesson.parking.DAO.Database;
import manzilin.lesson.parking.DAO.Owners;

import java.sql.Connection;

/**
 * todo довести до рабочего состояния. т.е. связаться с базой данных
 */
public class PostgressBase implements Database {
    private final String login = "postgres";
    private final String password = "postgres";

    void  initialize(){

    }
    @Override
    public Connection getconnection() {
        return null;
    }

    @Override
    public Contracts contracts() {
        return null;
    }

    @Override
    public Owners owners() {
        return null;
    }

}

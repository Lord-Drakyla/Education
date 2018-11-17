package manzilin.lesson.parking.DAO;

import manzilin.lesson.parking.Owner;

import java.util.List;

public interface Owners {
    List<Owner> list();
    Owner getbyI();
    int insert();
}

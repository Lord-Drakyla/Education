package manzilin.lesson.parking;

/**
 * DTO - место парковки
 */
public class Place {
    private int houseNumber;
    private String gvmtNumber;
    private int id;

    public Place(int houseNumber, String gvmtNumber, int id) {
        this.houseNumber = houseNumber;
        this.gvmtNumber = gvmtNumber;
        this.id = id;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getGvmtNumber() {
        return gvmtNumber;
    }

    public void setGvmtNumber(String gvmtNumber) {
        this.gvmtNumber = gvmtNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

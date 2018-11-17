package manzilin.lesson.parking.entities;

import java.util.Objects;

public class Place {
    private int homeNum;
    private int placeId;
    private String gosNum;

    public int getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(int homeNum) {
        this.homeNum = homeNum;
    }

    public int getPlaceId() {
        return placeId;
    }

    public void setPlaceId(int placeId) {
        this.placeId = placeId;
    }

    public String getGosNum() {
        return gosNum;
    }

    public void setGosNum(String gosNum) {
        this.gosNum = gosNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Place place = (Place) o;
        return homeNum == place.homeNum &&
                placeId == place.placeId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(homeNum, placeId);
    }
}

package manzilin.SpringInAction.Chapter2.Cooks;


import manzilin.SpringInAction.Chapter2.Dishes.Dish;
import manzilin.SpringInAction.Chapter2.Songs.Song;

public class SingingCook implements Cook {
    private Cook origin;
    private Song song;

    public SingingCook(Cook cook, Song song) {
        this.origin = cook;
        this.song = song;
    }

    @Override
    public Dish Dish() {
        song.begin();
        Dish dish = this.origin.Dish();
        song.end();
        return dish;
    }
}

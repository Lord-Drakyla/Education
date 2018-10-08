package manzilin.homework.h_06.Class;

public class GunOnWall extends LitObject{
        private int existChapter; //появляется
        private int actionChapter;

    public GunOnWall() {
    }

    public GunOnWall(String bookTitle, String author, int existChapter, int actionChapter) {
        super(bookTitle, author);
        this.existChapter = existChapter;
        this.actionChapter = actionChapter;
    }

    public int getExistChapter() {
        return existChapter;
    }

    public void setExistChapter(int existChapter) {
        this.existChapter = existChapter;
    }

    public int getActionChapter() {
        return actionChapter;
    }

    public void setActionChapter(int actionChapter) {
        this.actionChapter = actionChapter;
    }

    @Override
    public String toString() {
        return "GunOnWall{" +
                "existChapter=" + existChapter +
                ", actionChapter=" + actionChapter +
                "} " + super.toString();
    }
}

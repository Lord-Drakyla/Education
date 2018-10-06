package manzilin.homework.h_18.Task2;

public class goneNumb {
    private String content;

    goneNumb(String content) {
        this.content = content;

    }
    public String gone(){
        String local = content.replaceAll("[0-9]{11}", " ");

        return local;
    }
}

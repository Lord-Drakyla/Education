package manzilin.homework.h_18.Task2;

class goneNumb {
    private final String content;

    goneNumb(String content) {
        this.content = content;

    }
    String gone(){
        return content.replaceAll("[0-9]{11}", " ");
    }
}

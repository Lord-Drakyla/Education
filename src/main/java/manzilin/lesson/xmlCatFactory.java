package manzilin.lesson;

public class xmlCatFactory {

    public static xmlCat createxmlCat() {
        xmlCat cat = new xmlCat("Мурзик","персидский",3, new String[]{"мячик", "шнурок"});
        return cat;
    }
}

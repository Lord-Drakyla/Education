package manzilin.homework.h_20;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class XKCD {

//    private String link;
//
//    private String news;
//    private String transcript;
//    private String alt;
//    private String img;
//    private String title;
//    private String day;

    private String month;

    private String year;

    private String safe_title;
    private String num;

    private XKCD() {
    }

//    public XKCD(String month, String year, String safe_title) {
//        this.month = month;
//        this.year = year;
//        this.safe_title = safe_title;
//    }



    public String toPrint() {
        StringBuffer sb = new StringBuffer();
        sb.append("\n   year: " + this.year);
        sb.append("\n   safe_title: " + this.safe_title);
        sb.append("\n   month: " + this.month);
        return sb.toString();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSafe_title() {
        return safe_title;
    }

    public void setSafe_title(String safe_title) {
        this.safe_title = safe_title;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}


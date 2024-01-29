package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        TvSet tv1 = new TvSet("Samsung", "Tizen OS", 55, "4K");
        TvSet tv2 = new TvSet("Sharp", "Android TV", 40, "FH");
        tv1.showInfo();
        tv2.showInfo();
    }
}

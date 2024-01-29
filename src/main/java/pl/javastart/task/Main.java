package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        tvSet tv1 = new tvSet("Samsung", "Tizen OS", 55, "4K");
        tvSet tv2 = new tvSet("Sharp", "Android TV", 40, "FH");
        tv1.showInfo();
        tv2.showInfo();
    }
}

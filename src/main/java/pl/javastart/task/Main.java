package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        tvSet tv1 = new tvSet();
        tv1.manufacturer = "Samsung";
        tv1.smartPlatform = "Tizen OS";
        tv1.diagonalInches = 55;
        tv1.resolution = "4K";
        tvSet tv2 = new tvSet();
        tv2.manufacturer = "Sharp";
        tv2.smartPlatform = "Android TV";
        tv2.diagonalInches = 40;
        tv2.resolution = "FH";
        tv1.showInfo();
        tv2.showInfo();
    }
}

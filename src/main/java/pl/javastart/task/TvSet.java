package pl.javastart.task;

public class TvSet {

    String manufacturer;
    String smartPlatform;
    int diagonalInches;
    String resolution;

    TvSet(String m, String s, int d, String r) {
        manufacturer = m;
        smartPlatform = s;
        diagonalInches = d;
        resolution = r;
    }

    void showInfo() {
        System.out.println("Dane telewizora");
        System.out.printf("Producent: %s%n", manufacturer);
        System.out.printf("smartTV: %s%n", smartPlatform);
        System.out.printf("przekątna ekranu (cale): %d%n", diagonalInches);
        System.out.printf("rozdzielczość: %s%n%n", resolution);
    }
}

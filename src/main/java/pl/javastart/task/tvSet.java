package pl.javastart.task;

public class tvSet {

    String manufacturer;
    String smartPlatform;
    int diagonalInches;
    String resolution;

    tvSet() {}

    void showInfo() {
        System.out.println("Dane telewizora");
        System.out.printf("Producent: %s%n", manufacturer);
        System.out.printf("smartTV: %s%n", smartPlatform);
        System.out.printf("przekątna ekranu (cale): %d%n", diagonalInches);
        System.out.printf("rozdzielczość: %s%n%n", resolution);
    }
}

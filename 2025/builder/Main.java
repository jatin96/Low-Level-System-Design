

public class Main {
    public static void main(String args[]) {
        Car newCar = Car
        .newBuilder("off road", "V10", "100L")
        .addAc("4 slots")
        .addSunroof("panaromic")
        .build();
        
        System.out.println(newCar);
    }
}
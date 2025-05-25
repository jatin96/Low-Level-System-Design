public class Car {
    // required parameters
    String wheels;
    String engine;
    String fuelTank;
    
    // optional parameters
    String ac;
    String sunroof;

    public Car(
        String wheels,
        String engine,
        String fuelTank,
        String ac,
        String sunroof
    ) {
        this.wheels = wheels;
        this.engine = engine;
        this.fuelTank = fuelTank;
        this.ac = ac;
        this.sunroof = sunroof;
    }

    @Override
    public String toString() {
       return String.format("Car properties: wheels=%s engine=%s fuelTank=%s ac=%s sunroof=%s", 
        wheels, engine, fuelTank, ac, sunroof);
    }

    public static Builder newBuilder(String wheels, String engine, String fuelTank) {
        return new Builder(wheels, engine, fuelTank);
    }

    public static class Builder {
        // required parameters
        String wheels;
        String engine;
        String fuelTank;
        
        // optional parameters
        String ac;
        String sunroof;
        public Builder(String wheels, String engine, String fuelTank) {
            this.wheels = wheels;
            this.engine = engine;
            this.fuelTank = fuelTank;
        }

        public Builder addAc(String ac) {
            this.ac = ac;
            return this;
        }

        public Builder addSunroof(String sunroof) {
            this.sunroof = sunroof;
            return this;
        }

        public Car build() {
            return new Car(wheels, engine, fuelTank, ac, sunroof);
        }
    }
}
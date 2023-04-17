package cars.factory.abstraction;


import cars.factory.abstraction.interfaces.TrimType;
import cars.factory.abstraction.interfaces.VinGenerator;

public class CarBuilder extends CarInformation implements VinGenerator {

    protected CarBuilder setYear(int year) {
        this.year = year;
        return this;
    }

    protected CarBuilder setMake(String make) {
        this.make = make;
        return this;
    }

    protected CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    protected CarBuilder setTrim(TrimType trim) {
        this.trim = trim;
        return this;
    }

    public Car build()
    {
        this.vin = createVin();
        return new Car(this);
    }

}

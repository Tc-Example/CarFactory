package cars.factory.builders;


import cars.factory.trims.TrimType;

public class CarBuilder extends CarInformation {

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
        return new Car(this);
    }

}

package cars.factory.children;

import cars.factory.abstraction.CarBuilder;

public class ToyotaPriusCarBuilder extends CarBuilder {

    public ToyotaPriusCarBuilder()
    {
        setMake("Toyota");
        setModel("Prius");
    }

    public CarBuilder setTrim(PriusTrimTypes trim) {
        return super.setTrim(trim);
    }

    @Override
    public CarBuilder setYear(int year) {
        return super.setYear(year);
    }

}

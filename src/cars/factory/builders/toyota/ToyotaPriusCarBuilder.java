package cars.factory.builders.toyota;

import cars.factory.abstraction.CarBuilder;
import cars.factory.builders.generic.GenericCarBuilder;
import cars.factory.trims.PriusTrimTypes;

public class ToyotaPriusCarBuilder extends GenericCarBuilder {

    public ToyotaPriusCarBuilder()
    {
        super("Toyota", "Prius");
    }

    public CarBuilder setTrim(PriusTrimTypes trim) {
        return super.setTrim(trim);
    }

    @Override
    public CarBuilder setYear(int year) {
        return super.setYear(year);
    }

}

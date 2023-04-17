package cars.factory.builders.generic;

import cars.factory.abstraction.CarBuilder;
import cars.factory.abstraction.interfaces.TrimType;

public class GenericCarBuilder extends CarBuilder {
    public GenericCarBuilder(String make, String model, int year, TrimType trim)
    {
        this(make, model);
        setYear(year);
        setTrim(trim);
    }

    public GenericCarBuilder(String make, String model, int year)
    {
        this(make, model);
        setYear(year);
    }

    public GenericCarBuilder(String make, String model)
    {
        setMake(make);
        setModel(model);
    }

}

package cars.factory.abstraction;

import cars.factory.abstraction.interfaces.TrimType;
import cars.factory.trims.DefaultTrimType;

public abstract class CarInformation {

    int year;
    String make;
    String model;
    TrimType trim = DefaultTrimType.DEFAULT;
    String vin;

}

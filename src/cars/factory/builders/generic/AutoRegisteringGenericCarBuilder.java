package cars.factory.builders.generic;

import cars.factory.builders.generic.registry.GenericCarBuilderRegistry;

public class AutoRegisteringGenericCarBuilder extends GenericCarBuilder {
    public AutoRegisteringGenericCarBuilder(String make, String model) {
        super(make, model);
        GenericCarBuilderRegistry.getSingleton().register(model, this);
    }
    public AutoRegisteringGenericCarBuilder(String make, String model, int year) {
        super(make, model, year);
        GenericCarBuilderRegistry.getSingleton().register(model, this);
    }
}

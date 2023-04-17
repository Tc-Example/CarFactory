package cars.factory.builders.generic.registry;

import cars.factory.builders.generic.GenericCarBuilder;

import java.util.ArrayList;
import java.util.Random;

public class GenericCarBuilderRegistry extends ArrayList<GenericCarBuilder> {

        private static GenericCarBuilderRegistry singleton;

        private static final ArrayList<String> models = new ArrayList<>();
        public void register(String model, GenericCarBuilder builder)
        {
            if(models.contains(model))
                return;
            models.add(model);
            add(builder);
        }

        public static GenericCarBuilderRegistry getSingleton()
        {
            return singleton == null ? singleton = new GenericCarBuilderRegistry() : singleton;
        }

        public GenericCarBuilder getRandom()
        {
            Random random = new Random();
            return get(random.nextInt(size()));
        }
}

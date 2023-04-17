import cars.factory.builders.Car;
import cars.factory.builders.impl.generic.registry.GenericCarBuilderRegistry;
import cars.factory.builders.impl.generic.AutoRegisteringGenericCarBuilder;
import cars.factory.builders.impl.toyota.ToyotaPriusCarBuilder;
import cars.factory.trims.PriusTrimTypes;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Calendar;

public class Main {

    private static JSONObject loadCarData() throws IOException {
        File json = new File("./cardata.json");
        return new JSONObject(new String(Files.readAllBytes(Paths.get(json.getAbsolutePath()))));
    }

    private static void createCarBuildersFromJsonData(JSONObject json) {
        JSONArray results = json.getJSONArray("results");
        for (int i = 0; i < results.length(); i++) {
            JSONObject datum = results.getJSONObject(i);
            String model = datum.getString("Model");
            String make = datum.getString("Make");
            new AutoRegisteringGenericCarBuilder(make, model, Calendar.getInstance().get(Calendar.YEAR));
        }
    }

    public static void main(String[] args) throws IOException {

        createCarBuildersFromJsonData(loadCarData());
        makeCars(10);

        ToyotaPriusCarBuilder priusCarBuilder = new ToyotaPriusCarBuilder();
        priusCarBuilder.setTrim(PriusTrimTypes.THREE);
        priusCarBuilder.setYear(2012);
        priusCarBuilder.build().print();

    }

    private static void makeCars(int i) {

        Car[] cars = new Car[i];

        for (int i1 = 0; i1 < cars.length; i1++) {
            cars[i1] = GenericCarBuilderRegistry.getSingleton().getRandom().build();
            cars[i1].print();
        }

    }
}
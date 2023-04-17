package cars.factory.builders;

import cars.factory.trims.TrimType;
import cars.factory.trims.DefaultTrimType;

import java.util.Random;

public abstract class CarInformation {

    int year;
    String make;
    String model;
    TrimType trim = DefaultTrimType.DEFAULT;
    String vin = createVin();

    private String createVin()
    {
        Random random = new Random();
        String vinChars = "ABCDEFHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder vin = new StringBuilder();
        for (int i = 0; i < 11; i++) {
            vin.append(vinChars.charAt(random.nextInt(vinChars.length())));
        }
        return vin.toString();
    }

}

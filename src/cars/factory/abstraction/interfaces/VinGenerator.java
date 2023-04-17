package cars.factory.abstraction.interfaces;

import java.util.Random;

public interface VinGenerator {
    default String createVin()
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

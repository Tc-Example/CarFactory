import cars.factory.abstraction.Car;
import cars.factory.children.ToyotaPriusCarBuilder;

public class Main {
    public static void main(String[] args) {

        ToyotaPriusCarBuilder priusBuilder = new ToyotaPriusCarBuilder();
        priusBuilder.setYear(2012);
        priusBuilder.setTrim("Three");

        Car myPrius = priusBuilder.build();
        myPrius.print();

        Car anotherPrius = priusBuilder.build();
        anotherPrius.print();

    }
}
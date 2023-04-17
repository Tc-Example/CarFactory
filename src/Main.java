import cars.factory.abstraction.Car;
import cars.factory.abstraction.TrimType;
import cars.factory.children.PriusTrimTypes;
import cars.factory.children.ToyotaPriusCarBuilder;

public class Main {
    public static void main(String[] args) {

        ToyotaPriusCarBuilder priusBuilder = new ToyotaPriusCarBuilder();
        priusBuilder.setYear(2012);
        priusBuilder.setTrim(PriusTrimTypes.THREE);

        Car myPrius = priusBuilder.build();
        myPrius.print();

        Car anotherPrius = priusBuilder.build();
        anotherPrius.print();

    }
}
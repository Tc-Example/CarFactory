package cars.factory.abstraction;

public class Car extends CarInformation {
    protected Car(CarBuilder builder)
    {
        this.year = builder.year;
        this.make = builder.make;
        this.model = builder.model;
        this.trim = builder.trim;
        this.vin = builder.vin;
    }

    public void print()
    {

        System.out.println("~~~~~~~~ Car Facts ~~~~~~~~");
        System.out.println("Year: " + this.year);
        System.out.println("Make: " + this.make);
        System.out.println("Model: " + this.model);
        System.out.println("Trim: " + this.trim);
        System.out.println("Vin: " + this.vin);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println(" ");
    }

}
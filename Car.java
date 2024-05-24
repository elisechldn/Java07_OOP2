public class Car extends Vehicle {

    public Car(String brand, int kilometers) {
        super(brand, kilometers);
    }

    public Car(String brand) {
        super(brand);
    }

    @Override
    public String doStuff(){
        return "Je suis " + getBrand() + " et je fais vroum vroum !";
    }
}
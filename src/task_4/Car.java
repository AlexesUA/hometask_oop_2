package task_4;

public class Car {
    int manufactureYear;
    double maxSpeed;
    int weight;
    String colour;


    public Car(){
        this(1965);
    }

    public Car(int manufactureYear){
        this(manufactureYear, 283);
    }

    public Car(double maxSpeed){
        this(1970, maxSpeed);
    }

    public Car(int manufactureYear, double maxSpeed){
        this(manufactureYear, maxSpeed, 970);
    }

    public Car(int manufactureYear, double maxSpeed, int weight){
        this(manufactureYear, maxSpeed, weight, "Iron Oxide");
    }

    public Car(int manufactureYear, double maxSpeed, int weight, String colour){
        this.manufactureYear = manufactureYear;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format("Рік випуску: %1$s, Максимальна швидкість: %2$s, Вага: %3$s, Колір: %4$s ",
                manufactureYear, maxSpeed, weight, colour);
    }
}

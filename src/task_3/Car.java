package task_3;

public class Car {
    int manufactureYear;
    double maxSpeed;
    int weight;
    String colour;


    public Car(){
        manufactureYear = 1965;
        maxSpeed = 263;
        weight = 1320;
        colour = "Sea Marine";
    }

    public Car(int manufactureYear){
        this.manufactureYear = manufactureYear;
        maxSpeed = 283;
        weight = 1100;
        colour = "Garden Green";
    }

    public Car(double maxSpeed){
        manufactureYear = 1970;
        this.maxSpeed = maxSpeed;
        weight = 1890;
        colour = "Phantom Darck";
    }

    public Car(int manufactureYear, double maxSpeed){
        this.manufactureYear = manufactureYear;
        this.maxSpeed = maxSpeed;
        weight = 970;
        colour = "Light Pink";
    }

    public Car(int manufactureYear, double maxSpeed, int weight){
        this.manufactureYear = manufactureYear;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        colour = "Iron Oxide";
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

package task_2;

public class Car {
    int manufactureYear;
    String colour;

    public Car(){
        this.manufactureYear = 1960;
        colour = "Fire Red";
    }

    public Car(int manufactureYear){
        this.manufactureYear = manufactureYear;
        colour = "Scy Blue";
    }

    public Car(int manufactureYear, String colour){
        this.manufactureYear = manufactureYear;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return String.format("Рік випуску: %1$s , Колір: %2$s ");
    }
}

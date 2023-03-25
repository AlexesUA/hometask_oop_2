package task_2;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car(1950);
        Car car3 = new Car(2023, "Grey");


        System.out.println("Конструктор за замовчуванням: " + car1.toString());
        System.out.println("Конструктор з 1 параметром: " + car2.toString());
        System.out.println("Конструктор з 2 параметрами: " + car3.toString());
    }

}

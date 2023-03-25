package task_4;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2_1 = new Car(1964);
        Car car2_2 = new Car(312.0);
        Car car3 = new Car(1951,245);
        Car car4 = new Car(2001, 261, 1620);
        Car car5 = new Car(1981, 160, 1002, "White");

        System.out.println("Конструктор за замавчуванням: " + car1.toString());
        System.out.println("Конструктор з 1 параметром: " + car2_1.toString());
        System.out.println("Конструктор з 1 параметром (перевантажений): " + car2_2.toString());
        System.out.println("Конструктор з 2 параметрами: " + car3.toString());
        System.out.println("Конструктор з 3 параметрами: " + car4.toString());
        System.out.println("Конструктор з 4 параметрами: " + car5.toString());
    }
}

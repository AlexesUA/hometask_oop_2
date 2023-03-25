package task_5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random rmdNumber = new Random();
        for(int i=0; i<5; i++){
            double radius = i+1;//rmdNumber.nextDouble(1,10);
            System.out.printf("Площа кола з радіусом %1$.2f дорівнює %2$.2f %n", radius, MyArea.AreaOfCircle(radius));

        }
    }


}

package Workouts;

import java.util.Scanner;

public abstract class Exercise implements Workout_Interface {
    double time;
    double weight;

    public Double getTime() {
        Scanner a = new Scanner(System.in);

        System.out.println("How much time do you have (in minutes)?");
        this.time = a.nextDouble();
        return this.time;
    }

    public Double getWeight() {
        Scanner b = new Scanner(System.in);

        System.out.println("How much do you weigh?");
        weight = b.nextDouble();
        return weight;
    }
}

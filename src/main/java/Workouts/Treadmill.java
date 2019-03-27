package Workouts;

public class Treadmill extends Exercise {


    public String getDescription() {

        double run = Math.round(time - 5);
        //Take out 5 minutes for a cool down

        double hours = time / 60;
        double calories = Math.round(((weight / 2.2) * 6) * hours);
        // Calculate calories burned:
        // User's weight in kilograms (2.2) multiplied by estimated MET (6) for vigorous exercise, then multiplied by duration of workout

        System.out.println("\n");
        String instructions = "Indoor Run:\n---------------------------\nRun on the treadmill for " + run + " minutes. Then walk for 5 minutes.\nAim for a 14 minute mile pace. Make sure you stretch before you run.\nAfter your run you will have burned around " + calories + " calories. Great job!";

        return instructions;
    }
}

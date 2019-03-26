package Workouts;

public class Run extends Exercise {

    public String getDescription() {

        double run = Math.round(time - 5);
        //Take out 5 minutes for a cool down

        double hours = time / 60;
        double calories = Math.round(((weight / 2.2) * 6) * hours);
        // Calculate calories burned:
        // User's weight in kilograms (2.2) multiplied by estimated MET (6) for vigorous exercise, then multiplied by duration of workout

        System.out.println("\n");
        String instructions = "Outdoor Run:\n---------------------------\nRun around your neighborhood or park for " + run + " minutes. Then walk for 5 minutes.\nAim for a 20 minute per hour run pace. Make sure you stretch before you run.\nWear bright colors and take a friend with you so you don't get kidnapped!\nAfter your run you will have burned around " + calories + " calories. Great job!";

        return instructions;
    }
}

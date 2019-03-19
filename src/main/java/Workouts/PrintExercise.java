package Workouts;


import java.io.IOException;
import java.io.PrintWriter;

public class PrintExercise {
    public PrintExercise(String instructions) throws IOException{

        PrintWriter writer = new PrintWriter("your_workout.txt", "UTF-8");
        writer.println( instructions );
        writer.close();
    }
}

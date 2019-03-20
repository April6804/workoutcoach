package Workouts;


import java.io.IOException;
import java.io.PrintWriter;

import static Workouts.CircuitTraining.instructions;


public class PrintExercise{
    public PrintExercise() throws IOException{

        System.out.println(instructions + "\n\nA file named \"instructions.txt\" has been created for you to print and take with you to workout.");
        PrintWriter writer = new PrintWriter("instructions.txt", "UTF-8");
        writer.println( instructions );
        writer.close();
    }
}

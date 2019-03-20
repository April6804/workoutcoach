package Workouts;


import java.io.IOException;
import java.io.PrintWriter;


public class PrintExercise extends CircuitTraining{
    public PrintExercise() throws IOException{

        System.out.println(CircuitTraining.instructions + "\n\nA file named \"instructions.txt\" has been created for you to print and take with you to workout.");
        PrintWriter writer = new PrintWriter("instructions.txt", "UTF-8");
        writer.println( instructions );
        writer.close();
    }
}

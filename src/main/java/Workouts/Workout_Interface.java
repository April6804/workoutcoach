package Workouts;

import java.io.IOException;

public interface Workout_Interface {
    Double getTime();
    Double getWeight();
    String getDescription() throws IOException;


}


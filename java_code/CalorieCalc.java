import java.util.Scanner;

public class CalorieCalc {

    public static final double FEET_PER_STEP = 2.5;
    public static final int FEET_PER_MILE = 5280;
    public static final double STEPS_PER_MINUTE = 70.0;
    public static final double CALORIES_PER_MINUTE_WALKING = 3.5;

    public static double stepsToMiles(int numSteps) {
        return numSteps * FEET_PER_STEP * (1.0 / FEET_PER_MILE);
    }

    public static double stepsToCalories(int numSteps) {
        double minutesTotal = numSteps / STEPS_PER_MINUTE;
        double caloriesTotal = minutesTotal * CALORIES_PER_MINUTE_WALKING;
        return caloriesTotal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int steps = 0;
        while (true) {
            System.out.print("Enter steps or -1 to exit: ");
            steps = in.nextInt();
            if (steps < 0) break;
            System.out.println("Miles: " + stepsToMiles(steps));
            System.out.println("Calories: " + stepsToCalories(steps));
        }
        in.close();
    }
}

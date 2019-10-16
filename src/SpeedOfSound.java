/*
 Write a program that asks the user to enter "air", "water", or "steel" and the distance that the sound wave
 will travel in the medium. The program should then display the amount of time it will take

 You can calculate the time it takes for sound to travel in air with the following formula

 Time = Distance/1,100

 You can calculate the amount of time it takes sound to travel in water with the following formula

 Time = Distance/4,900

 You can calculate the amount of time it takes sound to travel in steel with the following formula

 Time = Distance/16,400

 Additional information (not in the text):
     assume the user enters the input correctly
     display time in seconds to 2 decimal places
*/

import java.util.Scanner; //imports scanner to capture user input

public class SpeedOfSound {
    public static void main (String []args) {
        String medium;
        double distance;
        double time;
        Scanner keyboard = new Scanner(System.in); //created a new scanner object to capture keyboard input


        //ask user to enter either "air", "water", or "steel"
        System.out.println("Let's figure out the time it took for your sound to travel.");
        System.out.println("First, what was the sound traveling through?");
        System.out.println("Please enter 'air', 'water', or 'steel' without quotation marks.");

        //capture next string as the answer
        medium = keyboard.nextLine();

        //ask user for distance the sound wave traveled
        System.out.println("Great! Next, how far did your sound wave travel? (in feet)");

        //capture the user's next input as the distance
        //this is a double because people frequently estimate feet as "1.5" or "1.25", so it's better to have
        //the option for precision built in
        distance = keyboard.nextDouble();

        //decision structure checks which type is entered, and then evaluates the correct equation
        if (medium.equals("air")) {
            //formula supplied for air
            time = distance / 1100.0;
        }
        else if (medium.equals("water")){
            //formula supplied for water
            time = distance / 4900.0;
        }
        else if (medium.equals("steel")){
            //formula supplied for steel
            time = distance / 16400.0;
        }
        else {
            //we should never hit this point given the assumption from the assignment that
            // the user will always enter their input correctly, but it leaves open the option
            //to catch errors in the future. It also ensures that each formula is explicitly linked
            //to the media type it represents, so if anything is added in the future they will stay
            //together
            System.out.println("That doesn't seem quite right, let's try again.");
            time = 0;
        }

        System.out.printf("Your sound wave traveled through %s for a total of %.2f seconds to reach a distance of %.2f feet.",
                medium, time, distance);

    }
}

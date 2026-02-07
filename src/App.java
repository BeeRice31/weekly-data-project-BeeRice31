import java.util.Scanner;

/**
 * Instructions:
 * - Complete the WeeklyData.java class first.
 * - Use this App class to collect user input and test your WeeklyData methods.
 * - Follow all TODOs carefully.
 * - Do NOT hard-code values — use loops and method calls.
 */
public class App {

    public static void main(String[] args) {

        // -------------------------------------------------------------
        // TODO 1: Create a Scanner for user input
        // -------------------------------------------------------------
        Scanner scanner = new Scanner(System.in);


        // -------------------------------------------------------------
        // TODO 2: Give information about your program
        //         Ask the user about their goals (if applicable)
        // -------------------------------------------------------------
        System.out.println("Welcome to the Weekly Data Tracker!");
        System.out.println("This program will track your daily sleep hours for the week.");
        System.out.println("Please enter your sleep hours for each day (0-24 hours).\n");


        // -------------------------------------------------------------
        // TODO 3: Create an array to hold 7 days of data
        //         Use an appropriate data type (int or double)
        //         Name the array weekData
        // -------------------------------------------------------------
        double[] weekData = new double[7];


        // -------------------------------------------------------------
        // TODO 4: Use a for loop to collect data for each day of the week
        //         Prompt example:
        //         "Enter <data type> for day X: "
        //
        //         Include input validation:
        //         - Use a while loop to prevent negative values
        //         - Re-prompt if the value is invalid
        // -------------------------------------------------------------
        for (int i = 0; i < weekData.length; i++) {
            double hours = -1;
            while (hours < 0) {
                System.out.print("Enter sleep hours for day " + (i + 1) + ": ");
                hours = scanner.nextDouble();
                if (hours < 0) {
                    System.out.println("Invalid input. Please enter a non-negative value.");
                }
            }
            weekData[i] = hours;
        }


        // -------------------------------------------------------------
        // TODO 5: Create a WeeklyData object
        //         Pass the weekData array into the constructor
        // -------------------------------------------------------------
        WeeklyData data = new WeeklyData(weekData);


        // -------------------------------------------------------------
        // TODO 6: Display the results of the analysis
        //         Call methods from WeeklyData to display:
        //         - Total
        //         - Average
        //         - Minimum
        //         - Maximum
        //
        //         Use clear labels and formatted output if needed
        // -------------------------------------------------------------
        System.out.println("\n--- Weekly Sleep Analysis ---");
        System.out.println("Total Sleep Hours: " + data.getTotal());
        System.out.println("Average Sleep Hours: " + data.getAverage());
        System.out.println("Minimum Sleep Hours: " + data.getMin());
        System.out.println("Maximum Sleep Hours: " + data.getMax());


        // -------------------------------------------------------------
        // TODO 7: Display the full week of data
        //         Use the toString() method from WeeklyData
        // -------------------------------------------------------------
        System.out.println("\n--- Daily Breakdown ---");
        System.out.println(data.toString());


        // -------------------------------------------------------------
        // TODO 8: Give the user insights about their week
        //         --> "You need to drink more water next week!"
        //         --> "You were very hydrated this week!"
        //         --> etc.
        // -------------------------------------------------------------
        double averageSleep = data.getAverage();
        if (averageSleep < 6) {
            System.out.println("You need more sleep next week! Try to aim for 7-9 hours per night.");
            System.out.println("Consider not using screens before bed");
            System.out.println("Try to go to bed and wake up at the same time each day");
            System.out.println("Try not to consume caffeine in the afternoon and evening");
            System.out.println("Try not to eat or drink a lot before bed");
            System.out.println("Try to get some exercise during the day");
            System.out.println("Stick to a routine with these to help your body get used to a regular sleep schedule");
        } else if (averageSleep >= 7 && averageSleep <= 9) {
            System.out.println("Great job! You're getting a healthy amount of sleep this week.");
        } else {
            System.out.println("You're getting plenty of sleep! Keep maintaining this healthy routine.");
        }

        scanner.close();

    }
}

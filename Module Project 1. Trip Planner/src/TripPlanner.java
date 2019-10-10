import java.util.Scanner;

public class TripPlanner {

    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        //greeting(input);
        travelTimeAndBudget(input);
        timeDifference(input);
        countryArea(input);
        round(input);
        hackerProblem(input);

    }

    private static void greeting(Scanner input) {
        String name;
        String destination;

        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        name = input.nextLine();
        System.out.println();

        System.out.print("Nice to meet you "+name+", where are you travelling to? ");
        destination = input.nextLine();
        System.out.println();

        System.out.println("Great! "+destination+" sounds like a great trip");

        nextSection();

    }

    private static void travelTimeAndBudget(Scanner input) {
        int daysTrav=0;
        double travelMoney=0;
        String currencySymbol;
        double converstionRate;
        double dailySpend;

        //GET AND SET SECTION FOR THE VARIABLES LISTED ABOVE
        System.out.print("How many days are you going to spend travelling? ");
        daysTrav = input.nextInt();
        System.out.print("How much money, in USD are you planning to spend on your trip? ");
        travelMoney = input.nextInt();

        //System.out.print("What is the three letter currency symbol for your travel destination? ");
        //currencySymbol = input.next();
        //System.out.print("How many "+currencySymbol+" are there in 1 USD? ");
        //converstionRate = input.nextDouble();

        //UPDATE DAILY SPEND
        dailySpend = travelMoney/daysTrav;

        //PRINT OUT FOR THE VARIABLES BEING MANIPULATED IN VARIOUS WAYS
        System.out.println("If you are travelling for "+daysTrav+" days that is the same as "+(daysTrav*24)+" hours or "+(daysTrav*1440)+" minutes or "+(daysTrav*86400));
        System.out.println("If you are going to spend $"+travelMoney+" USD that means per day you can spend up to $"+ round(dailySpend) + " USD");

    }

    private static void timeDifference(Scanner input) {
    }

    private static void countryArea(Scanner input) {
    }

    private static void round(Scanner input) {
    }

    private static void hackerProblem(Scanner input) {
    }

    private static void nextSection(){
        System.out.println("**************************************");
        System.out.println();
    }

    private static double round (double target){
        target=target*100;
        int changed = (int)target;
        double twoDecimal =(double)changed;
        return twoDecimal/100;
    }
    
}

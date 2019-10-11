import java.util.Scanner;

public class TripPlanner {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        //greeting(input);
        //travelTimeAndBudget(input);
        //timeDifference(input);
        countryArea(input);

    }

    //MAIN METHODS
    private static void greeting(Scanner input) {
        //SECTION VARIABLES
        String name;
        String destination;

        //GET AND SETS
        System.out.println();
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        name = input.nextLine();

        System.out.print("Nice to meet you "+name+", where are you travelling to? ");
        destination = input.nextLine();
        System.out.println("Great! "+destination+" sounds like a great trip");

        nextSection();

    }
    private static void travelTimeAndBudget(Scanner input) {
        //SECTION VARIABLES
        int daysTrav;
        double travelMoney;
        String currencySymbol;
        double converstionRate;
        double dailySpendDollar;
        double totalSpendLocalCurrency;
        double dailySpendLocalCurrency;

        //GET AND SET SECTION FOR THE VARIABLES LISTED ABOVE
        System.out.print("How many days are you going to spend travelling? ");
        daysTrav = input.nextInt();
        System.out.print("How much money, in USD are you planning to spend on your trip? ");
        travelMoney = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        currencySymbol = input.next();
        System.out.print("How many "+currencySymbol+" are there in 1 USD? ");
        converstionRate = input.nextDouble();
        System.out.println();

        //UPDATE DAILY SPEND AND ROUND
        totalSpendLocalCurrency = round((travelMoney*converstionRate));
        dailySpendDollar = round((travelMoney/daysTrav));
        dailySpendLocalCurrency = round((totalSpendLocalCurrency/daysTrav));


        //PRINT OUT FOR THE VARIABLES BEING MANIPULATED IN VARIOUS WAYS
        System.out.println("If you are travelling for "+daysTrav+" days that is the same as "+(daysTrav*24)+" hours or "+(daysTrav*1440)+" minutes or "+(daysTrav*86400)+" seconds");
        System.out.println("If you are going to spend $"+travelMoney+" USD that means per day you can spend up to $"+ dailySpendDollar + " USD");
        System.out.println("Your total budget in "+currencySymbol+" is "+totalSpendLocalCurrency+" "+currencySymbol+", which per day is "+dailySpendLocalCurrency+ " MXC");

        nextSection();
    }
    private static void timeDifference(Scanner input) {
        int hourDifference;
        int timeAtMidnight;
        int timeAtNoon;
        int noonStart=12;
        int midnightStart=24;

        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        hourDifference = input.nextInt();

        timeAtNoon=timeDifferenceCalculator(hourDifference,noonStart);
        timeAtMidnight=timeDifferenceCalculator(hourDifference,midnightStart);

        System.out.println("That means that when it is midnight at home it will be "+timeAtMidnight+":00 in your travel destination");
        System.out.println("and when it is noon at home it will be "+timeAtNoon+":00");
        nextSection();

    }
    private static void countryArea(Scanner input) {

        double countryKiloMetersSqr;
        System.out.print("What is the square area of your destination country in km2? ");
        countryKiloMetersSqr = input.nextInt();
        countryKiloMetersSqr *=0.38610;
        countryKiloMetersSqr = round(countryKiloMetersSqr);
        System.out.println("That is "+countryKiloMetersSqr+" in miles");
        nextSection();
    }

    //UTILITY METHODS
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
    private static int timeDifferenceCalculator(int hourDifference,int startTime){
        int calculatedReturnTime;
        if(hourDifference>=0) {
            if(hourDifference<startTime) {
                calculatedReturnTime = hourDifference;
            }else{
                calculatedReturnTime =(hourDifference%12);
            }
        }else{
            if(hourDifference>=-startTime) {
                calculatedReturnTime = startTime + hourDifference;
            }else{
                calculatedReturnTime = startTime + (hourDifference%startTime);
            }
        }
        if(startTime < 24){
            calculatedReturnTime=calculatedReturnTime+startTime;
        }
        return calculatedReturnTime;
    }
    
}

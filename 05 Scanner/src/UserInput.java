import java.util.Scanner;

public class UserInput {



    public static void main (String[] args){

        Scanner input = new Scanner(System.in);
           inputBirthday(input);
        }

    static void name() {
        Scanner input = new Scanner(System.in);
        System.out.print("Hi what's your name? ");
        String userInput = input.next();
        System.out.println("Hello " + userInput);
        System.out.println();
    }

    static void age() {
        Scanner input = new Scanner(System.in);
        System.out.print("How old are you ? ");
        int age = input.nextInt();
        System.out.println("you are "+age+ " years old");
    }

    static void aboutYou() {
        Scanner input = new Scanner(System.in);
        System.out.print("What do you like? ");
        String youLike = input.nextLine();
        System.out.println("You like "+youLike);
    }

     static void inputBirthday(Scanner input){

        System.out.print("On what day of the month were you born? ");
        int day = input.nextInt();
        System.out.println();

        System.out.print("What is the name of the month in which you were born? ");
        String month = input.next();
        System.out.println();

        System.out.print("During what year were you born? ");
        int year = input.nextInt();
        System.out.println();

        System.out.print("You were born on " + month +" " + day+ ", " + year + ". You're mighty old!");
    }

}


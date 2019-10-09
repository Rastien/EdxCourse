/*
This is just a simple project to show how comments work! T
his is a basic example of how you can create a paragraph of comments
*/

public class Comments {
    public static void main (String[] args){

        System.out.println("Hello this will appear"); //but this single line of comments won't!
        System.out.println();

        wellFormed();
    }

    /*This method is an example of using escape sequence characters
      compare what is written to what is produced and the annotation of the IDE*/
    public static void wellFormed(){
        System.out.println("A well-formed Java program has");
        System.out.println("a main method with { and }");
        System.out.println("braces.");
        System.out.println("");
        System.out.println("A System.out.println statement");
        System.out.println("has ( and ) and usually a");
        System.out.println("String that starts and ends");
        System.out.println("with a \" character.");
        System.out.println("(But we type \\\" instead!)");
    }
}

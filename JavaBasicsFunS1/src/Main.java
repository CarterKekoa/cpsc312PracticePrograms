import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**this is a javadoc block comment
 *
 */

public class Main {
    public static void main(String[] args) {
        //static means class level (dont need an object to invoke) (no this. reference)
        //String[] array of strings
        //args is a parameter for command line arguments

        System.out.println(args.length);

        //VARIABLES
        //a variable in java is either a primative or a reference
        //8 primative types
        //1. char
        char myChar = 'a';
        //we can concatenate primatives and strings
        System.out.println("myChar: " + myChar);
        //2. int
        //3. double (double precision floating point number)
        //you get the java.lang package for free
        double myDouble = Math.PI;
        //CONSTANTS
        //MACRO_CASE
        //use the final keyword
        System.out.println(myDouble);
        //to round to decimal flaces
        //use printf()
        //use DecimalFormat class
        DecimalFormat df = new DecimalFormat("#0.00");
        System.out.println(df.format(myDouble));
        //4. boolean
        //keywords for true and false
        boolean myBool = true;
        System.out.println("myBool: " + myBool);
        //5. short 6. long 7. float 8. byte

        //STRINGS
        //a String is an object of type String
        String myString = "hello";
        System.out.println("myString: " + myString);
        //we have access to member methods and attributes
        System.out.println(myString.length());
        //trim() remove leading and trailing white space
        //split() can split a string into a array of substrings
        //toCharArray()

        //task1: declare two strings, one for first and last name
        //print out <first name> <last name> has <#> chars in it
        String firstName = "Carter";
        String lastName = "Mooring";
        int totalChars = firstName.length() + lastName.length();
        System.out.println(firstName + lastName + " has " + totalChars);

        //ARRAYS
        //declare and initialize at the same time
        int[] myInts = {3, 5, 4, 6};
        System.out.println(myInts); //every class in java inherits from Object
        //Object has a toString() that returns a hash code
        System.out.println(Arrays.toString(myInts));
        //task 2: declare an array of 4 of your friends' names
        final int NUM_FRIENDS = 4;
        String[] myNames = new String[NUM_FRIENDS];
        myNames[0] = "JR";
        myNames[1] = "Jackson";
        myNames[2] = "Armondo";
        myNames[3] = "Jerry";

        System.out.println(Arrays.toString(myNames));
        System.out.println(myNames.length);
        System.out.println(myNames[myNames.length - 1]);

        //CONTROL FLOW
        //if/else and switch same as C++
        //range based (for each) for loop
        //iterating over a sequence
        for (String friend : myNames) { //for each string friend in myFriends
            System.out.println(friend);
        }

        //task 3: print out the first 20 even numbers on one line
        for (int i = 2; i < 21; i += 2){
            System.out.print(i + " ");
        }

        //METHODS
        //functions in java
        //also similar to C++
        //you need to add static to methods that are not instance-level
        //use static methods for PA1 (NO OOP For PA1)
        //task 4: define and call a function that accepts 2 strings
        //return true if the last character of each string is the same
        //false otherwise



        //RANDOM NUMBERS
        //create an object of type Random
        Random random = new Random();
        int randInt = random.nextInt(10); //[0, bound) [0, 10)
        System.out.println();
        System.out.println(randInt);


        //USER INPUT
        //use scanner for user input from System.in and from a File
        Scanner kb = new Scanner(System.in); // if want to read from a file here, will need to create a newFile(path)
        System.out.print("Enter your favorite number: ");
        int favNum = kb.nextInt();
        kb.nextLine();  //flushes the n/ new line character from buffer from Enter
        System.out.println("Your favorite number is: " + favNum);


        System.out.print("Enter your favorite place: ");
        String favPlace = kb.nextLine();
        System.out.println("Your favorite place: " + favPlace);

    }
    //task 4:
    public static boolean lastCharacterCheck(String first, String second) {
        //null refers to a invalid reference
        if(first != null && second != null){
            if(first.length() > 0 && second.length() > 0) {
                //can safely index
                return first.charAt(first.length() - 1) == second.charAt(second.length() - 1);
            }
        }
        return false;
    }
}

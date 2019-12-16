import java.util.Scanner;
//Java program to find middle character of odd or even length of string

public class MiddleCharOfString {


    //Method to find middle character
    public static String middlechar(String str)
    {
        int position;
        int middlecharecter;
        int length = str.length();  //str.length() is inbuilt method to find string length

        /*If string length is odd example length = 5 --> position will be 2 and length will be 1 -->which will return
        substring from 2 and ending with 3
         */
        if((length % 2) != 0)                  //for odd length
        {
            position =length/2;
            length =1;

        }

        /*
        If string length is even example length =6 --> position will be 2 and lenght is 2 --> which will return
        substring starting from 2 and ending at 4
         */
        else                                  //for even length
        {
            position =length/2 - 1;
            length = 2;

        }

        /*substring is in-built method in java where we can specify begin index and end index to select particular
         charecter of the string */

        return str.substring(position,position+length);
    }



    //main method starts here
    public static void main(String[] args) {

        String oddstr1 = "there";
        String odd1 = middlechar(oddstr1); // calling method middlechar by passing parameter - odd string
        System.out.println("Middle character in odd length of string --> "+oddstr1+"\n"+odd1 );

        String evenstr1 = "orange";
        String even1 = middlechar(evenstr1); //calling method middlechar by passing parameter - even string
        System.out.println("Middle character in even length of string --> "+evenstr1+"\n"+even1 );

        String oddstr2 = "England";
        String odd2 = middlechar(oddstr2); // calling method middlechar by passing parameter - odd string
        System.out.println("Middle character in odd length of string --> "+oddstr2+"\n"+odd2 );

        String evenstr2 = "scotland";
        String even2 = middlechar(evenstr2); //calling method middlechar by passing parameter - even string
        System.out.println("Middle character in even length of string --> "+evenstr2+"\n"+even2 );


    }


}

import com.sun.source.tree.WhileLoopTree;

import javax.swing.*;
import java.awt.*;

public class practice1 {
        public static void main(String[] args) {

            // Final & Constant key word work the same
            final int firstNum = 25;
            // firstNum= 87;
            System.out.println(firstNum);

            // float and double
            // use f & d at end of value for float and double respectively
            float flot=34.56f;
            double dob=23.18d;
            System.out.println(flot+"  " +dob);

            // using power of 10 with "e"
            float f1= 5e3f;
            double d1=8e4;
            System.out.println(f1+"  "+d1);

            // Boolean Functions
            boolean isJavaEasy =true;
            boolean isJavaHard = false;
            System.out.println(isJavaEasy);
            System.out.println(isJavaHard);

            //Casting
            //Widening casting
            int n1=7;
            double d2 =n1;
            System.out.println(n1);
            System.out.println(d2);
            //Narrowing Casting
            double d3= 45.67d;
            int n2= (int)d3;
            System.out.println(d3);
            System.out.println(n2);

            // Increment using ++ operator
            int n3= 4;
            n3++;
            System.out.println(n3);
            // Decrement operator --
            int n4= 7;
            n4--;
            System.out.println(n4);

            //String Methods
            //1. String Lenght
            String s1="Java is going pretty smooth";
            System.out.println(s1+ "  = " + s1.length() );

            //2. Uppercase
            System.out.println(s1.toUpperCase());
            //hashcode
            System.out.println(s1.hashCode());

            //concatination of string
            String s2= " but i'm done";
            System.out.println(s1.concat(s2));

            //Special Characters

            //Quotation marks    \\ for backslash with text, \" for double quotes, \' for single quote
            String s3= "but \'i'm\' done";
            System.out.println(s3);

            //New Line= \n. backslash= \b, tab space= \t
            String s4=" eeeeebut \t i'm done";
            System.out.println(s4);

            //Math methods

            System.out.println(Math.max(15,13));
            System.out.println(Math.min(13,2));
            System.out.println(Math.abs(-5));
            int n5= (int) Math.random()*100;
            System.out.println(n5);
            //for randome number between 0 and 1
            Math.random();

            // if else statements
            int x= 5;
            int y= 7;
            if (x>3 && x<y)
            {
                System.out.println(" Suiiii");
            }
            else{
                System.out.println("messi goallllll......");
            }


            /*
                        int time= 9;
            if (time>9)
            {
                System.out.println("Good Morning !");
            }
            else
            {
                System.out.println("Good Evening !");
            }
             */

            int time=9;
            String result= (time>10)?   "Good Morning !":"Good Evening !";
            System.out.println(result);


            // For loops
            for (int i=1; i<=2;i++)
            {
                System.out.println("Grape"+i);
            }

            //For-Each loop
            String [] cars= {"Toyota", "Bugatti", "Marc","BMW"} ;
            for (String i:cars)
            {
                System.out.println(i);
            }

            //Break And Continue
            for (int i=0;i<=10;i++)
            {
                if(i==4)
                    break;
                System.out.println(i);
            }
            for (int i=0;i<=10;i++)
            {
                if (i==4)
                    continue;
                System.out.println(i);
            }

            //While Loop
            n5=0;
            while (n5<=6)
            {
                System.out.println(n5);
                n5++;
                if (n5==4)
                    break;

            }
    }

}

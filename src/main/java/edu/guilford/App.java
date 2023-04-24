package edu.guilford;


public class App 
{
    //Test constructor with default values

    public static void main( String[] args )
    {
        Rational r1 = new Rational();
        System.out.println(r1.toString());

        //Test constructor with two arguments

        Rational r2 = new Rational(1, 2);
        System.out.println(r2.toString());

        //Test negate method

        r2.negate();
        System.out.println(r2.toString());
    }

    //test the constructor with custom values
    
}

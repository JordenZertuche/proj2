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

        //Test invert method

        r2.invert();

        //Test add method

        Rational r3 = new Rational(1, 3);
        Rational r4 = new Rational(1, 6);
        Rational r5 = r3.add(r4);
        System.out.println(r5.toString());

        //Test toDouble method

        System.out.println(r5.toDouble());
        
        //create a print warning if the constructor with parameter attempts to generate a rational number with a denominator of 0

        Rational r6 = new Rational(1, 0);
        System.out.println(r6.toString());


    }

    
}

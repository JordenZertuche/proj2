package edu.guilford;

public class Rational {
    //create two integer attributes that that strore the numerator and denominator
    private int numerator;
    private int denominator;

    //create a constructor that takes no arguments and sets the numerator to 0 and the denominator to 1

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    //create a toString method that displays a Rational object in a reasonable format

    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    //create a constructor that takes two arguments and uses them to initialize the attributes

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    //create a method that called negate that will reverse the sign of a rational number

    public void negate() {
        this.numerator = -this.numerator;
    }
    
    //create a method that simply modifes the existing attributes so that it will return with a void

    public void invert() {
        int temp = this.numerator;
        this.numerator = this.denominator;
        this.denominator = temp;
    }

    //create a method that is called invert and swaps the numerator and denominator 

    public Rational add(Rational r) {
        int newNumerator = this.numerator * r.denominator + r.numerator * this.denominator;
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    //write and instance method called toDouble that converts the rational number to a double (floating-point number) and returns the result

    public double toDouble() {
        return (double) this.numerator / this.denominator;
    }

    //this method does not modify the object

    public Rational subtract(Rational r) {
        int newNumerator = this.numerator * r.denominator - r.numerator * this.denominator;
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    //write an instance method that will reduce a rational number to its lowest terms by finding the common divisor (GCD) of the numerator and denominator and dividing through. 

}

package edu.guilford;

public class Rational {
    //create two integer attributes that that strore the numerator and denominator
    private int numerator;
    private int denominator;

    //create a constructor that takes no arguments and sets the numerator to 0 and the denominator to 1
    //this is a constructor that takes no arguments and sets the numerator to 0 and the denominator to 1
    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    //create a toString method that displays a Rational object in a reasonable format
    //this is a toString method that displays a Rational object in a reasonable format as it will return a string
    public String toString() {
        return this.numerator + "/" + this.denominator;
    }

    //create a constructor that takes two arguments and uses them to initialize the attributes
    //by doing this, you can create a rational number with a numerator and denominator
    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (denominator == 0)
                System.out.println("Warning: the Denominator can not be 0!!");
    }

    //create a method that called negate that will reverse the sign of a rational number
    //this here is a method that is called negate that will reverse the sign of a rational number
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
    //by doing this, you can invert a rational number
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

    //write an instance method that will reduce a rational number to its lowest terms by finding the common divisor (GCD) of the numerator and denominator and dividing through. This method should be a pure method; it should not modify the instance variables of the object.
    
    public Rational multiply(Rational r) {
        int newNumerator = this.numerator * r.numerator;
        int newDenominator = this.denominator * r.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    //create a method called add that takes a Rational number as an argument

    public Rational divide(Rational r) {
        int newNumerator = this.numerator * r.denominator;
        int newDenominator = this.denominator * r.numerator;
        return new Rational(newNumerator, newDenominator);
    }

    //add it to the rational number represented by the current object, and returns a new Rational object.

    public Rational reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        return new Rational(this.numerator / gcd, this.denominator / gcd);
    }

    private int gcd(int numerator2, int denominator2) {
        return 0;
    }

    //create several methods to add factions using the Rational class
    //by doing this, you can add two rational numbers and get a rational number back and so on
    public boolean equals(Rational r) {
        return this.numerator == r.numerator && this.denominator == r.denominator;
    }

    //create a method called equals that takes a Rational number as an argument and returns true if the invoking Rational object is equal to the argument, and false otherwise.
    //by doing this, you can compare two rational numbers and see if they are equal
    public int compareTo(Rational r) {
        int thisNumerator = this.numerator * r.denominator;
        int otherNumerator = r.numerator * this.denominator;
        return thisNumerator - otherNumerator;
    }

    //modify the constructor so that it takes no arguments and so that it generates a Rational number with random values for the numerator and denominator in the range of [-100, 100]. if there is an attempt to generate a Rational Number with a denominator of 0, the constructor should select a random new number.
    //this is a constructor that takes no arguments and generates a random rational number
    public Rational(int numerator, int denominator, boolean reduce) {
        this.numerator = numerator;
        this.denominator = denominator;
        if (reduce) {
            int gcd = gcd(this.numerator, this.denominator);
            this.numerator /= gcd;
            this.denominator /= gcd;
        }
    }

    //create a constructor that takes three arguments and uses them to initialize the attributes. The third argument should be a boolean that indicates whether the rational number should be reduced to lowest terms. If the third argument is true, the constructor should reduce the rational number to lowest terms. If the third argument is false, the constructor should not reduce the rational number to lowest terms.
    //reason for using logic given in the assigment was to make the constructor more flexible
    public Rational(double d) {
        String s = String.valueOf(d);
        int digitsDec = s.length() - 1 - s.indexOf('.');
        int denom = 1;
        for (int i = 0; i < digitsDec; i++) {
            d *= 10;
            denom *= 10;
        }
        int num = (int) Math.round(d);
        this.numerator = num;
        this.denominator = denom;
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    //create a constructor that takes a double as an argument and converts it to a rational number. You can assume that the double is not negative. Hint: you can use the Math.round method to convert a floating-point number to an integer.
    //by doing this, you can create a rational number from a double and then add it to another rational number
    public static Rational add(Rational r1, Rational r2) {
        int newNumerator = r1.numerator * r2.denominator + r2.numerator * r1.denominator;
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    //create a static method called add that takes two Rational numbers as arguments, and returns a new Rational object. The method should not modify the objects that it is invoked on.
    //this method does not modify the object
    public static Rational subtract(Rational r1, Rational r2) {
        int newNumerator = r1.numerator * r2.denominator - r2.numerator * r1.denominator;
        int newDenominator = r1.denominator * r2.denominator;
        return new Rational(newNumerator, newDenominator);
    }

}

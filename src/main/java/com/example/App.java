package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Simple simple = new Simple();
        
        simple.CalculateFibonnaci();

        simple.CalculateFibonnaciRecursive(10);

        System.out.println( "Hello World!" );
    }
}

package com.niit.numbergame;

public class NumberGame {


    public static void main(String[] args) {

        NumberGame numberGame = new NumberGame();


        // Declare a scanner here
        // Get the startValue and endValue value as integer from the console and store in variable 'startValue' and
        //'endValue'

        int startValue = 0;
        int endValue = 0;

        double count = numberGame.getSumOfCubes(startValue, endValue);
        System.out.println("Numbers whose sum of cubes of each digit of the number is equal to the number itself between " + startValue + " to " + endValue + " are::");
        System.out.println("Total count of numbers:: " + count);
    }

        // Function accepts start and end value of range as input parameters
        // and outputs all the values and count between them which are sum of cubes.
        public int getSumOfCubes ( int startValue, int endValue){

            return -1;
        }
    }


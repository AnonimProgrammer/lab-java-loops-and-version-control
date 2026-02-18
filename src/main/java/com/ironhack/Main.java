package com.ironhack;

public class Main {
    public static void main(String[] args) {
        // Task 1
        int[] numbers = {10, 5, 3, 8, 2};
        int difference = differenceBetweenMaxAndMin(numbers);
        System.out.println("Difference between max and min: " + difference);

        // Task 2
        int[] numbers2 = {45, 12, 78, 34, 89, 23};
        findTwoSmallest(numbers2);

        // Task 3
        double x = 3;
        double y = 4;
        double result = calculateExpression(x, y);
        System.out.println("Result of the expression: " + result);
    }

    public static int differenceBetweenMaxAndMin(int[] numbers) {
        // Validate an input array is not null and has at least one element
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be null or empty");
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        // Get maximum and minimum values from the array
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
            if (number < min) {
                min = number;
            }
        }

        return max - min;
    }

    public static void findTwoSmallest(int[] numbers) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        // Get the smallest and second smallest
        for (int number : numbers) {
            if (number < smallest) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }
        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static double calculateExpression(double x, double y) {
        return Math.pow(x, 2) + Math.pow((((4 * y) / 5) - x), 2);
    }
}

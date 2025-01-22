class Practical5 {

    // Factorial of a number using for loop
    int factorial1(int number) {
        if (number < 0) return -1; 
        if (number < 2) return 1;
        int factorial = 1;
        for (; number > 1; ) {
            factorial *= number--;
        }
        return factorial;
    }

    // Factorial of a number using while loop
    int factorial2(int number) {
        if (number < 0) return -1;
        if (number < 2) return 1;
        int factorial = 1;
        while (number > 1) {
            factorial *= number--;
        }
        return factorial;
    }

    // Factorial of a number without using looping statements
    int factorial3(int number) {
        if (number < 0) return -1;
        if (number < 2) return 1;
        return number * factorial3(number - 1);
    }

    // Function to calculate the sum of an array
    int getSum(int[] numbers) {
    if (numbers.length == 0) return 0;
    return numbers[0] + getSum(Arrays.copyOfRange(numbers, 1, numbers.length));
}

    // Main function
    public static void main(String[] args) {
        Practical5 obj = new Practical5(); // Create an instance of the class

        // Factorial examples
        System.out.println("Factorial using for loop: " + obj.factorial1(5));
        System.out.println("Factorial using while loop: " + obj.factorial2(5));
        System.out.println("Factorial using recursion: " + obj.factorial3(5));

        // Array sum example
        int[] numbers = {12, 34, 0, 22, 67, 34, 100};
        int totalSum = obj.getSum(numbers);
        System.out.println("The sum of the array is: " + totalSum);
    }
}



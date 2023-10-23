public class FirstHomework {
    public static void main(String[] args) {
        //1. Create a simple system.out app. Print info about the user that should be passed
        // to the main function as a parameter. Compile and run the program from the command
        // line using javac and java from JDK.

        if(args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println("Parameter " + (i + 1) + ": " + args[i]);
            }
        } else {
            System.out.println("You need to pass parameters in order to see the info");
        }

        //2. Sorting algorithm implementation.
        // Choose any from the list: Insertion sort, Selection sort, bubble sort, Merge sort, Quicksort.

        //Using Insertion Sort to sort numbers array

        int[] numbersArray = {3, 7, 5, 1, 10, 4};

        System.out.println("Before Insertion Sorting");
        showNumbersArray(numbersArray);

        for (int i = 1; i < numbersArray.length; i++) {
            int currentNumber = numbersArray[i];

            int previousPosition = i - 1;

            while (previousPosition >= 0 && numbersArray[previousPosition] > currentNumber) {
                numbersArray[previousPosition + 1] = numbersArray[previousPosition];
                previousPosition--;
            }

            numbersArray[previousPosition + 1] = currentNumber;
        }

        System.out.println("After Insertion Sorting:");
        showNumbersArray(numbersArray);
    }

    public static void showNumbersArray(int[] numbersArray) {
        for (int i = 0; i < numbersArray.length; i++) {
            System.out.println(numbersArray[i]);
        }
        System.out.println();
    }

}

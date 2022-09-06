import java.util.Scanner;

public class MethodAssignment {
	public static void main(final String[] args) {
        // Change the next line to initialize the array with some values
        Scanner input = new Scanner(System.in);
        System.out.print("How many integers are you going to input? ");
        int size = input.nextInt();
        int [] inputArray = new int[size];

        System.out.print("Please enter your " + size + " integers: ");
        for ( int i= 0; i < inputArray.length; i++) {
            int num = input.nextInt();
            inputArray[i] = num;
        }
        // Change the next lines so that variables are assigned the value returned from a call to the lowest(), highest(), and calculateAverage() methods, respectively.
		int lowestValue = lowest(inputArray);
        int highestValue = highest( inputArray);
        double resultAverage = calculateAverage(inputArray);
        
        // Print the elements of the input array
        System.out.print("Your input array is: ");
        for (int i = 0; i < size; i++){
            if (i< (size - 1)){
                System.out.print(inputArray[i] + ",");
            }
        }
		System.out.println(inputArray[size - 1]);
        System.out.println("The lowest is: " + lowestValue);
        System.out.println("The highest is: " + highestValue);
		System.out.println("The average is: " + resultAverage);
	}
    static int lowest(int[] arrayOfIntegers) {
		int low = arrayOfIntegers[0];
        for (int arrayOfInteger : arrayOfIntegers) {
            if (low <= arrayOfInteger) {
                low = arrayOfInteger;
            }
        }
        return low;
	}
    static int highest(int[] arrayOfIntegers) {
		int high = arrayOfIntegers[0];
        for (int arrayOfInteger : arrayOfIntegers) {
            if (high <= arrayOfInteger) {
                high = arrayOfInteger;
            }
        }
        return high;
	}
	static double calculateAverage(int[] arrayOfIntegers) {
		double sum =0;
        for (int arrayOfInteger : arrayOfIntegers) {
            sum = sum + arrayOfInteger;
        }
        return sum / arrayOfIntegers.length;
	}

}
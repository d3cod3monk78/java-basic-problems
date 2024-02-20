import java.util.Scanner;

public class OddNumberFilter {

	static int[] removeOddNumbers(int numberArray[]) {
		int newArray[] = new int[numberArray.length];
		int count = 0;

		for(int number : numberArray) {
			if(number % 2 == 0) {
				newArray[count++] = number;
			}
		}

		int tempArray[] = new int[count];

		for(int i = 0; i < count; i++) {
			tempArray[i] = newArray[i];
		}

		return tempArray;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("How many number you need to add : ");
		int arraySize = scan.nextInt();

		int numbers[] = new int[arraySize];

		System.out.println("Enter the numbers: ");
		for(int i = 0; i < arraySize; i++) {
			numbers[i] = scan.nextInt();
		}

		int modifiedArray[] = removeOddNumbers(numbers);

		for(int number : modifiedArray) {
			System.out.println(number);
		}
	}
}
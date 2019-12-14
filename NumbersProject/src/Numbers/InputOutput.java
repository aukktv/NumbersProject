package Numbers;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

/**
 * The class InputOutput is used to accept numbers from the console and store
 * them in an List called numbersList
 */
public class InputOutput {

	private Scanner scanner = new Scanner(System.in);
	private List<Integer> numbersList = new ArrayList<Integer>();
	private Calendar calendar = Calendar.getInstance();

	/**
	 * Public method inputOutput asks user to enter a number into the console and
	 * puts this numbers in an List. If user enters 0, the method completes the work
	 * and prints sum of all numbers divided by a number of today's day. Statement
	 * catch prevents a compilation error when a user enters a non-integer.
	 */
	public void inputOutput() {
		System.out.println("Enter several integers: ");
		while (true) {
			try {
				int input = scanner.nextInt();
				addToList(input);

				if (input == 0) {
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("That's not a integer!");
			}
			scanner.nextLine();
		}
		System.out.println(
				"The sum of all integers divided by a number of today's day is " + String.format("%.2f", counting()));
	}

	/**
	 * Private method addToList is used in the public method inputOutput(), to put
	 * numbers from console into an List. The method accepts the number entered by
	 * the user as a parameter.
	 * 
	 * @param input number entered by the user
	 */
	private void addToList(int input) {
		numbersList.add(input);
	}

	/**
	 * Private method counting is used in the public method inputOutput, to count
	 * sum of numbers from List and divides it by a number of today's day.
	 * 
	 * @return the result of counting as a float.
	 */
	private float counting() {
		int sum = 0;
		for (Integer element : numbersList) {
			sum += element;
		}
		int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
		return (float) sum / dayOfWeek;
	}

	/**
	 * Public method getNumbersList is used to get the field numbersList in another
	 * class.
	 * 
	 * @return numbersList.
	 */
	public List<Integer> getNumbersList() {
		return numbersList;
	}

}

package Numbers;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The class menu is used to allow the user to choose what they want to do with
 * the list.
 */
public class Meniu {

	Scanner scanner = new Scanner(System.in);
	InputOutput inputOutput = new InputOutput();
	Size size = new Size();
	Printing printing = new Printing();

	/**
	 * Public method getMeniu first calls the inputOutput method. With this help the
	 * user fills the list with numbers and gets their sum divided by a number of
	 * today's day. After that the user receives a menu from which they can select:
	 * get size of list (by typing 1 in console), printed list (by typing 2 in
	 * console) or exit the application (by typing 3 in console). Statement if
	 * prevents a logical error when a user enters an integer other than 1, 2 or 3.
	 * Statement catch prevents a compilation error when a user enters a
	 * non-integer.
	 */
	public void getMeniu() {

		inputOutput.inputOutput();
		System.out.println("======================");

		while (true) {
			try {
				System.out.println("Select:\n[1] size of list\n[2] printed list\n[3] quit ");
				int select = scanner.nextInt();

				if (select == 3) {
					System.out.println("Completed!");
					break;
				}

				if (select < 1 || select > 3) {
					System.out.println("Wrong choise!");
				}

				switch (select) {
				case 1:
					System.out.println("Size of list is " + size.size(inputOutput.getNumbersList()));
					System.out.println("");
					break;
				case 2:
					System.out.println("Printed list: ");
					printing.print(inputOutput.getNumbersList());
					System.out.println("");
					break;
				}

			} catch (InputMismatchException e) {
				System.out.println("Wrong choise!");
			}
			scanner.nextLine();
		}

	}
}

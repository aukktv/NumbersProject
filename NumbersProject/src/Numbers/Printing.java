package Numbers;

import java.util.List;

/**
 * The class Printing is used to print all list's items (except output number 0)
 * in the console.
 */
public class Printing {

	/**
	 * Public method print is used to print all list's items in the console. It
	 * accepts the integer list as parameter and prints all list's items in the
	 * console.
	 * 
	 * @param list list of integers
	 */
	public void print(List<Integer> list) {
		for (Integer element : list) {
			if (element != 0)
				System.out.print(element + " ");
		}
		System.out.println(" ");
	}

}

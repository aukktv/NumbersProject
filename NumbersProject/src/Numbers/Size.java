package Numbers;

import java.util.List;

/**
 * The class Size is used to get the list size.
 */
public class Size {

	/**
	 * Public method size is used to get the list size. It accepts the integer list
	 * as parameter and returns its size. -1 is used to exclude the output number 0
	 * from the list size.
	 * 
	 * @param list of integers
	 * 
	 * @return list size
	 */
	public int size(List<Integer> list) {
		return list.size() - 1;
	}
}

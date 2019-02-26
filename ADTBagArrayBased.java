import java.util.Random;

public class ADTBagArrayBased {
	Object[] bag;
	public ADTBagArrayBased() {
		this.bag = new Object[100];
	}
	/**
	 * Checks if the list is empty
	 * @return boolean if the list is empty
	 */
	public boolean isEmpty() {
		int count = 0;
		for (int i = 0; i < this.bag.length; i++) {
			if (this.bag[i] != null) {
				count = 1;
				break;
			}
		}
		return count == 0;
	}
	/**
	 * Checks if the list is full
	 * @return boolean if the list is full or not
	 */
	public boolean isFull() {
		int count = 0;
		for (int i = 0; i < this.bag.length; i++) {
			if (this.bag[i] != null) {
				count = 1;
				break;
			}
		}
		return count != 0;
	}
	
	/**
	 * Empties the list
	 */
	
	public void makeEmpty() {
		for (int i = 0; i < this.bag.length; i++) {
			if (this.bag[i] != null) {
				this.bag[i] = null;
			}
		}
	}
	
	/**
	 * Inserts an item into the list
	 * @param item An Object
	 */
	
	public void insert(Object item) {
		for (int i = 0; i < this.bag.length; i++) {
			if (this.bag[i] == null) {
				this.bag[i] = item;
				break;
			}
		}
	}
	
	/**
	 * Gets the size of the list
	 * @return an integer representing how many items are in the list
	 */
	
	public int size() {
		int count = 0;
		for (int i = 0; i < this.bag.length; i++) {
			if (this.bag[i] != null) {
				count++;
			}
		}
		return count;
	}
	
	/**
	 * Remove's the last item in the list
	 */
	
	public void removeLast() {
		if (this.size() > 0) {
			this.bag[this.size() - 1] = null;
		}
	}
	
	/**
	 * Removes a random item in the list
	 */
	
	public void removeRandom() {
		if (this.size() > 0) {
			Random rand = new Random();
			int num = rand.nextInt(this.size());
			this.bag[num] = null;
		}
	}
	
	/**
	 * Gets an object in the list and returns its index
	 * @param item The Object that's going to be compared
	 * @return integer representing the index
	 */
	
	public int get(Object item) {
		int index = -1;
		for (int i = 0; i < this.bag.length; i++) {
			if (this.bag[i].equals(item)) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	/**
	 * Gets an index and returns the corresponding object
	 * @param index an integer representing the index
	 * @return the Object at the specified index
	 */
	
	public Object get(int index) {
		return this.bag[index];
	}
}

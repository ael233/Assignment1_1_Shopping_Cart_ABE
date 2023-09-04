/**
 * 
 * @author Adam Elias
 *
 */
public interface OnlineShoppingCartInterface<T> {
	/** Gets the current number of entries in this bag.
	 * @return The integer number of entries currently in the online shopping cart. 
	*/
	public int getCurrentSize();
	
	/**See whether the online shopping cart is empty.
	 * @return True if the cart is empty, or false if not.
	 */
	public boolean isEmpty();
	
	/**Add a given object to the online shopping cart.
	 * @param anEntry the object to be added.
	 * @return True if the addition was successful, or false if not.
	 */
	public boolean add(T newEntry);
	
	/**Remove an unspecified object from the online shopping cart.
	 * @return Either the removed entry if the removal was successful, or null.
	 */
	public T remove();
	
	/**Remove one of a particular object from the online shopping cart, if possible.
	 * @param anEntry The entry to be removed.
	 * @return True if the removal was successful, or false if not.
	 */
	public boolean remove(T anEntry);
	
	/**Remove all items from the online shopping cart.
	 * 
	 */
	public void clear();
	
	/**Count the number of times a certain object occurs in the online shopping cart.
	 * @param anEntry The entry to be counted.
	 * @return The number of times anEntry appears in the shopping cart.
	 */
	public int getFrequencyOf(T anEntry);
	
	/**Test whether the online shopping cart contains a particular object.
	 * @param anEntry The entry to find.
	 * @return True if the entry is found in the shopping cart, false if not.
	 */
	public boolean contains(T anEntry);
	
	/**Retrieve all objects that are in the online shopping cart.
	 * @return A new array of all the entries in the online shopping cart.
	 * If the cart is empty, the returned array will be empty.
	 */
	public T[] toArray();
	
	/**Calculate total price of items in the shopping cart.
	 * @return total price
	 */
	public double totalPrice();
	
	/**Calculate total number of items in the online shopping cart.
	 * @return total number of items
	 */
	public int totalNumItems();
	
	/**Determine whether all items in cart can ship together.
	 * @return True if all items can ship together, false if not.
	 */
	public boolean shipTogether();
	
}//end OnlineShoppingCartInterface

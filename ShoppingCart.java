/**
 * A class that implements a shopping cart that instantiates a bag using the ArrayBag code from Carrano's ResizableArrayBag.
 * @author aelias2
 *
 */
public class ShoppingCart{
    private ResizableArrayBag<Item> bag; 

    /**
     * instantiates a bag as a new ResizableArrayBag.
     */
    public ShoppingCart() {
        bag = new ResizableArrayBag<>();
    }//end constructor

    /**
     * Retrieves the current number of items in the shopping cart.
     * @return getCurrentSize, which is the bag's size.
     */
    public int getCurrentSize() {
        return bag.getCurrentSize();
    }//end getCurrentSize

    /**
     * Determines whether the shopping cart is empty.
     * @return true if bag is empty, false if not.
     */
    public boolean isEmpty() {
        return bag.isEmpty();
    }//end isEmpty

    /**
     * Adds an item to the shopping cart.
     * @param newEntry, the item being added to the bag.
     * @return true if addition was successful, false if not.
     */
    public boolean add(Item newEntry) {
        return bag.add(newEntry);
    }//end add newEntry

    /**
     * Removes the last item added to the cart if there is something in it to remove.
     * @return The item that was removed, or null if nothing was in the cart.
     */
    public Item remove(){
        if (isEmpty()) {
            return null; // Cart is empty, nothing to remove
        }
        return bag.remove(); // Removes the last item from the cart
    }//end remove 

    /**
     * Removes a specific item from the shopping cart.
     * @param anEntry, the item to be added.
     * @return true if the item was added, false if not.
     */
    public boolean remove(Item anEntry) {
        return bag.remove(anEntry);
    }//end remove anEntry - removes a particular object

    /**
     * Clears the shopping cart.
     */
    public void clear() {
        bag.clear();
    }//end clear

    /**
     * Identifies the number of times a specified item is present in the shopping cart.
     * @param anEntry, the item of which the frequency is to be known.
     * @return the frequency, an integer
     */
    public int getFrequencyOf(Item anEntry) {
    	return bag.getFrequencyOf(anEntry);
    }//end getFrequencyOf

    /**
     * Determines whether a certain item is in the cart.
     * @param anEntry, the item to be tested.
     * @return true if the item is in the shopping cart, false if not.
     */
    public boolean contains(Item anEntry) {
        return bag.contains(anEntry);
    }//end contains

    /**
     * Converts the ArrayList to an array.
     * @return Item[], an array.
     */
    public Item[] toArray() {
        // Use toArray() on the ArrayList to convert it to an array
        return bag.toArray();
    }//end toArray

    /**
     * Determines the total price of the items in the shopping cart.
     * @return totalPrice, the total price of the items.
     */
    public double totalPrice() {
        double totalPrice = 0.0;
        for (Item item : bag.toArray()) {
        	totalPrice += item.getItemPrice();
        }
        return totalPrice; 
    }//end totalPrice

    /**
     * States the total number of items in teh shopping cart.
     * @return getCurrentSize, which is the total size of the shopping cart.
     */
    public int totalNumItems() {
        return bag.getCurrentSize();
    } //end totalNumItems
    
    /**
     * Determines whether all of the items in the shopping cart can ship together, if the total weight is below a given threshold.
     * @return true if all of the items can ship together, false if not.
     */
    public boolean shipTogether() {
        double maxWeightShipTogether = 30.0;
        double totalShipmentWeight = 0.0;
    	for (Item item : bag.toArray()) {
        	totalShipmentWeight += item.getItemWeight();
        }
        if (totalShipmentWeight > maxWeightShipTogether) {
        	return false;
        }else {
        	return true;
        }
        }//end shipTogether

    /**
     * Provides meaningful information about the overall contents of the shopping cart.
     */
	@Override
	public String toString() {
		return "total price of items in cart: " + totalPrice() + ", total number of items in cart: " + totalNumItems() + ", can all items all ship together? " + shipTogether();
	}//end toString

}//end class

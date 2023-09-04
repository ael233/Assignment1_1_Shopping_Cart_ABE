/**
 * A class that implements an item to be used by a shopping cart.
 * @author aelias2
 *
 */
public class Item {
	private int itemID;
	private String itemName;
	private double itemPrice;
	private String itemDescription;
	private boolean itemAvailability;
	private double itemWeight;
	
	/**
	 * Constructs an item with numerous parameters.
	 * @param itemID, the item's ID number.
	 * @param itemName, the item's name.
	 * @param itemPrice, the price of the item.
	 * @param itemDescription, the description of the item.
	 * @param itemAvailability, the availability of the item.
	 * @param itemWeight, the weight of the item.
	 */
	public Item(int itemID, String itemName, double itemPrice, String itemDescription, boolean itemAvailability, double itemWeight) {
		this.itemID = itemID;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.itemDescription = itemDescription;
		this.itemAvailability = itemAvailability;
		this.itemWeight = itemWeight;
	}//end preferred constructor

	/**
	 * Retrieves the item's ID number.
	 * @return itemID, the item's ID number.
	 */
	public int getItemID() {
		return itemID;
	}//end getItemID

	/**
	 * Sets the item ID number.
	 * @param itemID, the item's ID number.
	 */
	public void setItemID(int itemID) {
		this.itemID = itemID;
	}//end setItemID

	/**
	 * Retrieves the item name.
	 * @return itemName, the name of the item.
	 */
	public String getItemName() {
		return itemName;
	}//end getItemName

	/**
	 * Sets the item name.
	 * @param itemName, the name of the item.
	 */
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}//end setItemName

	/**
	 * Retrieves the item price.
	 * @return itemPrice, the price of the item.
	 */
	public double getItemPrice() {
		return itemPrice;
	}//end getItemPrice

	/**
	 * Sets the price of an item.
	 * @param itemPrice, the price assigned to the item.
	 */
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}//end setItemPrice

	/**
	 * Retrieves the item's description.
	 * @return itemDescription, the item's description.
	 */
	public String getItemDescription() {
		return itemDescription;
	}//end getItemDescription

	/**
	 * Sets the item's description.
	 * @param itemDescription, the item's description.
	 */
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}//end setItemDescription

	/**
	 * Determines whether the item is available.
	 * @return true if the item is available, false if not.
	 */
	public boolean isItemAvailable() {
		return itemAvailability;
	}//end isItemAvailability

	/**
	 * Sets the item's availability.
	 * @param itemAvailability  true if the item is available, false if not.
	 */
	public void setItemAvailability(boolean itemAvailability) {
		this.itemAvailability = itemAvailability;
	}//end setItemAvailability

	/**
	 * Retrieves the item's weight.
	 * @return itemWeight, the weight of the item.
	 */
	public double getItemWeight() {
		return itemWeight;
	}//end getItemWeight

	public void setItemWeight(double itemWeight) {
		this.itemWeight = itemWeight;
	}//end setItemWeight	

	/**
	 * Retrieves the toString for the class.
	 */
	@Override
	public String toString() {
		return "Item [itemID=" + itemID + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemDescription="
				+ itemDescription + ", itemAvailability=" + itemAvailability + ", itemWeight=" + itemWeight + "]";
	}//end toString	
	
}//end class

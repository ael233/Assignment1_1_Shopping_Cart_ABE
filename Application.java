/**
 * An application class that tests the online shopping cart class.
 * @author aelias2
 *
 */
public class Application {

	public static void main(String[] args) {
		/**
		 * Instantiating a new shopping cart, cartA.
		 */
		ShoppingCart cartA = new ShoppingCart();
		System.out.println(cartA.toString()); //at least shows there is a shopping cart
		
		/**
		 * Instantiating three new items to test.
		 */
		Item cheese = new Item(12345, "Cheddar", 4.99, "Cheddar cheese", true, 1.0); 
		Item guitar = new Item(99999, "Fender", 500.00, "Face-melting music machine", true, 10.0); 
		Item sweaterVest = new Item(87653, "ChandlerStyle Vest", 14.99, "A stylish sweater vest", true, 2.0); 
		Item meat = new Item(23155, "Turkey", 6.99, "Smoked turkey", true, 2.0); 
		Item unicornPowder = new Item(061414, "Unicorn Powder", 15.00, "Potion ingredient from unicorn horns", true, 0.3); 
		
		/**
		 * Testing isEmpty()
		 */
		System.out.println("Is the cart empty? " + cartA.isEmpty());
		
		/**
		 * Testing add()
		 */
		System.out.println("Adding cheese.");
		cartA.add(cheese);
		
		/**
		 * Testing getCurrentSize
		 */
		System.out.println("Current number of items in the cart: " + cartA.getCurrentSize());
		
		/**
		 * Adding more items and testing same methods as above.
		 */
		System.out.println("Adding meat");
		cartA.add(meat);
		System.out.println("Current number of items in the cart: " + cartA.getCurrentSize());
		cartA.add(meat);
		System.out.println("Meats are in the cart: " + cartA.getFrequencyOf(meat));
		System.out.println("Is the cart empty? " + cartA.isEmpty());
		
		/**
		 * Testing remove(anEntry)
		 */
		System.out.println("Removing meat");
		cartA.remove(meat);
		/**
		 * Testing getFrequencyOf(anEntry)
		 */
		System.out.println("Meats are in the cart: " + cartA.getFrequencyOf(meat));
		System.out.println("Current number of items in the cart: " + cartA.getCurrentSize());
		System.out.println("Is the cart empty? " + cartA.isEmpty());
		System.out.println("Adding a sweater vest.");
		cartA.add(sweaterVest);
		System.out.println("Current number of items in the cart: " + cartA.getCurrentSize());
		
		/**
		 * Testing remove()
		 */
		System.out.println("Removing an item");
		cartA.remove();
		System.out.println("Current number of items in the cart: " + cartA.getCurrentSize());
		
		/**
		 * Testing clear()
		 */
		System.out.println("Time to clear the cart!");
		cartA.clear();
		System.out.println("Current number of items in the cart: " + cartA.getCurrentSize());

		/**
		 * Testing contains(anEntry)
		 */
		System.out.println("Does the cart contain cheese? " + cartA.contains(cheese));
		System.out.println("Adding cheese again.");
		cartA.add(cheese);
		System.out.println("Does the cart contain cheese? " + cartA.contains(cheese));

		/**
		 * Testing toArray();
		 */
		cartA.add(meat);
		cartA.add(sweaterVest);
		cartA.add(guitar);
		System.out.println("Items in the cart: ");
		Item[] itemList = cartA.toArray();
		for (Item item : itemList) {
			System.out.println(item);
		}


		/**
		 * Testing totalPrice()
		 */
		int i = 0;
		while (i < 101) {
			cartA.add(cheese);
			i++;
		}
		System.out.println("Added 101 cheeses.  The total cost of the items in the cart is " + cartA.totalPrice());
		
		/**
		 * Testing totalNumItems
		 */
		System.out.println("Total number of items in the cart: " + cartA.totalNumItems());
		
		
		/**
		 * Testing shipTogether()
		 */
		System.out.println("Can all of this ship together in a single shipment? " + cartA.shipTogether());
		System.out.println("Let's reduce the items.");
		System.out.println("Clearing cart, adding just unicorn powder.");
		cartA.clear();
		cartA.add(unicornPowder);
		System.out.println("Can all of this ship together in a single shipment? " + cartA.shipTogether());

		/**
		 * General add/remove testing
		 */
		
		System.out.println("Generall add/remove testing.  Adding a bunch of stuff.");
		cartA.clear();
		cartA.add(meat);
		cartA.add(sweaterVest);
		cartA.add(guitar);
		cartA.add(cheese);
		cartA.add(meat);
		cartA.add(unicornPowder);
		System.out.println("Cart details: " + cartA.toString());
		itemList = cartA.toArray(); //using same itemList variable to which array was casted earlier
		for (Item item : itemList) {
			System.out.println(item);
		}
		
	}//end main

}//end class

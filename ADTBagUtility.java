import java.io.*;
import java.util.*;

public class ADTBagUtility {
	/**
	* Creates a bag of items, and change items in the bag, and displays items.
	*/
	public static void start(){
		 ADTBagArrayBased list = new ADTBagArrayBased();
		//Fill the bag.
		//A Scanner object must be used to read item information from a file.
		// File file = new File("Testing.txt");
		 //Items need to be created before they are put into the bag.
		fillList(list);
		//Display items in the bag.
		displayList(list);
	}
	/**
	* Stores items into a bag.
	* @param list A reference to a bag
	*/
	public static void fillList(ADTBagArrayBased list){
		System.out.println("Enter file name");
		Scanner input = new Scanner(System.in);
		String resp = input.next();
		input = new Scanner(ADTBagUtility.class.getResourceAsStream(resp));
		while (input.hasNextLine()) {
			String l = input.nextLine();
			System.out.println(l);
			list.insert(l);
		}
		System.out.println("Starting list. If at any time you see an index of -1, that means it isn't in the bag!");
		displayList(list);
		System.out.println("Eggs is in index: " + list.get("Eggs"));
		System.out.println("At index 3, there is: " + list.get(3));
		System.out.println("Removing last item in list. New List is");
		list.removeLast();
		displayList(list);
		System.out.println("Removing random item in list. New list is");
		list.removeRandom();
		displayList(list);
		System.out.println("Current list size is " + list.size());
		if (list.isEmpty()) {
			System.out.println("Currently the list is empty");
		} else if (list.isFull()) {
			System.out.println("Currently the list is full");
		} else {
			System.out.println("List is currently neither empty nor full");
		}
		System.out.println("Clearing the list!");
		list.makeEmpty();
		
	//add items into the bag and/or remove items from the bag.
	//All operations in ADT Bag design must be used/tested here.
	}
	/**
	* Displays items in the bag.
	* @param list A reference to a bag
	*/
	public static void displayList(ADTBagArrayBased list) {
		String text = "";
		for (Object val : list.bag) {
			if (val != null) {
				if (!text.equals("")) {
					text = text + ", " + val;
				} else {
					text = (String) val;
				}
			}
		}
		System.out.println("Items in bag: " + text);
	}
}

package com.epam.Designpattern;

import java.util.*;

public class iteratorDesignPattern {
	public static void main(String args[]) {
	Item i1 = new Item("PaniPuri", 10.00);
	Item i2 = new Item("PavBhaji", 50.00);

	Menu menu = new Menu();
	menu.addItem(i1);
	menu.addItem(i2);

	System.out.println("Displaying Menu:");
	Iterator<Item> iterator = menu.iterator();
	while (iterator.hasNext()) {
		Item item = iterator.next();
		System.out.println(item);
	}

	System.out.println("\nRemoving last item returned");
	iterator.remove();

	System.out.println("\nDisplaying Menu:");
	iterator = menu.iterator();
	while (iterator.hasNext()) {
		Item item = iterator.next();
		System.out.println(item);
	}

}

}

class Item {

	String name;
	 double price;

	public Item(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public String toString() {
		return name + ": $" + price;
	}
}

class Menu {

	List<Item> menuItems;

	public Menu() {
		menuItems = new ArrayList<Item>();
	}

	public void addItem(Item item) {
		menuItems.add(item);
	}

	public Iterator<Item> iterator() {
		return new MenuIterator();
	}

	class MenuIterator implements Iterator<Item> {
		int c = 0;

		@Override
		public boolean hasNext() {
			if (c >= menuItems.size()) 
				return false;
			 else 
				return true;
			
		}

		@Override
		public Item next() {
			return menuItems.get(c++);
		}

		@Override
		public void remove() {
			menuItems.remove(--c);
		}

	}
}
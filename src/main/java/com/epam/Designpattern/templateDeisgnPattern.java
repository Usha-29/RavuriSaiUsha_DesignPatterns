package com.epam.Designpattern;

abstract class BuildTemplate {
   public void buildHouse(){
		selectColour();
		build();
		System.out.println("House is built.\n");
	}

	public abstract void selectColour();
	
    public abstract void build();
}
class WoodHouse extends BuildTemplate {

	@Override
	public void build() {
		System.out.println("Building Wooden House");
	}
	@Override
	public void selectColour() {
		System.out.println("House colour is Pink");
	}
}
 class BambooHouse extends BuildTemplate {
	 @Override
	 public void build() {
			System.out.println("Building Wooden House");
		}
	 @Override
	public void selectColour() {
		System.out.println("House colour is White");
	}


}
public class templateDeisgnPattern {
	
public static void main(String[] args) {
		
		BuildTemplate houseType = new BambooHouse();

		houseType.buildHouse();
		
		houseType = new WoodHouse();
		
		houseType.buildHouse();
	}

}
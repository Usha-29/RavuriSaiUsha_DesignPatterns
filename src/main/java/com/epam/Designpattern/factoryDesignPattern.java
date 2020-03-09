package com.epam.Designpattern;

interface geometry
 {
    void properties();
 }

class Triangle implements geometry
{
  public void properties(){
      System.out.println("This is traingle and has 3 sides.");
   }
}

class Rectangle implements geometry
{
    public void properties() {
    	System.out.println("This is rectangle and has 4 sides.");
    }
}


public class factoryDesignPattern{

	public static void main(String args[])
	{
      Triangle t = new Triangle();
      t.properties();
      Rectangle r = new Rectangle();
      r.properties();
      
}
}

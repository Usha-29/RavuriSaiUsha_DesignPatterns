package com.epam.Designpattern;

 interface Colour {
		public void fillColour();
	
}
 
 abstract class Shape {
		
		 Colour colour;
		
		public Shape(Colour c){
			this.colour=c;
		}
		
		abstract public void fillColour();
		
}

 class Circle extends Shape{

		public Circle(Colour c) {
			super(c);
		}

		@Override
		public void fillColour() {
			System.out.print("Circle is in ");
			colour.fillColour();
		} 

}
	
 class Square extends Shape{

		public Square(Colour c) {
			super(c);
		}

		@Override
		public void fillColour() {
			System.out.print("Square is in ");
			colour.fillColour();
		} 

}
	 
class PurpleColour implements Colour{
            
	public void fillColour(){
			System.out.println("purple.");
		}
}
	 
class PinkColour implements Colour{
         public void fillColour(){
			System.out.println("pink.");
		}
}
	
public class BridgePattern {
 public static void main(String args[]) {
		Shape cir = new Circle(new PinkColour());
			cir.fillColour();
				
		Shape sq = new Square(new PurpleColour());
			sq.fillColour();
	}
}
	


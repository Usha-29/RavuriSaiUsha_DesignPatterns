package com.epam.Designpattern;

interface Dosa
{
   public String makeDosa();
}

class PlainDosa implements Dosa
{
    @Override
    public String makeDosa(){
       return "Plain Dosa: ";
    }
}


abstract class DosaDecorator implements Dosa{

     Dosa dosa;

     public DosaDecorator( Dosa dosa ){
             this.dosa = dosa;
     }

     public String makeDosa(){
         return dosa.makeDosa();
     }
}

class PaneerDosaDecorator extends DosaDecorator{

    public PaneerDosaDecorator( Dosa dosa ){
            super(dosa);
    }

    public String makeDosa(){
          return dosa.makeDosa() + " Paneer added";
    }

}
class CheeseDosaDecorator extends DosaDecorator{

    public CheeseDosaDecorator( Dosa dosa ){
            super(dosa);
    }

    public String makeDosa(){
          return dosa.makeDosa() + " Cheese added";
    }

}

class MasalaDosaDecorator extends DosaDecorator{

    public MasalaDosaDecorator( Dosa dosa ){
            super(dosa);
    }

    public String makeDosa(){
          return dosa.makeDosa() + " Masala added";
    }

}

public class decoratorPattern {

	public static void main(String args[]) {
		 PlainDosa pd = new PlainDosa();
		 String plaindosa = pd.makeDosa();
		 

		 String onionDosa = new PaneerDosaDecorator(pd).makeDosa();
		 System.out.println(onionDosa + " using PaneerDosaDecorator");
		 
		 String cheeseDosa = new CheeseDosaDecorator(pd).makeDosa();
		 System.out.println(onionDosa + " using CheeseDosaDecorator");

		 String masalaDosa = new MasalaDosaDecorator(pd).makeDosa();
		 System.out.println(masalaDosa + " using MasalaDosaDecorator");
	}
}


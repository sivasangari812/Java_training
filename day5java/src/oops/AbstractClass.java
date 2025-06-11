package oops;

public abstract class AbstractClass {
      abstract int buySoap();
      
       @SuppressWarnings("unused")
	int buyPerfume() {
    	   int amount = 100;
    	   String name = "Chocolate Musk";
    	   int productCost = 80;
    	   int balance = amount-productCost;
    	   return balance;
       }
}

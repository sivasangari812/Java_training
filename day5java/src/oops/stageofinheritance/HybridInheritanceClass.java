package oops.stageofinheritance;

class Hparents {
 void parentMethod() {
     System.out.println("Parent class method");
 }
}


class Hparent1 {
 void parent1Method() {
     System.out.println("Parent1 class method");
 }	
}


class Hparent2 {
 void parent2Method() {
     System.out.println("Parent2 class method");
 }
}


interface Hchilds {
 void child1Method();
}


interface Hchild {
 void child2Method();
}


public class HybridInheritanceClass extends Hparent implements Hchilds, Hchild {

 public void child1Method() {
     System.out.println("Child1 method");
 }

 
 public void child2Method() {
     System.out.println("Child2 method");
 }

 public static void main(String[] args) {
     HybridInheritanceClass obj = new HybridInheritanceClass();
     obj.parentMethod();
     obj.child1Method();
     obj.child2Method();
 }


private void parentMethod() {
	// TODO Auto-generated method stub
	
}
}

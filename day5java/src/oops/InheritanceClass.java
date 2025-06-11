package oops;

class parent{
    String haircolor = "Black";
    
    void behaviour() {
    	System.out.println("Attitude");
    }
}
class child extends parent{
	String hairColor = "Cyan";
public void behaviour() {
    	System.out.println("Less Attitude");
    }
}
public class InheritanceClass {
	public static void main(String[]args) {
    parent obj = new child();
    obj.behaviour();
}
}
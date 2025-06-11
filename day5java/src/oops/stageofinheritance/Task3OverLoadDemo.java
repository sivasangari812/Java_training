package oops.stageofinheritance;

public class Task3OverLoadDemo {
   public int sum(int a, int b) {
      return a+b;
   }
   public double sum(double a,double b) {
	   return a+b;
   }
   public static void main(String[]agrs) {
	   Task3OverLoadDemo obj = new Task3OverLoadDemo();
	   System.out.println("sum of ints:"+obj.sum(10,20));
	   System.out.println("sum of doubles:"+obj.sum(5,10));
	   
   }
}

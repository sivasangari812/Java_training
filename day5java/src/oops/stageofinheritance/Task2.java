package oops.stageofinheritance;

public class Task2 {
         static class person {
        	 String name;
        	 int age;
        	 person(String name, int age){
        		 this.name = name;
        		 this.age = age;
        	 }
        	 void displayPerson() {
        		 System.out.println("Name:"+name);
        		 System.out.println("Age:"+age);
        	 }
         }
         static class Employee extends person{
        	 double basicSalary;
        	 Employee(String name,int age, double basicaSalary){
        	 super(name,age);
        	 this.basicSalary = basicSalary;
        	 }
        	 double calculatesalary() {
        		 double hra = 0.1 * basicSalary;
        		 double da = 0.05 * basicSalary;
        		 return basicSalary + hra + da;
        	 }
        		 void displayEmployee() {
        			 displayPerson();
        			 System.out.println("Basic Salary:"+basicSalary);
        			 System.out.println("Total Salary:"+calculatesalary());
        		 }
        		 public static void main(String[]args) {
        			 Employee emp = new Employee("siva",19,20000);
        			 emp.displayEmployee();
        		 }
        	 }
         }
        		 
        		
    
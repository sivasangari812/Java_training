package Collections;

import java.util.ArrayList;
public class ArrayListClass {
    
	public static void main(String[]agrs) {
		int[] arr = new int[5];
		arr[0] = 10;
		ArrayList<Integer> alist = new ArrayList<>(100);
		// wrapper class int-integer float-float double-double long-long
		alist.add(10);
		alist.add(20);
		alist.add(30);
		alist.add(2,40);
		alist.remove(1);
		System.out.println(alist.reversed());
		System.out.println(alist.contains(100));
		System.out.println(alist.size());
		System.out.println(alist);
	}
}

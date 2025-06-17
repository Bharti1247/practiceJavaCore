package com.learn.compare;

import java.util.Arrays;

public class TestComparatorComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {34, 56, 23, 12, 65};
		Arrays.sort(arr);
		for (int ele : arr) System.out.print(ele + ", ");
		System.out.println();
		
		Employee[] emp = new Employee[5];
		emp[0] = new Employee(34, "Neha");
		emp[1] = new Employee(56, "Riya");
		emp[2] = new Employee(23, "Priya");
		emp[3] = new Employee(12, "Ram");
		emp[4] = new Employee(65, "Sneha");
		
		Arrays.sort(emp); //comparable -> natural sorting
		for (Employee e : emp) System.out.println(e);
		
		// sorting via name using Comparator
		Arrays.sort(emp, Employee.NameComparator);
		System.out.println(Arrays.toString(emp));
	}

	

}

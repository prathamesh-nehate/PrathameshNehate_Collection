package com.epam.collection.CustomList;

public class mainDemo {
	public static void main(String[] args) {
		

		CustomEmployeeList el = new CustomEmployeeList() ;
        
        el.addEmployee(101,"Prathamesh Nehate","System Engineer",100000);
        el.addEmployee(102,"Pratik Sapre","System Engineer",100000);
        el.addEmployee(103,"Aditya Utpat","System Engineer",100000);
        el.addEmployee(104,"Ashwin Engineer","System Engineer",100000);
        el.addEmployee(105,"Yash Shah","System Engineer",100000);

        System.out.println("Displaying all Employee records :");
        System.out.println(el);
		System.out.println("---------------------------------------------------------------------------------------------");
		
        Employee e = el.getEmployee(103);
        System.out.println(e);
		System.out.println("---------------------------------------------------------------------------------------------");
		

		el.removeEmployee(104);
		System.out.println("---------------------------------------------------------------------------------------------");
	
        System.out.println("Displaying all Employee records :");
        System.out.println(el);
        
		
	}

}

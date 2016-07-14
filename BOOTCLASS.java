package com.flp.ems.view;
import java.util.Scanner;
 
public class BOOTCLASS {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	System.out.println("\n 1.ADD EMPLOYEE \n 2.MODIFY EMPLOYEE \n 3.REMOVE EMPLOYEE \n 4.SEARCH EMPLOYEE \n 5.GET all EMPLOYEE");
	int a=sc.nextInt();
	menuselection (a);
	}
	static void menuselection(int a){
		switch(a){
		case 1:UserInteraction.addEmployee();
		break;
	
		case 2:UserInteraction.modifyEmployee();
		break;
		
		case 3:UserInteraction.removeEmployee();
		break;
		
		case 4:UserInteraction.searchEmployee();
		break;
		
		case 5:UserInteraction.getallEmployee();
		break;
		}
		}
	
	
	
	
	
	
		

	}

}

package com.ya;

import java.util.Scanner;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};

	public void searchOutdatedModel(String companyname ) {
		
		if(companyname == "note4") {
			System.out.println("note4_OUTDATED");
		}
		else if(companyname == "note5") {
			System.out.println("note5_OUTDATED");
		}
		else if(companyname == "note6") {
			System.out.println("note6_OUTDATED");
		}
		else if(companyname == "note7") {
			System.out.println("note7_OUTDATED");
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a companyname");
		String name = scan.nextLine();
		
		scan.close();
		Mobile k1 = new Mobile();
		k1.searchOutdatedModel(name);
		
		
	}
}

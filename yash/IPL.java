package com.yash;

import java.util.Scanner;

public class IPL {

	void  homeTeamStadium(Stadium stadium) {
		if(stadium == EDEN_GARDENS_STADIUM) {
			System.out.println("This is the home ground of KKR");
		}
		else if(stadium == WANKHEDE_STADIUM){
			System.out.println("This is the home ground of Mumbai Indians");
		}
		else if(stadium == CHIDAMBARAM_STADIUM) {
			System.out.println("This is the home ground of CSK");
		}
		else if(stadium == M_CHINNASWAMY_STADIUM){
			System.out.println("This is the home ground of RCB");
		}
		
	}
	
	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter stadium name");
		
		String ground = scan.next();
		IPL k1 = new IPL();
		k1.homeTeamStadium(new Stadium());
		
		
	}
}

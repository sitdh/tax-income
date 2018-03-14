package com.sitdh.thesis.example.navigation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApplicationNavigator {
	
	private String menuTitle;
	
	private List<Navigator> menuList;

	public ApplicationNavigator(String menuTitle) {
		this.menuTitle = menuTitle;
		
		this.menuList = new ArrayList<Navigator>();
	}
	
	public void appendMenuList(Navigator nav) {
		this.menuList.add(nav);
	}
	
	public void appearMenu() {
		int i = 1;
		
		Scanner choiceScan = new Scanner(System.in);
		System.out.println(menuTitle);
		System.out.println();
		for(Navigator nav : menuList) {
			System.out.println(String.format("%s. %s", i, nav.getNavigationName()));
			i++;
		}
		System.out.println("0. Quit");
		System.out.println();
		System.out.print("Choose one from above: ");
		
		int selection = choiceScan.nextInt();
	}

	public String getMenuTitle() {
		return menuTitle;
	}

	public List<Navigator> getMenuListing() {
		// TODO Auto-generated method stub
		return menuList;
	}

}

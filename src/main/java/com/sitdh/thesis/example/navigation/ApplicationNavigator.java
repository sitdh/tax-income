package com.sitdh.thesis.example.navigation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sitdh.thesis.example.runnable.ApplicationRunnable;

public class ApplicationNavigator {
	
	private String menuTitle;
	
	private List<ApplicationRunnable> menuList;

	public ApplicationNavigator(String menuTitle) {
		this.menuTitle = menuTitle;
		
		this.menuList = new ArrayList<ApplicationRunnable>();
	}
	
	public void appendMenuList(ApplicationRunnable nav) {
		this.menuList.add(nav);
	}
	
	@SuppressWarnings("resource")
	public int appearMenu() {
		int i = 1;
		
		Scanner choiceScan = new Scanner(System.in);
		
		System.out.println(menuTitle);
		System.out.println();
		
		for(ApplicationRunnable nav : menuList) {
			System.out.println(String.format("%s. %s", i, nav.getNavigationName()));
			i++;
		}
		
		System.out.println("0. Quit");
		System.out.println();
		System.out.print("Choose one from above: ");
		
		return choiceScan.nextInt();
	}

	public String getMenuTitle() {
		return menuTitle;
	}

	public List<ApplicationRunnable> getMenuListing() {
		// TODO Auto-generated method stub
		return menuList;
	}

}

package com.sitdh.thesis.example;

import com.sitdh.thesis.example.navigation.ApplicationNavigator;
import com.sitdh.thesis.example.navigation.Navigator;

public class TaxableIncome {

	public static void main(String[] args) {
		ApplicationNavigator navigator = new ApplicationNavigator("TITLE");
		
		Navigator nav = new Navigator() {

			public String getNavigationName() {
				return "Hello";
			}

			public void runnable() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		navigator.appendMenuList(nav);
		navigator.appendMenuList(nav);
		navigator.appendMenuList(nav);
		navigator.appendMenuList(nav);
		
		navigator.appearMenu();

	}

}

package com.sitdh.thesis.example;

import java.util.List;

import com.sitdh.thesis.example.navigation.ApplicationNavigator;
import com.sitdh.thesis.example.runnable.ApplicationRunnable;

public class TaxableApplication {
	
	private List<ApplicationRunnable> nav;
	
	private ApplicationNavigator appNav;
	
	public TaxableApplication() {
		appNav = new ApplicationNavigator("Application launcher");
		this.prepareForApplicationMenu();
	}
	
	public void run() {
		int menuSelect = 0;
		
		do {
			menuSelect = appNav.appearMenu();
			
			if (menuSelect != 0) {
				nav.get(menuSelect - 1).run();
			}
		} while(menuSelect != 0);
	}
	
	private void prepareForApplicationMenu() {
		
	}

}

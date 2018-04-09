package com.sitdh.thesis.example.runnable;

public class UserInformationCollectorRunnable implements ApplicationRunnable {
	
	private String appTitle;
	
	public UserInformationCollectorRunnable(String appTitle) {
		this.appTitle = appTitle;
	}
	
	public String getNavigationName() {
		return this.appTitle;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}

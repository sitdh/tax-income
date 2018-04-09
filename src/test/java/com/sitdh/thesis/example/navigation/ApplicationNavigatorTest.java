package com.sitdh.thesis.example.navigation;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sitdh.thesis.example.runnable.ApplicationRunnable;

public class ApplicationNavigatorTest {
	
	private ApplicationNavigator appNav;

	@Before
	public void setUp() throws Exception {
		this.appNav = new ApplicationNavigator("Hello");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void menuTitle() {
		assertThat(appNav.getMenuTitle(), is("Hello"));
	}
	
	@Test
	public void numberOfMenuListing() {
		assertEquals(0, appNav.getMenuListing().size());
		
		ApplicationRunnable nav = mock(ApplicationRunnable.class);
		when(nav.getNavigationName()).thenReturn("Hello");
		
		appNav.appendMenuList(nav);
		
		assertEquals(1, appNav.getMenuListing().size());
		assertEquals("Hello", appNav.getMenuListing().get(0).getNavigationName());
	}

}

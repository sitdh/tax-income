package com.sitdh.thesis.example.entity;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class UserInformationTest {

	private UserInformation userInfo;

	@Before
	public void setUp() throws Exception {
		userInfo = new UserInformation("John", "Doe", "1234567890123");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void usernameManipulation() {
		assertThat(userInfo.getFullname())
			.isEqualTo("John Doe");
	}
	
	@Test
	public void generalInformation() {
		assertThat(userInfo.getGeneralInformation())
			.isEqualTo(String.format("%s %s #%s", "John", "Doe", "1234567890123"));
	}

}

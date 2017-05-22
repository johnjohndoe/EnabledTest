package com.example.enabledtest;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class MyLogicTest {

	@Mock MyPreferences_ preferences;

	private MyLogic logic;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		logic = new MyLogic();
		logic.preferences = preferences;
	}

	@Test
	public void isEnabled() throws Exception {
//		when(logic.preferences.enabled().get()).thenReturn(true);
		logic.init(false);
		assertThat(logic.isEnabled()).isTrue();
	}

}

package com.example.enabledtest;

import org.androidannotations.api.sharedpreferences.BooleanPrefField;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;


@RunWith(MockitoJUnitRunner.class)
public class MyLogicTest {

	boolean enabledOld = false;
	boolean enabledNew = true;

	@Mock BooleanPrefField enabledPrefField;
	@Mock MyPreferences_   preferences;

	private MyLogic logic;


	@Before
	public void setUp() throws Exception {
		logic = new MyLogic();
		logic.preferences = preferences;
	}

	@Test
	public void isEnabled() throws Exception {
		when(preferences.enabled()).thenReturn(enabledPrefField);
		when(enabledPrefField.get()).thenReturn(enabledOld);
		doNothing().when(enabledPrefField).put(anyBoolean());

		logic.init(enabledNew);

		assertThat(logic.isEnabled()).isEqualTo(enabledNew);
	}

}

package com.example.enabledtest;


import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.sharedpreferences.Pref;
import org.androidannotations.api.sharedpreferences.BooleanPrefField;

@SuppressWarnings("WeakerAccess")
@EBean(scope = EBean.Scope.Singleton)
public class MyLogic {

	@Pref protected MyPreferences_ preferences;

	private boolean enabled;

	public void init(boolean enabled) {
		initValues();
		this.enabled = enabled;
		storeValues();
	}

	public boolean isEnabled() {
		return enabled;
	}

	private void initValues() {
		BooleanPrefField enabledPrefField = preferences.enabled();
		this.enabled = enabledPrefField.get();
	}

	private void storeValues() {
		preferences.enabled().put(enabled);
	}

}

package com.example.enabledtest;

import org.androidannotations.annotations.sharedpreferences.DefaultBoolean;
import org.androidannotations.annotations.sharedpreferences.SharedPref;

@SharedPref(value = SharedPref.Scope.UNIQUE)
public interface MyPreferences {

	@DefaultBoolean(false)
	boolean enabled();

}

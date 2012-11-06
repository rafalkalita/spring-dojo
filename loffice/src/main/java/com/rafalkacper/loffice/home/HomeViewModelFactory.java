package com.rafalkacper.loffice.home;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class HomeViewModelFactory {

	public HomeViewModel build(Locale locale) {
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		return new HomeViewModel("home", "Rockin!", formattedDate);
	}
}

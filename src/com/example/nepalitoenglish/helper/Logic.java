package com.example.nepalitoenglish.helper;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;

import android.content.Context;
import android.widget.TextView;

public class Logic {

	HashMap<Integer, int[]> nepaliMap;
	Context context;
	TextView textView;

	public Logic(Context context, TextView show) {
		this.context = context;
		this.textView = show;
		putData();
	}

	public void putData() {
		nepaliMap = new HashMap<Integer, int[]>();
		nepaliMap.put(2000, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2001, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2002, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2003, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2004, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2005, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2006, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2007, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2008, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 29, 31 });
		nepaliMap.put(2009, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2010, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2011, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2012, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 30, 30 });
		nepaliMap.put(2013, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2014, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2015, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2016, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 30, 30 });
		nepaliMap.put(2017, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2018, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2019, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2020, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2021, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2022, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 30 });
		nepaliMap.put(2023, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2024, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2025, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2026, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2027, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2028, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2029, new int[] { 0, 31, 31, 32, 31, 32, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2030, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2031, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2032, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2033, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2034, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2035, new int[] { 0, 30, 32, 31, 32, 31, 31, 29, 30, 30,
				29, 29, 31 });
		nepaliMap.put(2036, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2037, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2038, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2039, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 30, 30 });
		nepaliMap.put(2040, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2041, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2042, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2043, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 30, 30 });
		nepaliMap.put(2044, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2045, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2046, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2047, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2048, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2049, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 30 });
		nepaliMap.put(2050, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2051, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2052, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2053, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 30 });
		nepaliMap.put(2054, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2055, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2056, new int[] { 0, 31, 31, 32, 31, 32, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2057, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2058, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2059, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2060, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2061, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2062, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2063, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2064, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2065, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2066, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 29, 31 });
		nepaliMap.put(2067, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2068, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2069, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2070, new int[] { 0, 31, 31, 31, 32, 31, 31, 29, 30, 30,
				29, 30, 30 });
		nepaliMap.put(2071, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2072, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2073, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 31 });
		nepaliMap.put(2074, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2075, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2076, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 30 });
		nepaliMap.put(2077, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 29, 31 });
		nepaliMap.put(2078, new int[] { 0, 31, 31, 31, 32, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2079, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 29, 30,
				29, 30, 30 });
		nepaliMap.put(2080, new int[] { 0, 31, 32, 31, 32, 31, 30, 30, 30, 29,
				29, 30, 30 });
		nepaliMap.put(2081, new int[] { 0, 31, 31, 32, 32, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2082, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2083, new int[] { 0, 31, 31, 32, 31, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2084, new int[] { 0, 31, 31, 32, 31, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2085, new int[] { 0, 31, 32, 31, 32, 30, 31, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2086, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2087, new int[] { 0, 31, 31, 32, 31, 31, 31, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2088, new int[] { 0, 30, 31, 32, 32, 30, 31, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2089, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 30, 30 });
		nepaliMap.put(2090, new int[] { 0, 30, 32, 31, 32, 31, 30, 30, 30, 29,
				30, 30, 30 });

	}

	public void nepaliToEnglish(int year, int month, int day) {
		int startingNepYear = 2000;
		int startingNepMonth = 1;
		int startingNepDay = 1;
		int dayOfWeek = Calendar.WEDNESDAY;

		int startingEngYear = 1943;
		int startingEngMonth = 4;
		int startingEngDay = 14;

		// nepali year to convert
		int nepYear = year;
		int nepMonth = month;
		int nepDay = day;

		long totalNepDaysCount = 0;

		// count total days in-terms of year
		for (int i = startingNepYear; i < nepYear; i++) {
			for (int j = 1; j <= 12; j++) {
				totalNepDaysCount += nepaliMap.get(i)[j];
			}
		}

		// count total days in-terms of month
		for (int j = startingNepMonth; j < nepMonth; j++) {
			totalNepDaysCount += nepaliMap.get(nepYear)[j];
		}

		// count total days in-terms of date
		totalNepDaysCount += nepDay - startingNepDay;

		int[] daysInMonth = new int[] { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30,
				31, 30, 31 };
		int[] daysInMonthOfLeapYear = new int[] { 0, 31, 29, 31, 30, 31, 30,
				31, 31, 30, 31, 30, 31 };

		int engYear = startingEngYear;
		int engMonth = startingEngMonth;
		int engDay = startingEngDay;

		int endDayOfMonth = 0;

		while (totalNepDaysCount != 0) {
			if (isLeapYear(engYear)) {
				endDayOfMonth = daysInMonthOfLeapYear[engMonth];
			} else {
				endDayOfMonth = daysInMonth[engMonth];
			}
			engDay++;
			dayOfWeek++;
			if (engDay > endDayOfMonth) {
				engMonth++;
				engDay = 1;
				if (engMonth > 12) {
					engYear++;
					engMonth = 1;
				}
			}
			if (dayOfWeek > 7) {
				dayOfWeek = 1;
			}
			totalNepDaysCount--;
		}

		String send_month = sendEnglishMonth(engMonth);
		String send_day = sendDate(dayOfWeek);

		textView.setText(String.valueOf(engYear) + "/" + send_month + "/"
				+ String.valueOf(engDay) + "; Day : " + send_day);

	}

	public static boolean isLeapYear(int year) {
		if (year % 100 == 0) {
			return year % 400 == 0;
		} else {
			return year % 4 == 0;
		}
	}

	public void englishToNepali(int year, int month, int day) {
		int startingEngYear = 1943;
		int startingEngMonth = 4;
		int startingEngDay = 14;
		int dayOfWeek = Calendar.WEDNESDAY;

		int startingNepYear = 2000;
		int startingNepMonth = 1;
		int startingNepDay = 1;

		// english date to be converted
		int engYear = year;
		int engMonth = month;
		int engDay = day;

		Calendar currentEngDate = new GregorianCalendar();
		currentEngDate.set(engYear, engMonth, engDay);

		Calendar baseEngDate = new GregorianCalendar();
		baseEngDate.set(startingEngYear, startingEngMonth, startingEngDay);

		long totalEngDaysCount = daysBetween(baseEngDate, currentEngDate);

		int nepYear = startingNepYear;
		int nepMonth = startingNepMonth;
		int nepDay = startingNepDay;

		while (totalEngDaysCount != 0) {
			int daysInIthMonth = nepaliMap.get(nepYear)[nepMonth];
			nepDay++;

			if (nepDay > daysInIthMonth) {
				nepMonth++;
				nepDay = 1;
			}
			if (nepMonth > 12) {
				nepYear++;
				nepMonth = 1;
			}

			dayOfWeek++; // count the days in terms of 7 days
			if (dayOfWeek > 7) {
				dayOfWeek = 1;
			}

			totalEngDaysCount--;
		}

		String send_day = sendDate(dayOfWeek);
		String send_month = sendNepaliMonth(nepMonth);

		textView.setText(String.valueOf(nepYear) + "/" + send_month + "/"
				+ String.valueOf(nepDay) + "; Day : " + send_day);

	}

	private long daysBetween(Calendar startDate, Calendar endDate) {
		// TODO Auto-generated method stub
		Calendar date = (Calendar) startDate.clone();
		long daysBetween = 0;
		while (date.before(endDate)) {
			date.add(Calendar.DAY_OF_MONTH, 1);
			daysBetween++;
		}
		return daysBetween;
	}

	public String sendEnglishMonth(int month) {
		String englishMonth = "";
		switch (month) {
		case 1:
			englishMonth = "January";
			break;
		case 2:
			englishMonth = "Feburary";
			break;
		case 3:
			englishMonth = "March";
			break;
		case 4:
			englishMonth = "April";
			break;
		case 5:
			englishMonth = "May";
			break;
		case 6:
			englishMonth = "June";
			break;
		case 7:
			englishMonth = "July";
			break;
		case 8:
			englishMonth = "August";
			break;
		case 9:
			englishMonth = "September";
			break;
		case 10:
			englishMonth = "October";
			break;
		case 11:
			englishMonth = "November";
			break;
		case 12:
			englishMonth = "December";
			break;
		}
		return englishMonth;
	}

	public String sendNepaliMonth(int month) {
		String nepaliMonth = "";

		switch (month) {
		case 1:
			nepaliMonth = "बैशाख";
			break;
		case 2:
			nepaliMonth = "जेठ";
			break;
		case 3:
			nepaliMonth = "असार";
			break;
		case 4:
			nepaliMonth = "साउन";
			break;
		case 5:
			nepaliMonth = "भदौ";
			break;
		case 6:
			nepaliMonth = "असोज";
			break;
		case 7:
			nepaliMonth = "कार्तिक";
			break;
		case 8:
			nepaliMonth = "मंसिर";
			break;
		case 9:
			nepaliMonth = "पुष";
			break;
		case 10:
			nepaliMonth = "माघ";
			break;
		case 11:
			nepaliMonth = "फाल्गुन";
			break;
		case 12:
			nepaliMonth = "चैत्र";
			break;
		}

		return nepaliMonth;
	}

	public String sendDate(int day) {
		String out_day = "";

		switch (day) {
		case 1:
			out_day = "Sunday";
			break;
		case 2:
			out_day = "Monday";
			break;
		case 3:
			out_day = "Tuesday";
			break;
		case 4:
			out_day = "Wednesday";
			break;
		case 5:
			out_day = "Thursday";
			break;
		case 6:
			out_day = "Friday";
			break;
		case 7:
			out_day = "Saturday";
			break;
		}

		return out_day;
	}

}

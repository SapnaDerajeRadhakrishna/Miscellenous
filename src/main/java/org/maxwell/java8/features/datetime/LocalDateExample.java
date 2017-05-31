package org.maxwell.java8.features.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class LocalDateExample {

	public static void main(String[] args) {
//		LocalDate today = LocalDate.now();
//		System.out.println("today is:" + today);
//		LocalDate firstDay_2014 = LocalDate.of(2014, Month.JANUARY, 1);
//		System.out.println("Specific Date=" + firstDay_2014);
//		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
//		System.out.println("Current Date in IST=" + todayKolkata);
//		LocalDate hundredDay2014 = LocalDate.ofYearDay(2014, 100);
//		System.out.println("100th day of 2014=" + hundredDay2014);

		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss", Locale.US);

		String strLocalDate = "2015-10-23T03:34:40";

		LocalDateTime localDate = LocalDateTime.parse(strLocalDate, formatter);
		
		LocalDateTime date = LocalDateTime.now();

		System.out.println(localDate);
		System.out.println(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss").format(localDate));
		System.out.println(DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(date));
		
		
		
		
		LocalDateTime date1 = LocalDateTime.now();
		System.out.println(DateTimeFormatter.ofPattern("yyyyMMddHHmmss.SSS").format(date1));
	}

}

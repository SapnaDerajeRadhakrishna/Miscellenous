package org.maxwell.java8.features.datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		//localTimeExamples();
		localDateTimeExamples();
	}

	private static void localTimeExamples() {
		LocalTime time = LocalTime.now();
		System.out.println("Current Time=" + time);
		LocalTime specificTime = LocalTime.of(12, 20, 25, 40);
		System.out.println("Specific Time of Day=" + specificTime);
		LocalTime timeKolkata = LocalTime.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Time in IST=" + timeKolkata);
		LocalTime specificSecondTime = LocalTime.ofSecondOfDay(10000);
		System.out.println("10000th second time= " + specificSecondTime);
	}

	private static void localDateTimeExamples() {
		LocalDateTime today = LocalDateTime.now();
		System.out.println("Current DateTime="+today);
		today = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println("Current DateTime="+today);
	}

}

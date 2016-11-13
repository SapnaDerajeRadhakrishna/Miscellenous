package org.maxwell.java8.features.datetime;

import java.time.Duration;
import java.time.Instant;

public class InstantExamples {

	public static void main(String[] args) {
		Instant timestamp = Instant.now();
		System.out.println("Current Timestamp = " + timestamp);

		Instant specificTime = Instant.ofEpochMilli(timestamp.toEpochMilli());
		System.out.println("Specific Time = " + specificTime);

		Duration thirtyDay = Duration.ofDays(30);
		System.out.println(thirtyDay.toHours());

	}

}

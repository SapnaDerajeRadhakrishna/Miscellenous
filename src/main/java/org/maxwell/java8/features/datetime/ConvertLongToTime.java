package org.maxwell.java8.features.datetime;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ConvertLongToTime {

	public static void main(String[] args) {
		long time = 1480929742222l;
		Date date = new Date(time);
		Format format = new SimpleDateFormat("yyyy MM dd HH:mm:ss");
		System.out.println(format.format(date));
	}

}

package org.maxwell.java8.features;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StringImpl {
	public static void main(String[] args) {
		String userName = "262015947002227";
		// int index = userName.indexOf("@");
		// String imsi = userName.substring(0, index);
		// System.out.println(imsi);

		String mcc = userName.substring(0, 3);
		String mnc = userName.substring(3, 5);
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("@ims.mnc0").append(mnc).append(".mcc").append(mcc).append(".3gppnetwork.org");
		System.out.println(stringBuffer.toString());

		// BufferedWriter out = new BufferedWriter(new FileWriter(new File("test"), true);

		try {
			FileWriter fw = new FileWriter(new File("test"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

package org.maxwell.random;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		String line = "<parmname=\"pushTokenRegUserName\"value=\"N_c846X0NVyPxpCJS-l0LVaNoiAboPqd5-Oiru88fxsCljbrDXEe6XEoDk4lFd1t\"/>";

		// System.out.println(line);
		Pattern pattern = Pattern.compile("<parmname=\"pushTokenRegUserName\"value=\"(.*?)\"/>");
		Matcher matcher = pattern.matcher(line);
		if (matcher.find()) {
			// System.out.println("sss ");
			System.out.println(matcher.group(1));
			line = line.replaceAll("<parmname=\"pushTokenRegUserName\"value=\"(.*?)\"/>", " ");
			
			System.out.println("line:" + line);
		}
	}

}

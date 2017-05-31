package org.maxwell.java8.features;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Decoding {

	public static void main(String[] args) throws UnsupportedEncodingException {
		byte[] decoded = Base64.getDecoder()
		        .decode("AgAAOwEwMjYyMDEzOTAwNjA5NzE4QG5haS5lcGMubW5jMDAxLm1jYzI2Mi4zZ3BwbmV0d29yay5vcmc=");
		String string = new String(decoded, "UTF-8");
		System.out.println(string);

	}

}

package org.maxwell.random;

import java.util.Arrays;

public class Masking {

	private static final String MASK = "*****";

	public static void main(String[] args) {
		String secret = "test123";
		System.out.println(mask(secret, 0));
	}

	public static String mask(String secret, int prefixLength) {
		if (prefixLength == 0 || secret == null || secret.length() <= prefixLength) {
			return secret;
		} else {
			return secret.substring(0, prefixLength) + MASK;
		}
	}

	public static String mask(byte[] secret, int prefixLength) {
		return mask(Arrays.toString(secret), prefixLength);
	}
}

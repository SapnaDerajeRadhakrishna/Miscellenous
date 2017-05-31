package org.maxwell.random;

import java.util.UUID;

public class UUIDImpl {

	public static void main(String[] args) {
		System.out.println(UUID.randomUUID());
		System.out.println(UUID.randomUUID().getLeastSignificantBits());
		System.out.println(String.valueOf(UUID.randomUUID().getMostSignificantBits()));

	}

}

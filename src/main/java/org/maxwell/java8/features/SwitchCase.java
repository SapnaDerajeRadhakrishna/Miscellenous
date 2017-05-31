package org.maxwell.java8.features;

public class SwitchCase {

	public static void main(String[] args) {
		String name = "test1";
		switch (name) {
		case "test":
			System.out.println("test");
			break;
		default:
			System.out.println("junk");
			break;
		}

	}

}

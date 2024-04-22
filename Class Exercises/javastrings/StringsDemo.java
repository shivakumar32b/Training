package com.javastrings;

public class StringsDemo {
	public static void main(String[] args) {
		String s = "Olivia";
		s.concat("Pink");
		System.out.println(s.concat("Pink"));
		System.out.println(s);

		String s1 = "Apples";
		String s2 = "Apples";
		String s3 = new String("Apples");
		String s4 = "Saurav";

		System.out.println(s1.contentEquals(s2));
		System.out.println(s1.contentEquals(s3));
		System.out.println(s1.equals(s4));

		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		String s10 = "Max";
		String s20 = "Max";
		String s30 = new String("Alex");
		System.out.println(s10.compareTo(s20));
		System.out.println(s10.compareTo(s30));
		System.out.println(s30.compareTo(s10));

		// String builder and string buffer
		StringBuilder stringBuilder = new StringBuilder("hello");
		stringBuilder.append("java with string builder");
		System.out.println(stringBuilder);

		StringBuffer stringBuffer = new StringBuffer("hello");
		stringBuffer.append("java with String buffer");
		System.out.println(stringBuffer);
	}
}

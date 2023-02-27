package org.emp;

public class Employee {




	public static void main(String[] args) {
		String s = "Welcome to java class";
		System.out.println(s);
		int length =s.length();
		System.out.println(length);
		boolean startsWith = s.startsWith("welcome");
		System.out.println(startsWith);
		boolean endsWith = s.endsWith("class");
		System.out.println(endsWith);
		s =s.toUpperCase();
		System.out.println(s);
		s= s.toLowerCase();
		System.out.println(s);
		int i = s.indexOf('a');
		System.out.println(i);
		int l = s.lastIndexOf('v');
		System.out.println(l);
		char c = s.charAt(2);
		System.out.println(c);
		boolean f = s.isEmpty();
		System.out.println(f);
		boolean d = s.contains("to");
		System.out.println(d);
		String r = s.replace('l', '@');
		System.out.println(r);
		String w = s.replaceAll(s,"SELENIUM");
		System.out.println(w);
		String y= "java Application";
		String y1="Java Application";
		boolean e = y.equals(y1);
		System.out.println(e);
		boolean q = y.equalsIgnoreCase(y1);
		System.out.println(q);
		String p= s.substring(5);
		System.out.println(p);
		String o = s.substring(5,18);
		System.out.println(o);
		
		
		
		
	
	}

}

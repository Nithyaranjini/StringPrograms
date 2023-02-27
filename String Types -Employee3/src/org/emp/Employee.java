package org.emp;

public class Employee {
	public static void main(String[] args) {
		System.out.println(" Non Literal String");
		String s = new String("java");
		System.out.println(s);
		int x = System.identityHashCode(s);
		System.out.println(x);
		String s1 = new String("java");
        System.out.println(s1);
        int y= System.identityHashCode(s1);
        System.out.println(y);
        String s3 =new String( "Selenium");
        System.out.println(s3);
        int z=  System.identityHashCode(s3);
        System.out.println(z);
      
        }

}

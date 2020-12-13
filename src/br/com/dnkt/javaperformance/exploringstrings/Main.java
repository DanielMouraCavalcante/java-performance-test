package br.com.dnkt.javaperformance.exploringstrings;

public class Main {

	//Exemplo de String Pool da JVM
	public static void main(String[] args) {
		String one = "hello";
		String two = "hello";
		
		System.out.println(one.equals(two));
		System.out.println(one == two);
		
		Integer i = 76;
		String three = i.toString();
		String four = "76";
		
		System.out.println(three.equals(four));
		System.out.println(three == four);


		Integer i2 = 99;
		String five = i2.toString().intern(); // guaranteed to be from a pool of unique strings
		String six = "99";

		System.out.println(five.equals(six));
		System.out.println(five == six);
		
	}

}

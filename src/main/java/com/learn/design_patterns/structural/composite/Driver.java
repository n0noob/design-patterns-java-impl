package com.learn.design_patterns.structural.composite;

public class Driver {

	public static void main(String[] args) {
		Person priyanka = new Student("Priyanka");
		
		Teacher alexCooper = new Teacher("Alex Cooper");
		Teacher niyati = new Teacher("Niyati");
		
		alexCooper.supervise(niyati);
		
		System.out.println(priyanka);
		System.out.println(alexCooper);
	}

}

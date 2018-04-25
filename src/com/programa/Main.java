package com.programa;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Comenzando en main...");
		
		PHP php = new PHP();
		php.start();
		
		Java java = new Java();
		java.start();
		
		
		php.join();
		java.join();
		System.out.println("main finalizado");

	}

}

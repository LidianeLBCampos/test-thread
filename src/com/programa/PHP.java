package com.programa;

public class PHP extends Thread {
	
	@Override
	public void run() {
		for(int i = 1; i<=200; i++) {
			System.out.print(getClass().getSimpleName() + i + " ");
		}
	}

}

package org.se.lab;

public class ThreadExample
	extends Thread
{

	@Override
	public void run()
	{
		System.out.println("run() - begin: " + Thread.currentThread().getId());
		countIntegers();
		System.out.println("run() - end  : " + Thread.currentThread().getId());
	}

	private static long countIntegers()
	{
		long sum = 0;
		for(int i=0; i< Integer.MAX_VALUE; i++)
		{
			sum++;
		}
		return sum;
	}


	/*
	 * Start some threads
	 */
	public static void main(String... args)
	{
		System.out.println("main() - begin");
		Thread t1 = new ThreadExample();
		Thread t2 = new ThreadExample();
		Thread t3 = new ThreadExample();
		t1.start();
		t2.start();
		t3.start();
		
		System.out.println("main() - end");
	}
}

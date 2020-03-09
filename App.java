package com.epam.AdapterPatterns;

public class App 
{
	public static void main( String[] args )
    {
    	@SuppressWarnings("unused")
		AdapterPatterns adapter = new AdapterPatterns();
    	
    	Computer computer = new Computer.ComputerBuilder("500 GB", "4 GB","128 GB").setKeyboardConnected(true).setMouseConnected(true).setCPUConnected(true).build();
        System.out.println(computer.getHDD());
        System.out.println(computer.getRAM());
        System.out.println(computer.getROM());

    	CumulativeMultiply sum1 = new CumulativeMultiply(1);
	    System.out.println(sum1.multiply(10));
	    CumulativeMultiply sum2 = new CumulativeMultiply(10);
	    System.out.println(sum2.multiply(10));
    }
}

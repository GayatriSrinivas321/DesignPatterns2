package com.epam.AdapterPatterns;

public class Computer {
	private String HDD;
	private String RAM;
	private String ROM;
	
	
	private boolean isMouseConnected;
	private boolean isKeyboardConnected;
	private boolean isCPUConnected;
	

	public String getHDD() {
		return HDD;
	}
    
	public String getRAM() {
		return RAM;
	}
	
	public String getROM() {
		return ROM;
	}

	public boolean isMouseConnected() {
		return isMouseConnected;
	}
	
	public boolean isCPUConnected() {
		return isCPUConnected;
	}

	public boolean isKeyboardConnected() {
		return isKeyboardConnected;
	}
	//        setCPUConnected(true)
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.ROM = builder.ROM;
		this.isMouseConnected = builder.isMouseConnected;
		this.isKeyboardConnected = builder.isKeyboardConnected;
		this.isCPUConnected = builder.isCPUConnected;
	}
	
	public static class ComputerBuilder{

		private String HDD;
		private String RAM;
		private String ROM;

		private boolean isMouseConnected;
		private boolean isKeyboardConnected;
		private boolean isCPUConnected;
		
		public ComputerBuilder(String hdd, String ram,String rom){
			this.HDD=hdd;
			this.RAM=ram;
			this.ROM=rom;
		}

		public ComputerBuilder setMouseConnected(boolean isMouseConnected) {
			this.isMouseConnected = isMouseConnected;
			return this;
		}
		
		public ComputerBuilder setCPUConnected(boolean isCPUConnected) {
			this.isCPUConnected = isCPUConnected;
			return this;
		}


		public ComputerBuilder setKeyboardConnected(boolean isKeyboardConnected) {
			this.isKeyboardConnected = isKeyboardConnected;
			return this;
		}
		
		public Computer build(){
			return new Computer(this);
		}

	}

}

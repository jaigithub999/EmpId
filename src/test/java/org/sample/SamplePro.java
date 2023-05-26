package org.sample;

public class SamplePro {
	
	private void empid(int Id) {
		System.out.println("Emp id: "+Id);
	}
	public static void main(String[] args) {
		System.out.println("Github push");
		SamplePro s = new SamplePro();
		s.empid(1234);
	}

}

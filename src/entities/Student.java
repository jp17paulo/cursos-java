package entities;

public class Student {

	public double n1;
	public double n2;
	public double n3;

	public double finalGrade(double n1, double n2, double n3) {

		return n1 + n2 + n3; 

	}

     public double average(double n1, double n2, double n3) {
		
    	 return (n1 + n2 + n3) / 3;
	}

}

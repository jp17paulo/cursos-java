package entities;

public class Triangle {
	
	public double width;
	public double height;
	
	
	/*public double area(double width, double height ) {
        		
		return (width * height) / 2;
	}
	
	public double perimetro(double width, double height) {
		
		return 2 * width + 2 * height; 
	}*/
	
	public double area() {
	  return width * height;
	
	}
	
	public double perimeter() {
	  return 2 * (width + height);
	
	}
	public double diagonal() {
	  return Math.sqrt(width * width + height * height);
	}

}

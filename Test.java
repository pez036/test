interface shape {
	public double findArea();
	public double findGirth();
}
public class circle implements shape {
  private double radius;

  public circle(){
		this.radius = 1;
	}
	public circle(double radius){
		this.radius = radius;
	}

	public double findArea(){
		return 3.14*radius*radius;
	}

	public double findGirth(){
		return 6.28*radius;
	}

}

public class rectangular implements shape {
	private double length;
	private double width;

  public rectangular(){
		this.length = 1;
		this.width = 1;
	}
	public rectangular(double length, double width){
		this.length = length;
		this.width = width;
	}

	public double findArea(){
		return length*width;
	}

	public double findGirth(){
		return 2*(length+width);
	}
}

public class cylinder extends circle {
	private double height;

	public cylinder (){
		this.radius = 1;
		this.height = 1;
	}

	public cylinder (double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public double findVol(){
		return height*(this.findArea());
	}
}

public class cuboid extends rectangular{
	private double height;
	public cuboid () {
		this.length = 1;
		this.width = 1;
		this.height = 1;
	}

	public cuboid(double length, double width, double height){
		this.length = length;
		this.width = width;
		this.height = height;
	}

	public double findVol(){
		return height*(this.findArea());
	}
}
public class main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}

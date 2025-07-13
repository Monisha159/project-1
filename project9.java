public class Main
{
	public static void main(String[] args) {
	}
	class Shape{
	    public void area(){
	        System.out.println("The formula for area of");
	    }
	}
	class Triangle extends Shape {
	    public void area(){
	        System.out.println("Triangle is 1/2 * base * height");
	    }
	}
	class Circle extends Shape {
	    public void area(){
	        System.out.println("Circle is 3.14 * radius * radius");
	    }
	}
	Shape myShape = new Shape();
    Shape myTriangle = new Triangle();
    Shape myCircle = new Circle();

    myShape.area()
    myTriangle.area()
    myCircle.area()

}


package tiil.edu;

public class TestCircle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		System.out.println(
				"Hình tròn có bán kính là : " + c1.getRadius() + " và diện tích của hình tròn là : " + c1.getArea());

		Circle c2 = new Circle(2.0);
		System.out.println(
				"Hình tròn có bán kính là : " + c2.getRadius() + " và diện tích của hình tròn là : " + c2.getArea());

		Circle c3 = new Circle();
		System.out.println("Màu của hình tròn là màu : " + c3.getColor());

		Circle c4 = new Circle();
		c4.setRadius(5.5);
		System.out.println("Bán kính của hình tròn c4 là : " + c4.getRadius());
		c4.setColor("Xanh là cây");
		System.out.println("Màu của hình tròn c4 là : " + c4.getColor());

		Circle c5 = new Circle(5.5);
		System.out.println(c5.toString());

		Circle c6 = new Circle(6.6);
		System.out.println(c6.toString());
		System.out.println(c6);
		System.out.println("Toán tử '+' cũng gọi toString(): " + c6);

		c6.setRadius(7.7);
		c6.setColor("Tím");
		System.out.println(c6);
		System.out.printf("diện tích hình tròn c6 : %.2f", c6.getArea());
	}

}

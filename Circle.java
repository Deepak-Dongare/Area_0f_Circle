import java.util.Scanner;

import java.lang.Math;
public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r;int d; double cir;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter radius of circle");
		r=sc.nextInt();
		d=2*r;
		System.out.println("Diameter of circle...."+d);
		
		
		System.out.println("Circumference of a circle......"+2*Math.PI*r);
		System.out.println("Area of circle............."+Math.PI*Math.pow(r,2));
		
	}

}

package javaGenerics;

import java.util.*;

abstract class Shape
{  
	abstract void draw();  
}

class Rectangle extends Shape
{  
	void draw()
	{	
		System.out.println("drawing rectangle");
	}  
} 

class Circle extends Shape
{  
	void draw()
	{
		System.out.println("drawing circle");
	}  
}


public class GenericTest 
	{
	public static void drawShapes(List<? extends Shape> lists)
	{
		for (Shape s: lists)
		{
			s.draw();
		}
	}
		public static void main(String[] args) 
		{
			List<Rectangle> l1 = new ArrayList<Rectangle>();
			l1.add(new Rectangle());
			
			List<Circle> c1 = new ArrayList<Circle>();
			c1.add(new Circle());
			c1.add(new Circle());
			
			drawShapes(l1);
			drawShapes(c1);
			
		}
}


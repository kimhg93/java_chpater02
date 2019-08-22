package kr.co.itcen.paint.main;

import kr.co.itcen.paint.i.Drawable;
import kr.co.itcen.paint.i.Resizeable;
import kr.co.itcen.paint.point.ColorPoint;
import kr.co.itcen.paint.point.Point;
import kr.co.itcen.paint.shape.Circle;
import kr.co.itcen.paint.shape.Rect;
import kr.co.itcen.paint.shape.Shape;
import kr.co.itcen.paint.shape.Triangle;
import kr.co.itcen.paint.text.GraphicText;

public class Main {

	public static void main(String[] args) {
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(20);
		
		draw(p1);
		p1.show(false);
		
		draw(new Point(100, 200));
		draw(new ColorPoint(300,200,"yellow"));		
		draw(new Triangle());		
		draw(new Rect());
		draw(new Circle());		
		draw(new GraphicText("hello"));
		
		Shape s1 = new Triangle();
		//Douwn castring : 명시적(explicity)
		((Triangle)s1).setX1(10);
		
		//Up casting : 암시적(Implicity)0
		Rect rect = new Rect();
		Shape s2 = rect;
		
		
		//instanceof 연산자
		Shape s = new Circle();
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Circle);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Triangle);
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);
		
		Circle circle = new Circle();
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
		System.out.println(circle instanceof Circle);
		//계층 관계가 성립하지 않으면 instanceof 연산자를 사용 할 수 없다.
		//System.out.println(circle instanceof Triangle);		
	}
	public static void resize(Drawable drawable) {
		if(drawable instanceof Resizeable) {
			((Resizeable) drawable).resize();
		}
	}
	public static void draw(Drawable drawable) {
		drawable.draw();
	}
}

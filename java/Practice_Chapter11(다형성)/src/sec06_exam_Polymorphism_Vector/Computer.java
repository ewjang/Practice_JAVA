package sec06_exam_Polymorphism_Vector;

public class Computer extends Product {

	//조상클래스의 생성자 Product(int price)를 호출한다.
	
			public Computer() {
				super(300);   //Tv의 가격을 300만원으로 한다.
			}
			
			
			//Object클래스의 toString()을 오버라이딩한다.
			@Override
			public String toString() {
				return "Computer";
			}
	
}

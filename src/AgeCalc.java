import java.util.Scanner;

class MyComponent {
	
	
	public static void line() {
		System.out.println("========================");
	}
	
	
	public void line2() {
		System.out.println("************************");
	}
}


public class AgeCalc {

	

	public static void main(String[] args) {

		// 변수
		int thisYear = 2022;
		int birthYear = 1996;
		int age;
		
		// 입력
		Scanner in = new Scanner(System.in);  // Scanner 라는 객체를 인스턴스화 하는 과정
		
		
		System.out.println("태어난 연도를 입력하세요");
		birthYear = in.nextInt();

		// 계산
		age = thisYear - birthYear + 1;

		// 출력
		MyComponent.line();                   //static 으로 쓰여진 함수는 class명으로 호출가능
		System.out.println("당신은 " + age + "살 입니다");
		
		MyComponent mc1 = new MyComponent();  // static으로 쓰여지지 않은 함수 호출하는 방법
		mc1.line2();
	}

}

// sysout 치고 컨트롤 스페이스 하면 자동완성해줌


//class 에는 변수만 넣은게 있고 함수만 넣은게 있고 변수랑 함수 같이 들어간 3종류만 알면됨
// 위에 ==== 같은건 함수(기능)만 있는거고
// class Car{
// int a;
// int b;
// int c;
// }
// Car myCar = new Car;     객체를 인스턴스화를 시킨 다음에
// myCar.color = "회색";    이게 변수가 들어간 class 사용하는 방법
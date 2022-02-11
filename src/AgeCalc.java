
public class AgeCalc {

	public static void main(String[] args) {

		// 변수
		int thisYear  = 2022;
		int birthYear = 1996;
		int age;
		// 입력
		
		// 계산
		age = thisYear - birthYear + 1 ;
		
		// 출력
		line();
		System.out.println("당신은 " + age + "살 입니다");
		line();
	}

	private static void line() {
		System.out.println("========================");
		
	}

}

// sysout 치고 컨트롤 스페이스 하면 자동완성해줌

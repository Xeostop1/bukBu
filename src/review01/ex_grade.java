package review01;

import java.util.Scanner;

public class ex_grade {
	public static void main(String []args) {

		Scanner in=new Scanner(System.in);
		int i=in.nextInt();


		//		
		//		if (i>=90) {
		//			System.out.println("A학점 입니다");
		//			
		//		} else if(i>=80) {
		//			System.out.println("B학점 입니다");
		//
		//		}else if (i>=70) {
		//			System.out.println("C학점 입니다");
		//			
		//		}else if (i>=60) {
		//			System.out.println("D학점 입니다");
		//			
		//		}else {
		//			System.out.println("F학점 입니다");
		//			
		//		}// 실행확인
		//		

		//System.out.println("==================");

		String result=
		
		i>=90 ? "A학점":
		i>=80 ? "B학점":
		i>=70 ? "C학점":
		i>=60 ? "D학점":"F학점";
		//false 값을 계속 주는게 아니라
//		연결하면서 나중에 1개만 쓰도록
//		참값을 병렬 연결함 
		if (i<=100) {
			System.out.println(result);
			
		} 
		else { System.out.println("100점 이하의 숫자를 입력해 주세요");

		}
		

	}//main
}//class

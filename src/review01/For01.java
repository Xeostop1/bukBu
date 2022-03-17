package review01;

import java.util.Iterator;

public class For01 {

	public static void main(String[] args) {
		for (int i = 5; i >0; i--) {
			System.out.println("YES! i의 값="+i);

		}//for

		//		String star="*";
		//		for (int i = 6; i<=0 ; i--) {
		//			
		//			System.out.println(star);

		//}
		for (int i = 0; i < 2; i++) {
			System.out.println("예 "+i);
			for (int j = 0; j < 3; j++) {
				System.out.println("아니오 "+j);

			}//for2
			//i가 총 2번 실행!→ 그안에서 j가 3번 실행
			//j는 2회에 걸쳐서 실행되는것!(for안에 있는 반복문이니까)

		}//for1

//for문은 종료+조건 만족하지 않아야 끝남!
		//for (int i = 0; i >=0; i++) {
			//System.out.println("무한루프 팡! "+i);
			
		//}
		
		for (int i = 0; i < 2; i++) {
			System.out.println("yes\tno"+i);
		}//for		} 
		
	}//main

}//class

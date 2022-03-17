package review01;

public class DoWhile {

	public static void main(String[] args) {
		//	do {
		//		실행문;
		//	} while (조건);

		int a=5;
		do {
			System.out.println(a);
			a++;
		} while (a>10);
		System.out.println("while {} 외부 에서의 i="+a);
//두와일문이라 와일문이라면 실행이 않되는데, 1번은 실행되는 상태!!!
		


	}//main

}//class

package review01;

import java.util.Scanner;

public class ex_grade {
	public static void main(String []args) {

		Scanner in=new Scanner(System.in);
		int i=in.nextInt();


		//		
		//		if (i>=90) {
		//			System.out.println("A���� �Դϴ�");
		//			
		//		} else if(i>=80) {
		//			System.out.println("B���� �Դϴ�");
		//
		//		}else if (i>=70) {
		//			System.out.println("C���� �Դϴ�");
		//			
		//		}else if (i>=60) {
		//			System.out.println("D���� �Դϴ�");
		//			
		//		}else {
		//			System.out.println("F���� �Դϴ�");
		//			
		//		}// ����Ȯ��
		//		

		//System.out.println("==================");

		String result=
		
		i>=90 ? "A����":
		i>=80 ? "B����":
		i>=70 ? "C����":
		i>=60 ? "D����":"F����";
		//false ���� ��� �ִ°� �ƴ϶�
//		�����ϸ鼭 ���߿� 1���� ������
//		������ ���� ������ 
		if (i<=100) {
			System.out.println(result);
			
		} 
		else { System.out.println("100�� ������ ���ڸ� �Է��� �ּ���");

		}
		

	}//main
}//class

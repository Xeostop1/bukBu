package review01;

import java.util.Iterator;

public class For01 {

	public static void main(String[] args) {
		for (int i = 5; i >0; i--) {
			System.out.println("YES! i�� ��="+i);

		}//for

		//		String star="*";
		//		for (int i = 6; i<=0 ; i--) {
		//			
		//			System.out.println(star);

		//}
		for (int i = 0; i < 2; i++) {
			System.out.println("�� "+i);
			for (int j = 0; j < 3; j++) {
				System.out.println("�ƴϿ� "+j);

			}//for2
			//i�� �� 2�� ����!�� �׾ȿ��� j�� 3�� ����
			//j�� 2ȸ�� ���ļ� ����Ǵ°�!(for�ȿ� �ִ� �ݺ����̴ϱ�)

		}//for1

//for���� ����+���� �������� �ʾƾ� ����!
		//for (int i = 0; i >=0; i++) {
			//System.out.println("���ѷ��� ��! "+i);
			
		//}
		
		for (int i = 0; i < 2; i++) {
			System.out.println("yes\tno"+i);
		}//for		} 
		
	}//main

}//class

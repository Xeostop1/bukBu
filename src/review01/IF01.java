package review01;

import java.util.Scanner;

public class IF01 {

	public static void main(String[] args) {

		System.out.println("학점입력");
		Scanner sc=new Scanner(System.in);
		//int score=(new Scanner(System.in)).nextInt();
		int score=sc.nextInt();



		if (score>=90) {
			System.out.println("A");}

		else if (score>=80) {
			System.out.println("B");
		}
		else if (score>=70) {
			System.out.println("C");
		} 
		else if (score>=60) {
			System.out.println("D");
		} 
		else { 
			System.out.println("F");
		}

	}//main


}//class



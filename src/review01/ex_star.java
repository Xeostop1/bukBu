package review01;

public class ex_star {

	public static void main(String[] args) {
		String star="*";
		for (int i = 5; i >0 ; i--) {
			System.out.println(star);
			star+="*";
			//왜 안되지?

		}//for

		System.out.println("-----------------");

		int num=5;
		for (int i = 1; i < num; i++) {
			String stars="";
			for (int j = i; j < num; j++) {
				stars+="*";
			}
			System.out.println(stars);

		}

		System.out.println("-------------");

		int x= -10;
		if (x>=0) {
			System.out.println(x);

		} else {
			System.out.println(-x);
		}


		System.out.println("----------");
		int y=-10;
		int absX=y >=0?y:-y;
		System.out.println(y);


	}//main

}//class

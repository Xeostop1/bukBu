package review01;

public class ex_plus {

	public static void main(String[] args) {
		//���� 1���� ���� ���´�. ���� 1���� ���´ٰ� �����ϸ� 
		//������ ������ ���� ������ ��ϱ�? ��,ȭ,��,��,��,��,���� ���� ������ ��� 
		//++�����ڸ� ����Ͽ� ���� ���� ������ ������ �� �ֵ��� ����
		
		int egg=1;
		int egg1= egg++;
		int egg2= ++egg1;
		int egg3= ++egg2;//��
		int egg4= ++egg3;
		int egg5= ++egg4;
		int egg6= ++egg5;
		
		System.out.println("��: "+egg+"��");
		System.out.println("ȭ: "+egg1+"��");
		System.out.println("��: "+egg2+"��");
		System.out.println("��: "+egg3+"��");
		System.out.println("��: "+egg4+"��");
		System.out.println("��: "+egg5+"��");
		System.out.println("��: "+egg6+"��");
		
		

	}

}

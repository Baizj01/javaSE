import java.util.Scanner;

public class Landing
{
	public static void main(String[] args){
		//��������Scanner
		Scanner ac=new Scanner(System.in);
		System.out.println("�������û���");
		//�ڻ��char��������ʱ����û��nextchar,���Կ���ʹ��next().charAt()���������
		char name=ac.next().charAt(0);
		System.out.println("����������");
		int password=ac.nextInt();
			
		if(name=='��'&&password==123)
		{
			System.out.println("��ӭ����");
		}else
			System.out.println("�Բ������������");

		System.out.println("----------------------�ָ���------------------------");
		int a=500;
		if(a>500)
			System.out.println("�򿭵�����");
		else if (a>100)
			System.out.println("��������");
		else if(a>50)
			System.out.println("��������");
		else if(a>10)
			System.out.println("�����");
		System.out.println("----------------------�ָ���------------------------");

		System.out.println("���������Ļ���");
		int number=ac.nextInt();
		if(number<2000)
			System.out.println("��9��");
		else if(number>=2000&&number<4000)
			System.out.println("��8��");
		else if(number>=4000&&number>8000)
			System.out.println("��7��");
		else if(number>=8000)
			System.out.println("��6��");
		else
			System.out.println("������");

	}

}

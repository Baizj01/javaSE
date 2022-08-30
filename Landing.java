import java.util.Scanner;

public class Landing
{
	public static void main(String[] args){
		//创建对象Scanner
		Scanner ac=new Scanner(System.in);
		System.out.println("请输入用户名");
		//在获得char数据类型时，并没有nextchar,所以可以使用next().charAt()来解决问题
		char name=ac.next().charAt(0);
		System.out.println("请输入密码");
		int password=ac.nextInt();
			
		if(name=='青'&&password==123)
		{
			System.out.println("欢迎您青");
		}else
			System.out.println("对不起您输入错误");

		System.out.println("----------------------分割线------------------------");
		int a=500;
		if(a>500)
			System.out.println("买凯迪拉克");
		else if (a>100)
			System.out.println("买帕萨克");
		else if(a>50)
			System.out.println("买伊兰托");
		else if(a>10)
			System.out.println("买奥托");
		System.out.println("----------------------分割线------------------------");

		System.out.println("请输入您的积分");
		int number=ac.nextInt();
		if(number<2000)
			System.out.println("打9折");
		else if(number>=2000&&number<4000)
			System.out.println("打8折");
		else if(number>=4000&&number>8000)
			System.out.println("打7折");
		else if(number>=8000)
			System.out.println("打6折");
		else
			System.out.println("不打折");

	}

}

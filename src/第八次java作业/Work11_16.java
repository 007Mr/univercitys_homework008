package 第八次java作业;
import java.util.*;
public class Work11_16 {
	public static void main(String[] args) {
		int number1=(int) (Math.random()*10);
		int number2=(int) (Math.random()*10);
		
		//创建一个数组，用来存放错误成绩
		ArrayList<Integer> list=new ArrayList<>();
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("What is "+number1+" + "+number2+"?");  
		
		int answer=input.nextInt();
		
		while(number1+number2!=answer) {
			if( !list.contains(answer) ) {
				list.add(answer);
			}
			else {
				System.out.println("You already entered "+answer);
			}
			
			
			System.out.print("Wrong answer.Try again.What is "
					+ number1+" + "+number2+"? ");
			answer=input.nextInt();
		}
		
		System.out.println("You got it!");
		input.close();
	}

}

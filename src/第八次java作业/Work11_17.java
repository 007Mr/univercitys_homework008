package 第八次java作业;
import java.util.*;

public class Work11_17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		//创建一个数组列表来保存“因子”
		ArrayList<Integer> list=new ArrayList<>();
		
		
		System.out.print("Enter an integer m: ");
		
//-------------------------------------------------------------
//源代码在我之前做过的练习里出现过。
//第五单元 编程练习题 5.16(找出一个整数的因子)题中	
		int number=input.nextInt();
		input.close();
		
		//得到 M
		int m=number;
		
		int i=2;
		
		System.out.print("因子为： ");
		
		while(number != 1) {
			if(number % i ==0) {
				number = number / i ;
				System.out.print( i + " ");//输出因子
				list.add(i);
			}
			else {
				i++;
			}
		}
		
		System.out.println();
		System.out.println("检查 list数组里的情况： "+list.toString());
//--------------------------------------------------------------------		
		
		ArrayList<Integer> newList=new ArrayList<>();
		
		int[] countArray=new int[1000];
		
		for(int j=0; j<list.size(); j++) {
			if(!newList.contains(list.get(j))) {
				newList.add(list.get(j));
				countArray[list.get(j)]++;
			}
			else {
				countArray[list.get(j)]++;
			}
		}
		
		System.out.println("检查 newList数组里的情况： "+newList.toString());
		System.out.println();
		
		//先定义 N 为 1
		int n=1;
		for(int j=0; j<newList.size(); j++) {
			//不能将2整除的是奇数
			if(countArray[newList.get(j)] % 2 != 0 ) {
				n = n*newList.get(j) ;
			}
		}
		
		//输出 N ：是列表中出现奇数次的因子的乘积
		System.out.println("The smallest number m*n to "
				+ "be a perfect square is " + n);
		
		
		System.out.println(" m*n is " + m*n);
		
		
 
	}

}

import java.util.*;
public class Lianxi4{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("请输入信息数:");
	int num = sc.nextInt();
	int size = 20;
	int page = num%size==0 ? num/size : num/size+1;
	System.out.println("所需页数为："+page);
	}

}
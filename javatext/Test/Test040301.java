import java.util.*;
public class Test040301{
	public static void main(String[] args){
	int a = 0;//初始化a
	int b = 0;//初始化b
	int i;
	for(i=1;i<10;i++){
		a=a+i;
		}
		System.out.println("a的值为："+a);
	
	for(i=0;1<10;i++){
		b=b+i;
}
	 System.out.println("b的值为："+b);
	
	int num = a*1000 + a*100 + b*10 + b;//表示出x
	double y = Math.sqrt(num);//开平方验证
	if(y%1 == 0){
	System.out.print(num);//输出所得
	}
	}
	  
}
import java.util.*;
public class Lianxi8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ַ�����");
		String a = sc.next();
		int c1 = 0;
		int c2 = 0;
		for(int i=0; i<a.length(); i++){
		int tmp = Integer.parseInt(a.charAt(i) + "");
		if(i % 2 == 0){
		c1 += tmp;
		}else{
		c2 += tmp;
		}
		}
		System.out.println("������: " + c1);
		System.out.println("ż����: " + c2);
		
		int cc = c1 + c2 * 3;
		int m = cc % 10;
		System.out.println("У���룺"+m);
	}
	}
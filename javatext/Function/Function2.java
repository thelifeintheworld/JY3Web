import java.util.*;
public class Function2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("���������֣�");
		int x = sc.nextInt();
		int y = Lianxi3(x);
		int h = Lianxi2(x);
		int g = Lianxi32(x);
		System.out.println("��ϰ3�Ľ����"+y);
		System.out.println("��ϰ2�Ľ����"+h);
		System.out.println("��ϰ3.2�Ľ����"+g);
	}
	public static int Lianxi3(int a){
		return a % 3; 
	}
	public static int Lianxi2(int c){
		int d = c * c - 2 * c + 4;
		return d;
	}
	public static int Lianxi32(int x){
	return x++;
	}
}
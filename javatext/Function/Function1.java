import java.util.*;
public class Function1{
	public static void main(String[] args){
	/*//int x = 48;
	//char y = f(x);
	//char n = '��';
	//int m = g(n);
	*/
	Scanner sc = new Scanner(System.in);
	/*System.out.println("���������֣�");
	int x = sc.nextInt();
	char y =  IntToChar(x);
	System.out.println(y);
*/
	System.out.println("�������ַ���");
	String num = sc.next();
	char m = num.charAt(0);
	int n = CharToInt(m);
	System.out.println(n);
	}
	//public static char IntToChar(int c){
	//return (char)c ;
	//}
	public static int CharToInt(char c){
	return c;
	}
}
import java.util.*;
public class Lianxi5{
	public static void main(String[] args){
		System.out.print("������ɼ���");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		String a = "";
		if(score >100 ){
		 a = "super man";
		}
		else if(score >=90 && score <=100){
		a = "����";
		}
		else if(score >=80 && score <=90){
		a = "����";
		}
		else if(score <=80){
		a = "������";
		}
		else{a = "super man";}
	System.out.println("��������Ϊ"+a);
	}
}
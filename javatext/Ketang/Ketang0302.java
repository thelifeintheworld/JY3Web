import java.util.*;
public class Ketang0302{
	public static void main(String[] args){
		System.out.print("���빺��ı�����");
		Scanner sc = new Scanner(System.in);
		int cap = sc.nextInt();
		int price = 10;
		int pay ;
		if(cap == 1){ 
			pay = price*1;
		System.out.println("�踶��"+pay);
			}
		else if(cap > 1){
		pay = price + (cap-1)*(price/2);
		System.out.println("���Ż�Ŷ,�踶��"+pay);
		}
		else{
			System.out.println("������");
		}
	
	}


}
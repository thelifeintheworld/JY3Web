import java.util.*;
public class Test040302
{
	public static void main(String[] args){
	int i, j, k;
    for(i=1; i<5; i++)
    {
        /* �۲�ÿ�еĿո���������ȫѭ������ */
        for(  j=i ; j<5;j++ )  
        {
            System.out.print(" ");    //����ո�
        }
        /* �۲�ÿ��*�ŵ���������ȫѭ������ */
        for( k=0 ;k<2*i-1; k++ ) 
        {
           System.out.print("*");   //ÿ�������*��
        }
       System.out.print("\n");     //ÿ��ѭ������
    }
	
	}

}
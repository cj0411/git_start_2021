package Exam;

public class forUpgrade {
	public static void main (String[] args) {
		
		//�Ϲ� for�� , Ȯ�� for�� (jdk5���� ���� ��� ����)
		
		
		int [] a = {1, 3, 5, 7, 9};
		int sum1 = 0 , sum2 =0;
		
		for(int i=0; i<a.length; i++) {
			sum1 += a[i];
		}
		
		for(int i : a) {
			sum2 += i;
		}
		System.out.println("��1��="+sum1);
		System.out.println("��2��="+sum2);
	}
}

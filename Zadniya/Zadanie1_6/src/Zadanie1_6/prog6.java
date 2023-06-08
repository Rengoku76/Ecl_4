package Zadanie1_6;

public class prog6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = new int[10];
		int count = 0;
		
		for (int i = 1; i <= 20; i++) {
			if (i % 2 == 0) {
			num[count] = i;
			count+=1;
			}
		}
		for (int i = 0; i < num.length; i++) {
		    System.out.print(num[i] + " ");
		}
		for (int i = 0; i < num.length; i++) {
		    System.out.print("\n"+num[i] + " ");
		}
}
}
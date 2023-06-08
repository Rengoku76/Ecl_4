package Zadachi;

public class psevdornd2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int a=(int)(Math.random()*(2*n+1))-n;
		System.out.println("Случайное число из отрезка "+(n*-1)+","+ n + " равно: "+a);
	}

}

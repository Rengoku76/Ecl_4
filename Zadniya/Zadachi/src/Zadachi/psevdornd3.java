package Zadachi;

public class psevdornd3 {

	public static void main(String[] args) {
		int a,b,s,c;
		a = 2;
		b = 30;
		s = b-a+1;
		c = (int)(Math.random()*s)+a;
		System.out.println(c);
	}

}

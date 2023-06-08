package Zadanie1_6;

import java.util.Random;

public class prog3 {
    public static void main(String[] args) {
    	int a=5,b=10;
    	Random rand = new Random();
			int randNum = rand.nextInt(a*2+1) - b;
        	System.out.print(randNum+" ");
        }
    }

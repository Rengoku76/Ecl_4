package Zadanie1_6;

import java.util.Random;

public class prog2 {
    public static void main(String[] args) {
    	int n=5;
    	Random rand = new Random();
			int randNum = rand.nextInt(n*2+1) - n;
        	System.out.print(randNum+" ");
        }
    }


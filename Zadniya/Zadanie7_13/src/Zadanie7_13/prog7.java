package Zadanie7_13;

import java.util.Random;

public class prog7 {
    public static void main(String[] args) {
        int[] arr = new int[12];
        Random rand = new Random();
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(31) - 15;
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\n������������ �������: " + max);
        System.out.println("������ ���������� ��������� ������������� ��������: " + index);
    }
}

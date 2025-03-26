package ex03_class;

import java.util.Random;

import ex04_exam.MethodTest;

public class Graph {
	public static void main(String[] args) {
		int[] num1 = new int[100];
		int[] count1 = new int[10];
		Random r = new Random();
		
		for (int i = 0; i < num1.length; i++) {
			System.out.print(num1[i] = r.nextInt(10));
		}
		System.out.println();
		for (int i = 0; i < num1.length; i++) {
			count1[num1[i]]++;
			
		}
		for (int j = 0; j < count1.length; j++) {
			System.out.println(j + "의 갯수 : " + MethodTest.print('#',count1[j]) + " " + count1[j]);
		}
	}
}

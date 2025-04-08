package ex01_Thread;

import java.util.Random;
import java.util.Scanner;

public class QuizThread extends Thread {
	int time=0;
	boolean cheak = true;
	int count=0;
	final int play =5;

	public void StartGame() {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		
		while(cheak) {
				int num1 = r.nextInt(100) + 1;
				int num2 = r.nextInt(100) + 1;
				System.out.print(num1 + " + " + num2 + " = ");
				int result = sc.nextInt();

				if (result == (num1 + num2)) {
					System.out.println("정답");
				} else {
					System.out.println("오답");
					continue;
				}
			
			count++;
			if(count==play) {
				cheak=false;
				System.out.println("결과 : "+ time+"초...");
				break;
			}
		}

		
	}

	@Override
	public void run() {
		while(cheak) {
			try {
				Thread.sleep(1000);
				time++;
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
}

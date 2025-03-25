package ex01_multi_array;

import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 }, { 11, 12, 13, 14, 15 }, { 16, 17, 18, 19, 20 } };
		// 배열 arr의 총합과 평균을 구하시오
		int sum = 0;
		double avg = 0;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		avg = (double) sum / count;
		System.out.println("총합 :" + sum);
		System.out.println("평균 : " + avg);

		System.out.println("-------------------");

		// 학생들의 정보를 입력하고, 출력하는 프로그렘
		// 학생들의 수학과 영어성적을 등록하는 프로그래
		// 1. 프로그램을 실행하면 몇명의 정보를 저장할 것인지 입력받는다
		// 2, 입력받은 수 만큼 학생들의 이름, 수학, 영어성적을 입력받는 프로그램 작성하기
		Scanner sc = new Scanner(System.in);
		System.out.print("등록할 인원수 : ");
		int student = sc.nextInt();
		
		String[][] arrs = new String[student][3];
		for (int i = 0; i < arrs.length; i++) {
			System.out.print("이름 : ");
			arrs[i][0] = sc.next();
			System.out.print("수학 : ");
			arrs[i][1] = sc.next();
			System.out.print("영어 : ");
			arrs[i][2] =sc.next();
			System.out.println("-----------");
		}
		System.out.println(student+"명 등록 완료");
		
		for(int i = 0; i<arrs.length; i++) {
			for(int j=0;j<arrs[i].length;j++) {
				System.out.print(arrs[i][j]+ " ");
			}
			System.out.println();
		}
	}
}

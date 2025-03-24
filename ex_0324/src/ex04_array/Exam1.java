package ex04_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exam1 {
	public static void main(String[] args) {
		int[] iArr = new int[10];
		// 배열에 각각의 index에 1~10을 할당하고
		// 총 합을 구하여 출력하세요
//		int add=0;
//		for(int i =0;i<iArr.length;i++) {
//			iArr[i]=i;
//			add += iArr[i];
//		}
//		System.out.printf("각 배열의 총 합 : %d",add);

		Random r = new Random();
		// r.nextInt(30)+1

		// iArr에 각 index에 난수를 넣고
		// 배열의 짝수 요소들의 총합 구하기
		int sum = 0;
		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = r.nextInt(30) + 1;
			if (iArr[i] % 2 == 0) {
				sum += iArr[i];
			}
			System.out.println(iArr[i]);
		}
		System.out.println("배열 짝수 요소들의 합 : " + sum);
		System.out.println("========================");

		int[] nums = { 5, 7, 2, 9, 4, 10, 3 };
		int max = nums[0];
		int min = nums[0];
		// 배열에서 최대값과 최솟값을 출력하는 프로그램 만들기
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] > max) {
				max = nums[i];
			}
			if (nums[i] < min) {
				min = nums[i];
			}
		}
		System.out.printf("최대값 : %d \n최솟값 : %d\n", max, min);
		System.out.println("===========================");
		int[] nums2 = { 1, 2, 1, 4, 2, 1, 4 };
		int[] count = new int[5];
		// 위 배열에서 각 숫자가 몇번 나왔는지 출력하시오
		for (int i = 0; i < nums2.length; i++) {
			count[nums2[i]]++;
		}
		for (int i = 0; i <= 4; i++) {
			System.out.printf("%d : %d번 \n", i, count[i]);

		}
		System.out.println("=============");
		int[] nums3 = { 5, 3, 8, 4, 2 };
		//1. 버블정렬
		//인접한 두 요소를 비교해 큰 값을 뒤로 보내는 정렬
		// 오름차순으로 입력하세요
		for (int i = 0; i < nums3.length - 1; i++) {
			for (int j = 0; j < nums3.length - 1 - i; j++) {
				if (nums3[j] > nums3[j + 1]) {
					int box = nums3[j];
					nums3[j] = nums3[j + 1];
					nums3[j + 1] = box;
				}
			}
		}
		System.out.println(Arrays.toString(nums3));
		
		char[] cards= {'1','L','O','2','V','3','E'};
		String myWord = "";
		//배열에서 영문자만 추출하여 이어붙혀 출력하시오
		for(int i = 0; i<cards.length;i++) {
			int word = cards[i];
			if(cards[i]>='a'&&cards[i]<='z'||cards[i]>='A'&&cards[i]<='Z') {
				myWord += (char)word;
			}
		}
		System.out.println(myWord);
		
		//키보드에서 배열의 길이를 입력받는다
		//입력받는 배열의 길이만큼 알파벳을 넣고 출력한다
		//배열의 길이 : 5
		//ABCDE
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열의 길이 : ");
		int num = sc.nextInt();
		char[] abc = new char[num];
		for(int i = 0; i<num;i++) {
			abc[i]=(char)('A'+i);
		
		}
		System.out.println(Arrays.toString(abc));
		System.out.println("===============");
		//동전의 개수 구하기
		//10~5000사이의 난수를 변수에 담는다
		//1의 자리는 반드시 0이 되도로 한다
		//발생한 난수를 각 동전으로 바꿀 때 몇개 씩 필요한지
		//판단하여 작성하세요
		//가능한 적은 수의 동전을 사용한다
		
		int[] coin = {500,100,50,10};
		int money = r.nextInt(500)+1;
		money*=10;
		int count1 =0;
		System.out.println("금액 :" +money);
		for(int i = 0; i<coin.length;i++) {
			int res = money/coin[i];
			System.out.printf("%d: %d개\n",coin[i],res);
			money %= coin[i];
			
		}
		
	}

}

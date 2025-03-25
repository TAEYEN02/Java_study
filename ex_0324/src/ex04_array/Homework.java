package ex04_array;

import java.util.Arrays;
import java.util.Random;

public class Homework {
	public static void main(String[] args) {
		//로또번호 생성하기
		//1~45사이의 난수를 발생시켜 로또번호를 
		//생성하는 프로그램 만들기
		
		//로또번호 생성기
		//1. 1~45사이의 난수를 추출한다
		//2. 배열에 넣는다
		//3. 배열의 다른 값들과 비교하여 중복되면 다시 뽑는다
       
		
		Random rs = new Random();
        int[] lottoNumbers = new int[6]; 

//        for (int i = 0; i < lottoNumbers.length; i++) {
//            int num;
//            boolean isDuplicate;
//
//            do {
//                num = rs.nextInt(45) + 1; // 1~45 난수 생성
//                isDuplicate = false;
//
//                // 중복 체크
//                for (int j = 0; j < i; j++) {
//                    if (lottoNumbers[j] == num) {
//                        isDuplicate = true;
//                        break;
//                    }
//                }
//            } while (isDuplicate); // 중복이면 다시 난수 생성
//
//            lottoNumbers[i] = num; // 중복 없으면 배열에 저장
//        }
//
//        // 오름차순 정렬
//        Arrays.sort(lottoNumbers);
//
//        // 일반 for문을 사용해 결과 출력
//        System.out.print("로또 번호: ");
//        for (int i = 0; i < 6; i++) {
//            System.out.print(lottoNumbers[i] + " ");
//        }
        
        
        outer:for(int i =0; i< lottoNumbers.length;) {
        	lottoNumbers[i] = rs.nextInt(45)+1;
        	for(int j=0; j<i;j++) {
        		if(lottoNumbers[i]==lottoNumbers[j]) {
        			continue outer;
        		}
        	}
        	System.out.printf(lottoNumbers[i]+" ");
        	i++;
        }
        
        
        
        
        
    }
}

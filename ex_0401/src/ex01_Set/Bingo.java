package ex01_Set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Bingo {
	public static void main(String[] args) {
		//HashSet을 이용한 5*5의 랜덤 빙고판 만들기
		//숫자는 1~50까지
		HashSet<Integer> num = new HashSet<Integer>();
		
		while(num.size() !=25) {
			int r = new Random().nextInt(50)+1;
			num.add(r);
		}
		
        int[][] arr = new int[5][5];
        
        //shuffle(list)
        List<Integer> list = new ArrayList<>(num);
        Collections.shuffle(list);
        //set으로 랜덤값을 넣었기 때문에 중복값은 어차피 안들어가져있음
      
		Iterator<Integer> bingo = list.iterator();
		
		
		for(int i = 0; i<5;i++) {
			for(int j=0; j<5;j++) {
				arr[i][j] = bingo.next();
				System.out.printf("%02d ",arr[i][j]);
			}
			System.out.println("");
		}
	}
}

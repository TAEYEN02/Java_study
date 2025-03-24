package ex04_array;

public class Homework {
	public static void main(String[] args) {
		//로또번호 생성하기
		//1~45사이의 난수를 발생시켜 로또번호를 
		//생성하는 프로그램 만들기
        Random rs = new Random();
        int[] lottoNumbers = new int[6]; // 로또 번호 저장 배열

        for (int i = 0; i < 6; i++) {
            int num;
            boolean isDuplicate;

            do {
                num = rs.nextInt(45) + 1; // 1~45 난수 생성
                isDuplicate = false;

                // 중복 체크
                for (int j = 0; j < i; j++) {
                    if (lottoNumbers[j] == num) {
                        isDuplicate = true;
                        break;
                    }
                }
            } while (isDuplicate); // 중복이면 다시 난수 생성

            lottoNumbers[i] = num; // 중복 없으면 배열에 저장
        }

        // 오름차순 정렬
        Arrays.sort(lottoNumbers);

        // 일반 for문을 사용해 결과 출력
        System.out.print("로또 번호: ");
        for (int i = 0; i < 6; i++) {
            System.out.print(lottoNumbers[i] + " ");
        }
    }
}

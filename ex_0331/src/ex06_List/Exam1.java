package ex06_List;

import java.util.ArrayList;
import java.util.Scanner;

class Id {
    String id;

    public Id(String id) {
        this.id = id;
    }
}

public class Exam1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Id> list = new ArrayList<>();

        int count = 0;

    
        while (count < 5) {
            System.out.print("아이디 생성 : ");
            String inputId = sc.next();
            Id newId = new Id(inputId);

            boolean ok = false;

            for (int j = 0; j < list.size(); j++) {
                if (list.get(j).id.equals(inputId)) {
                    System.out.println("이미 아이디가 있습니다");
                    ok = true;
                    break; 
                }
            }

            if (!ok) {
                list.add(newId);
                count++; 
            }

            System.out.print("현재 아이디 목록: ");
            for (int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i).id + " ");
            }
            System.out.println();
        }

    }
}

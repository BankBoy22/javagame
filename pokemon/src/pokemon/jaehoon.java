package pokemon;

import java.util.Scanner;

public class jaehoon {
    public static void main(String[] args) {
        int random_number = (int)(Math.random()*100);
        int count = 0; // 입력한 횟수
        int mynumber = 0; // 내가 입력한 숫자
        Scanner sc = new Scanner(System.in);
        while(true) { // 내가 입력한 숫자와 랜덤 숫자가 같을 때까지 반복
            System.out.print("숫자를 입력하세요 : ");
            mynumber = sc.nextInt();
            count++;
            if(mynumber == random_number) {
                System.out.println("정답입니다.");
                System.out.println(count+"회 만에 맞추셨습니다.");
                break;
            } else if(mynumber > random_number) {
                System.out.println(mynumber+"보다 작습니다.");
            } else {
                System.out.println(mynumber+"보다 큽니다.");
            }
        }
    }
    

}

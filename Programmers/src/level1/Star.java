package level1;

import java.util.Scanner;

public class Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
     if(a<=1000 && b<=1000){
        for(int i =0; i <b; i++){
            for(int j = 0;j<a;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
   }
}
import java.util.Scanner;
import java.lang.Math;
import java.util.ArrayList;
import java.util.Collections;
class divisors {
    static void print_divisors(int n){
        int end_Loop = n/2;
        for(int i = 1; i <=end_Loop; i++){
            if(n %i == 0){
                System.out.print(i + " ");
            }
        }
        System.out.print(n);
    }
    static void optimal(int n){
        ArrayList<Integer> divisorsList = new ArrayList<Integer>();
        for(int i = 1; i <= Math.sqrt(n); i++){
            if(n%i==0){
                divisorsList.add(i);
                if(i!=n/i) divisorsList.add(n/i);
            }
        }
        Collections.sort(divisorsList);
        for(int i : divisorsList){
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        print_divisors(n);
        System.out.println();
        optimal(n);
    }
}

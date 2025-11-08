import java.util.Scanner;
class divisors {
    static void print_divisors(int n){
        int end_Loop = n/2;
        for(int i = 1; i <=end_Loop; i++){
            if(n %i == 0){
                System.out.print(i + " ");
            }
        }
        
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        print_divisors(n);
    }
}
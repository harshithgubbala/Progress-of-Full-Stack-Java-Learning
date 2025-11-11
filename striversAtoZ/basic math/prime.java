import java.util.Scanner;
class prime {
    static void prime_1(int n){
        int cnt = 0;
        for( int i = 1; i<= n/2; i++){
            if(n % i == 0){
                cnt++;
            }
        }
        if(cnt>1){
            System.out.print("NotPrime");
        }
        else System.out.print("IsPrime");
    }
    static void optimal(int n){
        int sum = 0;
        for(int i = 1; i<= Math.sqrt(n); i++){
            if(n % i == 0){
                sum++;
                if(n/i != i){
                sum++;
                }
            }
            
        }
        if(sum>2){
            System.out.print("NotPrime");
        }
        else System.out.print("ISPrime");
        
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        prime_1(n);
        System.out.println();
        optimal(n);
    }
}

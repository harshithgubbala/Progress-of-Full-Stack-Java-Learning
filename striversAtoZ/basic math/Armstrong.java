import java.util.Scanner;
class Armstrong {
    static int armstrong(int n){
        int sum = 0;
        while(n!=0){
            int x = n % 10;
            sum = sum + (x*x*x);
            n = n /10;
            }
        return sum;
        }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        if(n == armstrong(n)){
            System.out.println("IS_ARMSTRONG");
        }
        else{
            System.out.println("IS_NOT_ARMSTRONG");
        }
    }
}

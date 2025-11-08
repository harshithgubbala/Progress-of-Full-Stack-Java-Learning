import java.util.Scanner;
class palindrome {
    //bruteforce
    static int rev_bf(int n){
        int sum = 0;
        while(n!=0){
            int d = n%10;
            sum = sum*10 + d;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        if (x == rev_bf(x)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
import java.util.Scanner;
class Solution{
    public void print_Sum(int number, int N, int sum){
        if(number>N){
            System.out.println(sum);
            return;
        }
        sum+=number;
        print_Sum(number +1, N, sum);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Solution Sol = new Solution();
        Sol.print_Sum(1,n,0);
        
    }
}
import java.util.Scanner;
class Solution{
    public void print_Numbers(int number){
        if(number == 0){
            return;
        }
        System.out.println(number);
        print_Numbers(number -1);
    }
}
class n_To_One {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        Solution Sol = new Solution();
        Sol.print_Numbers(n);
    }
}
import java.util.Scanner;
class Solution{
    public void print_name(int n, String name){
        if(n<=0){
            return;
        }
        
            System.out.println("harshith");
            n--;
            print_name(n,name);
        
    }
}
class name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String name = "harshith";
        Solution sol = new Solution();
        sol.print_name(n,name);
    }
}
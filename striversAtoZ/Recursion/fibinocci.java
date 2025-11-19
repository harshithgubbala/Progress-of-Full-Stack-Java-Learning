class Solution1{
    static void fib(int n1,int n2,int n){
        if(n == 0){
            return;
        }
        int temp = n1+n2;
        System.out.print(temp + " ");
        fib(n2,temp,n-1);
    }
}
class Main {
    public static void main(String[] args) {
        int n1 = 0, n2 = 1,n =5; 
        Solution1 obj = new Solution1();
        if(n == 1){
            System.out.print("0");
        }
        else if(n == 2){
            System.out.print("0 1");
        }
        else {
            System.out.print("0 1 ");
            obj.fib(n1,n2,n -2);
        }
    }
}
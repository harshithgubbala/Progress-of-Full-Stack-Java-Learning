class Main {
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
        System.out.print(rev_bf(1234));
    }
}
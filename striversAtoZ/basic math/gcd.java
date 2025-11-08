class gcd {
    static void brute_forcef(int a,int b){
        int gcd = 0;
        for(int i = 1; i<= Math.min(a,b); i++){
            if(a%i==0 && b%i==0){
                gcd = i;
            }
        }
        System.out.print(gcd);
    }
    public static void main(String[] args) {
        int n1 = 13,n2 = 12;
        brute_forcef(n1, n2);
    }
}
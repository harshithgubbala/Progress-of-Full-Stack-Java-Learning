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
    static void optimal(int a, int b){
        while(a>0 && b>0){
            if(a>b) a%=b;
            else b%=a;
        }
        System.out.print((a==0)? b: a); 
    }
    
    public static void main(String[] args) {
        int n1 = 12,n2 = 20;
        brute_forcef(n1, n2);
        System.out.println();
        optimal(n1,n2);
    }
}
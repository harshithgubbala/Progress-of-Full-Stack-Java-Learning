class count_digits {
    static void optimal(int x){
        int sum = (int)(Math.log10(x)) + 1;
        System.out.println(sum);
    }
    static void brute_force(int y){
        int cnt = 0;
        while(y!=0){
            y = y / 10;
            cnt = cnt + 1;
        }
        System.out.println(cnt);
    }
    public static void main(String[] args) {
        optimal(1000);
        brute_force(1000);
    }
}

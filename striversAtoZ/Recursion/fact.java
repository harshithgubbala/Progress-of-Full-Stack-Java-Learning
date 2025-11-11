class Solution{
    public int fact1(int n){
        if(n==0){
            return 1;
        }
        return n*fact1(n-1);
    }
}
class fact {
    public static void main(String[] args) {
    int n = 6;
    Solution fac= new Solution();
    System.out.println(fac.fact1(n));
    }
}
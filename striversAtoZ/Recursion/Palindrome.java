class Solution{
    static boolean palindrome_Check(String str,int i){
        //base condition
        int l = str.length();
        if(i > l/2){
            return true;
        }
        if(str.charAt(i) != str.charAt(str.length() - i -1) ) {
            return false;
        }
        i++;
        return palindrome_Check(str,i);
    }
}
class Main {
    public static void main(String[] args) {
        String str = "yyeyy";
        Solution sol = new Solution();
        boolean pal = sol.palindrome_Check(str,0);
        if(pal){
            System.out.println("Is_Palindrome");
        }
        else{
            System.out.println("Is_Not_Palindrome");
        }
        
    }
}
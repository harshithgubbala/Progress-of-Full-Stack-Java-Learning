class Palindrome  {
    public static void main(String[] args) {
        String str = "aaabbaa a";
        int ptr1 = 0;
        int ptr2 = str.length() -1;
        boolean isPalindrome = true; 
        while(ptr1<ptr2){
            char i = str.charAt(ptr1);
            char j = str.charAt(ptr2);
            if(!Character.isLetterOrDigit(i)){
                ptr1++;
                continue;
            }
            if(!Character.isLetterOrDigit(j)){
                ptr2--;
                continue;
            }
            if(Character.toLowerCase(i) ==Character.toLowerCase(j)){
                ptr1++;
                ptr2--;
                isPalindrome = true;
            }
            else{
                isPalindrome = false;   
                break;
            }
        }
        if(isPalindrome){
            System.out.println("isPalindrome");
        }
        else System.out.println("is_Not_Palindrome");
    }
}
    


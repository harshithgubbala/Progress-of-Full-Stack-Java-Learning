import java.util.ArrayList;
import java.util.Arrays;
class Solution{
    static void rev_Arraylist(ArrayList<Integer> arrayList){
        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i = arrayList.size() -1; i >= 0; i--){
            newArray.add(arrayList.get(i));
        }
        System.out.println(newArray);
    }
    static int using_Pointer(int )
    
}
class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        Solution Sol = new Solution();
        Sol.rev_Arraylist(arrayList);
    }
}
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Arrays;
import java.util.Collections;
class rev_Array {
    static void rev(Integer[] arr){
            int temp;            int p1 = 0;
            int p2 =  arr.length - 1 ;
            while(p1<p2){
                temp = arr[p1];
                arr[p1] = arr[p2];
                arr[p2] = temp;
                p1++;
                p2--;
            }
            for(int num : arr){
                System.out.print(num + " ");
            }
            
        }
        static void revArrayCollections(Integer[] arr){
            Collections.reverse(Arrays.asList(arr));
            for(Integer num : arr){
                System.out.print(num + " ");
            }
        }
        static void revArrayRecusrion(Integer[] arr,int start,int end){
            int temp;
            if(start < end){
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
                revArrayRecusrion(arr, start + 1,end - 1 );
            }
        }
    public static void main(String[] args) {
        Integer[] arr = {1,2,3,4,5};
        Integer[] arr1 = {1,2,3,4,5};
        rev(arr);
        System.out.println();
        revArrayCollections(arr1);
        System.out.println();
        revArrayRecusrion(arr, 0,arr.length - 1 );
        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}
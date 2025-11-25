import java.util.Scanner;
class Hashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        /* Input for the size of array and declaration*/
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        /*input of array ele*/
        for(int i = 0; i< n; i++){
            arr[i] = sc.nextInt();
        }
        
        /*Hash array Declaration, let max ele of array be 11*/
        int[] hash = new int[11+1]; 
        for(int i = 0; i<n;i++){
            hash[arr[i]] += 1;
        }
        /*enter test cases*/
        int t = sc.nextInt();
        while(t!=0){
            int num = sc.nextInt();
            System.out.println(hash[num]);
            t--;
        }
    }
}
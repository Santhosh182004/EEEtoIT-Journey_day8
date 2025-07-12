import java.util.*;
class Student{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
        }
        
        int k=s.nextInt();
        for(int i=0;i<k;i++){
            int temp=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=temp;
        }
        System.out.println("The left rotated array after "+k+" rotations is: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

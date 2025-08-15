import java.util.Scanner;
class Day1{
  public static void main (String[] args){
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the total elements");
    int n = sc.nextInt();
    int[] arr = new int[n];
    
    for(int i=0;i<n;i++){
      System.out.println("Enter element at index:"+i);
      arr[i] = sc.nextInt();
    }
    int low =0, mid =0,high=n-1;
    while(mid<=high){
      if(arr[mid]== 0){
        int temp = arr[mid];
        arr[mid] = arr[low]; 
        arr[low] = temp;
        mid++;
        low++;
      }else if(arr[mid]==1){
        mid++;
      }else{
        int temp = arr[mid];
        arr[mid] = arr[high]; 
        arr[high] = temp;
        high--;
      }
    }

    System.out.print("[");
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i]);
        if (i < n - 1) {
          System.out.print(", ");
        }
    }
    System.out.println("]");
    sc.close();
  }
}

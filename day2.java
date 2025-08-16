
class Day2{
  public static void main(String [] args){

    int n,sum=0;
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    int arr[] = new int[n-1];
    for(int i=0 ; i<n-1; i++){
      arr[i] = sc.nextInt();
      sum+=arr[i];
    }
    
    actualSum=n*(n+1)/2;
    System.out.println(actualSum - sum);
  }
}

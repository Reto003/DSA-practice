public class checkIfSorted {

  public static void brute(int arr[]){
    // time: O(n^2)
  }

  //& optimal => time: O(n) 
  public static boolean mine_wasOptimal(int arr[]){
    for(int i=1; i<arr.length-1; i++){
      if(arr[i]<=arr[i+1]){
        // nothing
      }else{
        return false;
      }
    }
    return true;
  }
  
  public static void main(String[] args) {
    int arr[] = {1,2,2,5,3,4};
    if(mine_wasOptimal(arr)){
      System.out.println("sorted array");
    }else{
      System.out.println("unsorted array");
    }
  }
}

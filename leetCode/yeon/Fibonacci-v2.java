public class Fibonacci-v2 {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    int N = scanner.nextInt();
    
    int[] nums = new int[N+1]; 
    
    int result = fib(N, nums);
    
    System.out.print("result : " + result);
    
  }
  
  private static int fib(int N, int[] nums) {
    // TODO Auto-generated method stub
    if(N == 0) { 
      
      nums[0] = 0;
      
      return N;
      
    }else if(N == 1) {
      
      nums[0] = 0;
      nums[1] = 1;
      
      return N;
    }
    
    nums[N] = fib(N-1, nums) + nums[N-2];
    
    return nums[N];
  }
}

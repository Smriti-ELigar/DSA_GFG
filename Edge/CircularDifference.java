import java.util.Scanner;

public class Circulardiff {
    public static int circular(int[] a){
        int n = a.length;
        int[] b = new int[n];
        int mod = 1000000007;
      
        for(int i=0; i<n; i++){
            b[i]=Math.abs(a[i]-a[(i+1)%n]);
        }
        //finding xor
        long sum = 0;
        for(int i=0; i<n; i++){
            long xorval = b[i]^i;
            sum = (sum + xorval)%mod;
        }

        return (int)sum;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] a = new int[n];  
      for(int i = 0; i<n; i++){
        a[i]  =sc.nextInt();
      }
      System.out.println(circular(a));
      sc.close();
    }
    
}
//calc absolute diff
//The (i + 1) % N expression ensures that the array wraps around circularly, connecting the last element to the first.  
// For each index i, it calculates the bitwise XOR between B[i] and i (using B[i] ^ i).
// It adds the result to sum, then takes the modulus MOD to prevent overflow.

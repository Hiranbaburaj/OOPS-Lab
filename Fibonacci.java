package Java;

public class fibonacci {
    public static void main(String[] args) {
      int result = sum(12);
      System.out.println(result);
    }
    public static int sum(int n) {
        int i = 0;
        int j = 1;
        int k = 0;
      while (n>=1) {
        System.out.println(i);
        n = n-1;
        k = i+j;
        i = j;
        j = k;
      } 
      return 0;
    }
}

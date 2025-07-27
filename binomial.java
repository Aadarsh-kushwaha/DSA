public class binomial {
    public static int fac(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * fac(n - 1);
    }

    public static void main(String[] args) {
        int u=10,l=6;
        
     
        int f= fac(u)/(fac(l)*fac(u-l));
        System.out.println(f);  // Output: 120
    }
}

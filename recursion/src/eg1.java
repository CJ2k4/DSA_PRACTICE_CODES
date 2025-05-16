public class eg1 {
    public static void main(String[] args) {
        int n = jos(5,3);
        System.out.println(n);
    }
    public static int jos(int n, int k){

        if(n==1) return 0;

        else return (jos(n-1, k) + k)%n;
    }
}

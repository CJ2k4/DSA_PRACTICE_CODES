public class eg5 {

    public static void main(String[] args) {
        int[] arr = {-5, 1, -2, 3, -1, 2 ,-2};

        System.out.println(maxSubArrSum(arr));
    }

    static int maxSubArrSum(int[] arr){
        int[] maxEnding = new int[arr.length];

        maxEnding[0] = arr[0];
        int res = 0;

        for(int i = 1; i< arr.length; i++){
            maxEnding[i] = Math.max(maxEnding[i-1] + arr[i], arr[i]);
            res = Math.max(res, maxEnding[i]);
        }

        return res;
    }
}

public class eg3 {

    //Trapping Water Efficient Solution--------

    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2, 5};

        System.out.println(getWater(arr));
    }

    static int getWater(int[] arr){
        int res = 0;

        int[] lmax = new int[arr.length];
        lmax[0] = arr[0];

        int[] rmax = new int[arr.length];
        rmax[arr.length-1] = arr[arr.length -1];

        for(int i = 1; i<arr.length; i++){
            lmax[i] = Math.max(arr[i], lmax[i-1]);
        }

        for(int i = arr.length-2; i>=0; i--){
            rmax[i] = Math.max(arr[i], rmax[i+1]);
        }

        for(int i = 1; i< arr.length-1; i++){
            res += Math.min(lmax[i], rmax[i]) - arr[i];
        }

        return res;
    }
}

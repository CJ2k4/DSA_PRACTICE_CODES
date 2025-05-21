public class eg2 {


    //Trapping Water NAIVE CODE ------------------



    public static void main(String[] args) {
        int[] arr = {3, 0, 1, 2, 5};

        System.out.println(getWater(arr));
    }

    static int getWater(int[] arr){
        int res = 0;

        for(int i = 1; i<arr.length-1; i++ ){
            int lmax = arr[i];
            for(int j = 0 ; j<i; j++){
                if(arr[j] > lmax) lmax = arr[j];
            }

            int rmax = arr[i];
            for(int j = i+1; j< arr.length; j++) {
                if (arr[j] > rmax) rmax = arr[j];
            }

            res += Math.min(lmax, rmax) - arr[i];
        }

        return res;
    }

}

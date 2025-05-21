//code for maximum number of consecutive 1's in a binary array -----------

public class eg4 {

    public static void main(String[] args) {
        int [] arr = {0, 1, 1, 1, 0, 1 , 1};

        System.out.println(max_consecutive_1(arr));
    }

    static int max_consecutive_1(int [] arr){
        int res = 0, curr =0;

        for(int i =0; i< arr.length; i++){

            if(arr[i] == 0){
                curr = 0;
            }
            else{
                curr++;
                res = Math.max(res, curr);
            }

        }


        return res;
    }

}

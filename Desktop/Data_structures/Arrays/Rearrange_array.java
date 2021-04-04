// rearrange positive and negative numbers with negative coming first

public class Rearrange_array{
    public static void main(String[] args){
        int[] init_arr = new int[] { 12, 11, -13, -5, 6, -7, 5, -3, -6};
        //int[] init_arr = rearrange(init_arr);
        rearrange(init_arr);
         /* for(int i=0; i<init_arr.length; i++){
            System.out.println(init_arr[i]);
        } */
    }

     public static void rearrange(int[] init_arr){
        int temp = 0;
        for(int i=0; i< init_arr.length; i++){
            if(init_arr[i] > 0){

                for(int j=i+1;j<init_arr.length;j++){
                    if(init_arr[j] < 0){
                        temp = init_arr[i];
                        init_arr[i] = init_arr[j];
                        for(int k = i+1;k<=j;k++){
                            temp2 = init_arr[k];

                            init_arr[k] = init_arr[j];

                        }
                    }
                    break;
                }
            }
        }
        //return init_arr;
        for(int i=0; i<init_arr.length; i++){
            System.out.println(init_arr[i]);
        }
    }



}
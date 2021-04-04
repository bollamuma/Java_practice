// declaring array, entering elements, printing them

class Arrays_init_print{
    public static void main(String[] args){
        //int[] arr_int = new int[5];
        int[] arr_int = new int[] {1,2,3,4,5};
        /* for (int i =0; i < arr_int.length; i++) {
            System.out.println("arr[" + i + "] : " + arr_int[i]);
        }*/
        for (int num:arr_int) {

            System.out.println("arr[" +(num-1) + "] : " +num );
        }

        }
    }

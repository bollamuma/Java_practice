//rotate [1,2,3,4,5,6] by 3 elements ------->>  [4,5,6,1,2,3]

class Rotate_array_2{
    public static void main(String[] args){
        int[] rotarr = new int[]{1,2,3,4,5,6};
        int num = 3; //number of elements to be rotated
        int temp1,temp2 = 0;
        for(int j=0;j<num;j++){
            temp1 = rotarr[0];
            rotarr[0] = rotarr[(rotarr.length-1)];

            for(int i = 1; i< rotarr.length; i++){
                temp2 = rotarr[i];
                rotarr[i] = temp1;
                temp1 = temp2;

            }


        }

        for(int i =0; i< rotarr.length;i++){
            System.out.println(rotarr[i]);
        }

    }

}
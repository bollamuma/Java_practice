// rotate d number of elements in array

//[1,2,3,4,5,6] ------>> [4,3,2,1,5,6]

public  class Rotate_array {

    public static int[] rotate(int n, int rotarr[]) {
        int temp = 0;
        for (int i = 0; i < n / 2; i++) {
            temp = rotarr[i];
            int j = n - 1 - i;
            rotarr[i] = rotarr[j];
            rotarr[j] = temp;
        }
        return rotarr;
    }


    public static void main(String[] args) {
        int n = 4;
        int[] rotarr = new int[]{1, 2, 3, 4, 5, 6};
        int rotatedarr[] = rotate(n, rotarr);
        for (int i = 0; i < rotatedarr.length; i++) {
            System.out.println(rotatedarr[i]);
        }
    }



}
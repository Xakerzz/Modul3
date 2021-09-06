public class Arrays {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int[] nums1 = new int[5];
//        nums [0] = 1;
        for (int i = 0; i < nums.length; i++) {
            System.out.println("1: " + nums[i]);
            for (int j = 0; j < nums1.length; j++) {
                nums1[j] = i;
                System.out.println("2: " + nums1[j]);
            }
        }
        int[][]array ={{1,2,3,4,5},{6,7,8,9,10}};
        System.out.println(array[0][2]);

        int[] array1 = new int[11];
        int volue =5;
        for (int i = 0; i < array1.length; i++) {
            array1 [i] = volue;
            System.out.println(array1[i]);
            volue++;
        }
        for (int item:array1) {
            System.out.println(item);
        }

    }


}

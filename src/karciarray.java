public class karciarray {
    public static void main(String[] args) {
        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        int temp;

        for (int i = 0; i < array.length - 1; i++) {
            for (int t = 0; t < array.length - 1 - i; t++) {

                if (array[t] > array[t + 1]) {


                    temp = array[t];
                    array[t] = array[t + 1];
                    array[t + 1] = temp;

            }



        }



    }
        System.out.print("Before ");
        printArray(array);

        System.out.print(" After ");
        printArray(array);




     }


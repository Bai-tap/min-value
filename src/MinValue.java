public class MinValue {
    public static void main(String[] args) {
        int[] array = {29, 30, 51, 59, 9, 888, 123, 4};
        System.out.println("Element of array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        int index = minValue(array);
        System.out.println("\nMin value is: " + array[index]);
    }

    public static int minValue(int array[]) {
        int min = array[0];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[0];
                index = i;
            }
        }
        return index;
    }
}

public class Third {
    public static void main(String[] args) {
        int[] arr = {1, 2, 8, 3, 4, 15, 41, 12, 9, 0};
        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != 0 && arr[i] % 3 == 0) {
                System.out.println(arr[i]);
            }
        }
    }
}


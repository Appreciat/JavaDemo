package algorithm;

/**
 * @author 杨渡翔
 */
public abstract class AbstractAlgorithm {
    public static void quickSort(int[] arr, int l, int r) {
        if (l >= r) {
            return;
        }
        int x = arr[(l + r) >> 1], i = l - 1, j = r + 1;
        while (j > i) {
            do { i++; } while (arr[i] < x);
            do { j--; } while (arr[j] > x);
            if (j > i) {
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }
        quickSort(arr, l, j);
        quickSort(arr, j + 1, r);
    }


    public static void main(String[] args) {

    }
}

public class Merged {
    public static void mergeSort(int arr[], int si, int ei) {
        if (si < ei) {
            int mid = (si + ei) / 2;
            mergeSort(arr, si, mid);
            mergeSort(arr, mid + 1, ei);
            conquer(arr, si, mid, ei);
        }
    }

    public static void conquer(int arr[], int si, int mid, int ei) {
        int merged[] = new int[ei - si + 1];
        int index1 = si;
        int index2 = mid + 1;
        int x = 0;

        while (index1 <= mid && index2 <= ei) {
            if (arr[index1] <= arr[index2]) {
                merged[x++] = arr[index1++];
            } else {
                merged[x++] = arr[index2++];
            }
        }

        while (index1 <= mid) {
            merged[x++] = arr[index1++];
        }
        while (index2 <= ei) {
            merged[x++] = arr[index2++];
        }

        for (int i = 0; i < x; i++) {
            arr[si + i] = merged[i];
        }
    }

    public static void main(String args[]) {
        int arr[] = {10, 4, 7, 3, 8, 2};
        int n = arr.length;
        
		mergeSort(arr, 0, n - 1);

		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
    }
}

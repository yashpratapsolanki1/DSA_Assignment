public class BinarySearch {
    static int search(int[] a, int key) {
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == key) return mid;
            if (a[mid] < key) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] a = {3, 8, 12, 17, 25, 31, 42};
        int index = search(a, 25);
        System.out.println(index == -1 ? "Not found" : "Found at index " + index);
    }
}
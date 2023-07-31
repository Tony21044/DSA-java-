import java.util.*;

public class Heap {
    // Insertion in Heap
    // Conversion in ARRAYLIST
    static ArrayList<Integer> arr = new ArrayList<>();

    // ADD FUNCTION
    public void add(int data) {
        arr.add(data); // data add karne wala
        // child and parent ki baat
        int x = arr.size() - 1; // child
        int par = (x - 1) / 2;

        while (arr.get(x) < arr.get(par)) {
            // swap
            int temp = arr.get(x);
            arr.set(x, arr.get(par)); // setter function for assigning
            arr.set(par, temp);
        }
    }

    // PEEK FUNCTION FOR CHECKING IT IS IN ASCENDING ORDER OR NOT
    public static int peak() {
        return arr.get(0);
    }

    // DELETION IN HEAP
    // PROCESS = 1 = SWAP 1ST AND LAST
    // REMOVE LAST
    // HEAPIFY

    // HEAPIFY METHOD
    public void heapify(int i) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int minIdx = i;

        if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
            minIdx = left;
        }
        if (right < arr.size() && arr.get(minIdx) > arr.get(right)) {
            minIdx = right;
        }
        if (minIdx != i) {
            int temp = arr.get(i);
            arr.set(i, arr.get(minIdx));
            arr.set(minIdx, temp);

            heapify(minIdx);
        }
    }

    public int remove() {
        int data = arr.get(0);
        int temp = arr.get(0);
        arr.set(0, arr.get(arr.size() - 1));
        arr.set(arr.size() - 1, temp);

        arr.remove(arr.size() - 1);
        heapify(0);
        return data;
    }

    public boolean isEmpty() {
        return arr.size() == 0;
    }

    public int peek() {
        return arr.get(0);
    }

    // HEAP SORT
    // There are two types of heaps:
    // 1. Max Heap (Ascending Order)
    // 2. Min Heap (Descending Order)

    // Create a Max Heap
    // Perform Heapify in all leaf nodes
    // Push largest at the end
    // Pick largest ones and remove it, and perform this procedure until the last
    // largest element left

    public static void heapSort(int arr[]) {
        int n = arr.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, i, n);
        }

        for (int i = n - 1; i > 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, 0, i);
        }
    }

    private static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        int maxIdx = i;

        if (left < size && arr[left] > arr[maxIdx]) {
            maxIdx = left;
        }
        if (right < size && arr[right] > arr[maxIdx]) {
            maxIdx = right;
        }

        if (maxIdx != i) {
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;
            heapify(arr, maxIdx, size);
        }
    }

    // NEAREST CARS
    // We have co-ordinates, and we need to find the three nearest cars from the
    // origin using the distance formula D = X*X + Y*Y.

    static class Points implements Comparable<Points> {
        int x;
        int y;
        int distSq;
        int idx;

        // constructor
        public Points(int x, int y, int distSq, int idx) {
            this.distSq = distSq;
            this.x = x;
            this.y = y;
            this.idx = idx;
        }

        @Override
        public int compareTo(Points p2) {
            return this.distSq - p2.distSq; // comparing both of them
        }
    }

    public static void main(String args[]) {
        // Example Usage

        // Using PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);
        while (!pq.isEmpty()) {
            System.out.println(pq.peek());
            pq.remove();
        }

        // Using Custom Heap Class
        Heap h = new Heap();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(7);
        while (!h.isEmpty()) {
            System.out.println(h.peek());
            h.remove();
        }

        // Using Heap Sort
        int arr[] = { 1, 2, 4, 5, 3 };
        heapSort(arr);

        // Print
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // NEAREST CARS
        int pts[][] = { { 3, 3 }, { 5, -1 }, { 2, 4 } };
        int k = 2;

        PriorityQueue<Points> pqPoints = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][1];
            pqPoints.add(new Points(pts[i][0], pts[i][1], distSq, i));
        }

        // nearest k cars
        for (int i = 0; i < k; i++) {
            System.out.println("Car " + pqPoints.remove().idx);
        }
    }
}

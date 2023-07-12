/*import java.util.*;
import java.util.PriorityQueue;

import Heap.Student.Points;

import java.util.ArrayList;
public class Heap {
    //Insertion in Heap 
    //conversion in ARRAYLIST
    static ArrayList <Integer> arr = new ArrayList<>();
    //ADD FUCNTION
    public void add(int data){
        //add in last 
        arr.add(data); //dasta add krne vala 
        //child and parent ki baat
        int x = arr.size()-1; //child 
        int par = (x-1)/2;

        while(arr.get(x) < arr.get(par)){
            //swap
            int temp = arr.get(x);
            arr.set(x,arr.get(par)); //setter fyunctioj for assigning 
            arr.set(par , temp);
            }
        }
          //PEEK FUNCTION FOR CHECKING IT IS IN ASCENDITKPO=NG ORFDER OR NOTB
          public static int peek(){
            return arr.get(0);
        }


    
    //storing objects creating static class
    static class Student implements Comparable<Student>{
        String name;
        int rank;
        private int i;
        public Student(String name , int rank){
            this.name = name;
            this.rank = rank;
        }
        //overide method 
        public int compareTo(Student s2){
            return this.rank- s2.rank;
        }

        //DELETE IN HEAP 
        //PROCESS = 1 = SWAP 1ST AND LAST
        //REMOVE LAST 
        //HEAPIFDY 

        //HEAPIFY METHOD 
        public void heapify(int i) {
            int left = 2*i+1;
            int right = 2*i+2;
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


        //QUE = HEAP SORT 
        //PROPCEDURE = There are two types of heaps 
        //i = MAX HEAP = ASCXENDING OREDEWR 
        //2 = MIN HEQO = DESCENDING ORDER 
        //1 = CREATEV A MAX HEAP 
        //2 = PERFORM HEAPIFY IN ALL LEAF NODES 
        //3 = PUSH LARGEST AT THE END 
        //4 = PICK LARGESTR ONES AND REMOVE IT AND PERFORM THIS PROCEDURE UNTILL LAST LARGEST ELEMENT LEFT


        //STEP 1
        public static void heapSort(int arr[]) {
            int n = arr.length;
            for (int i = n/2 - 1; i >= 0; i--) {
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
            int left = 2*i + 1;
            int right = 2*i + 2;
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

        //NEARBY CARS
        //HUME CO ORDIMATES DIE HONGE ,WE NEED TO FINF THRE NEAREST CARS FROM THE ORIGIN USING DISTASNCE FORMULA 
        //D URX*x + y*y
        static class Points implements Comparable<Points>{
            int x ;
            int y ;
            int distSq;
            int idx;
            //constructor 
            public Points (int x , int y , int distSq , int idx){
                this.distSq = distSq;
                this.x = x;
                this.y = y;
                this.idx = idx;
            }
            @Override 
            public int compareTo(Points p2){
                return this.distSq-p2.distSq;//commpairing boh of them 

        }
    }
        public static void main(String args[]) {
            
            PriorityQueue<Integer> pq = new PriorityQueue<>();
            Heap h = new Heap();
            pq.add(3);
            pq.add(4);
            pq.add(1);
            pq.add(7);
            while (!pq.isEmpty()) {
                System.out.println(pq.peek());
                pq.remove();
            }
            while (!h.isEmpty()) {
                System.out.println(h.peek());
                h.remove();
            }

            int arr[] = {1,2,4,5,3};
            heapSort(arr);

            //print
            for(int i = 0; i<arr.length ; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    
    
    }
    int pts[][] = {{3,3} , {5,-1} , {2,4}};
    int k =2;

    PriorityQueue <Points> pq = new PriorityQueue<>();
    for(int i = 0; i<pts.length;i++){
        int distSq = pts[i][0] * pts[i][o] + pts[i][1] * pts[i][0];
        pq.add(new Point(pts[i][0] , pts [i][1] , distSq,i));
    }

    //neares56t k cars 
    for(int i = 0; i<k;i++){
        System.out.println("c" + pq.remove().idx);
    }
}










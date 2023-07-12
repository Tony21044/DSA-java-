/*import java.util.HashSet;
import java.util.*;
import java.util.HashMap;
public class Hashing{
    

    
    
    //main func
    public static void main(String args[]){
        int arr[] = {15,-2,2,-8,1,7,10,23};
        HashMap<Integer , Integer> map = new HashMap<>(0, 0);
        //sum idx kon hum hasah map me store karege
        int sum  = 0 ;
        int len = 0;

        for(int j = 0; j<arr.length; j++){
            sum += arr[j];
            if(map.containsKey(sum)){
                len = Math.max(len, j-map.get(sum));

            }else{
                map.put(sum, j);
            }
            System.out.println("  "+ len);
        }
        //que 4 = Largest subarray with 0 sum 

        //QUE 3 = 
        //Itenary of Tickets 
        //basically we need to find the actual journey form where to where 
        //a trable wilkl give to us them we hjave to find the statrytinf point 
        //STATRTING POINT = HOW??
        //THE PATH JHA SE JATE TO HAI PR ATE NHI LAUTKAR THEKK HAI?>??
        

        //ITERATION ON HASHSET 
        // HashSet <String> cities = new HashSet<>(0, 0);
        // cities.add("Delhi");
        // cities.add("Mumbai");
        // cities.add("Noida");
        // cities.add("Bengaluru");
        // //iterator loop method 
        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        //advancxed loop method 
        
        //UN8ION AMD INTERSECTION OF TWO ARRAYS 
//         int arr1[] = { 7,3,9};
// int arr2[] = { 5,7,8,10};
// HashSet<Integer> set = new HashSet<>();

// //function for union
// //basic for loop 
// for(int i = 0; i < arr1.length; i++){
//     set.add(arr1[i]);
// } 
// for(int i = 0; i < arr2.length; i++){
//     set.add(arr2[i]);
// }

// System.out.println("Union jo hasi hamara vo hai: " + set.size());

        //intersdection
        //logic = repetion vale element of delete krege pr couunt varruasvle ko ++ karefe 
        set.clear();
        for(int i = 0 ; i<arr1.length;i++){
            set.add(arr1[i]);
        }
        //bakchodi statrts 
        int count = 0;
        for(int i = 0;i<arr2.length;i++){
            //checking repetitipn 
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }

        }
        System.out.println();







        //HASH SEWT FUNCTION 
        // HashSet<Integer> set= new HashSet<>(0, 0);
        // set.add(1);
        // set.add(2);
        // set.add(3);
        // set.add(4);
        // set.add(4);
        // set.add(3);

        // System.out.println(set);
        // // IF ands else condition for checking the other operations
        // set.remove(1);
        // System.out.println(set.isEmpty());
        // if(set.contains(1)){
        //     System.out.println("set contains");
       
        // }
        // //create a hash map
        // HashMap<String , Integer> hm = new HashMap<>();
        // hm.put("China", 150);
        // hm.put("US", 50);
        // hm.put("INDONESIA", 6);
        // hm.put("Nepal", 6);

        // //ITERATION FUNC 
        // Set<String> keys = hm.keySet();
        // System.out.println(keys);

        // //foreach loop = it is used for performing iteration in an ARRAYLIST 
        // for(String k : keys){
        //     System.out.println("keys =" +k+ ",value = " + hm.get(k));
        // }
       
        // //insertr 
        // hm.put("India", 100);
        // hm.put("china", 150);
        // hm.put("us", 50);
        // System.out.println(hm);


        // //GET FUNCTION 
        // int population = hm.get("India");
        // System.out.println(population);
        // //will return null if the value doesnt exists!!


        // //CONTAINS FUNCTION
        // System.out.println(hm.containsKey("India"));


        //REMOVE FUNCTION 
    

        // System.out.println(hm.remove("china"));
        




    }
}
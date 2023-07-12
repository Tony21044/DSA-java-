import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Set;

import javax.sound.sampled.SourceDataLine;

public class tcGreddyAlgo {
    // //for sorted arrray
     public static void main(String args[]){
    //     //defining array 
    //     int start[] = {1,3,0,5,8,5};
    //     int end [] = {2,4,6,7,9,9};

    //     //Sorting = end time basis
    //     int maxAct = 0;
    //     ArrayList <Integer> ans = new ArrayList<>();

    //     //1str activity 
    //     maxAct = 1;
    //     ans.add(0);
    //     int lastEnd = end[0];
    //     for(int i = 0;i<end.length;i++){
    //         if(start[i] >= lastEnd){

    //             //activity select
    //             maxAct ++;
    //             ans.add(i);
    //             lastEnd = end[i];            
    //     }
    // }
        

    //     System.out.println("max activities = " + maxAct);
    //     for(int i = 0;i<ans.size(); i++){
    //         System.out.println("A " + ans.get(i) + " ");
    //     }
    //     System.out.println();
    
    // }   


//FOR UNSORTED AARRAY 
//WE GONA USE COMPARATER OR WE CAN SAY LAMBDA FDUCNTION
//LAMBDA FUNC ARE THOSE WHICH AARE USE TO COMPRESS ORF ESE HI KOI BAKCBODII THEKKK HAII 

// int start[] = {1,3,0,5,8,5};
// int end [] = {2,4,6,7,9,9};

// int activities[][] = new int[start.length][3];
// for(int i = 0; i<start.length;i++){
//     activities[i][0] = i;
//     activities[i][1] = start[i];
//     activities[i][2] = end[i];
// }

//     //lamvdafunction wqe gona use here 
//     Arrays.sort(activities , Comparator.comparingDouble(o -> o[2]));
//     //FO R SORTING AT THE ENDTIME



//         //Sorting = end time basis
//         int maxAct = 0;
//         ArrayList <Integer> ans = new ArrayList<>();

//         //1str activity 
//         maxAct = 1;
//         ans.add(activities[0][0]);
//         int lastEnd = activities[0][2];
//         for(int i = 1;i<end.length;i++){
//             if(activities[i][1] >= lastEnd){

//                 //activity select
//                 maxAct ++;
//                 ans.add(activities[i][0]);
//                 lastEnd = activities[i][2];          
//         }
    
        

//         System.out.println("max activities = " + maxAct);
//         for(int i = 0;i<ans.size(); i++){
//             System.out.println("A " + ans.get(i) + " ");
//         }
//         System.out.println();
    
//     } 
// }

//QUE - Maxc length of Chain of pairs
//Approach - We nne dto find ther max chain of pairs and it is ame as Greedy approach and that maAIN CONDITION 
//PAIR KA START > last selkectedx ke end se 

// public static void main(String args[]){
//     int pairs[][] = {{5,24} , {39,60} , {5,28} , {27,40} , {50,90}};
//     Arrays.sort(pairs , Comparator.comparingDouble(o -> o[1]));

//     //chale shueru karein
//     int chainLen = 1;
//     int chainEnd = pairs[0][1]; // chain  end = previous selected 
//     for(int i = 1; i<pairs.length; i ++){
//         if(pairs[i][0] > chainEnd){
//             chainLen++;
//             chainEnd = pairs[i][1];
//         }
//         System.out.println("maxc chain lewngth = " +  chainLen);
//     }  
// }



//QUE - Min absolute difference 
//Approach = We need to find min abs via substracting  BOTH ARRAYS ek dysre se
// public static void main(String [] args){
//     int A[] = {1,2,3};
//     int B[] = {2,1,3};
//     Arrays.sort(A);  // for sortinng single line or single dimension
//     Arrays.sort(B);

//     int minDiff = 0;
//     for(int i = 0 ; i< A.length; i ++){
//         //DIRECT FUNVC TO FIND MIN 
//         minDiff += Math.abs(A[i] - B[i]);
//     }
//     System.out.println("min abs = " + minDiff);
//  }


 //Fractional knapsack vvvvimp
 //APPROACH = Knapsck vhi borfi or useme dalne vala saman ki bakchodi 
 //we are usinmg greedy so wwe neeed to put in max value with min weight
 //We need to figure it outtttttt
 //hum ratio nikal krkr unhe descndng me sort kie
//  

//QUE - INDIANCOINS 
//APPROAch = greedy apppr lagani hai , ismew we need to total p tghe money with the procedure of ki sbse phla sbse bada note thern amnt kioo pura krn k lie vhoi sabbb 
//descending order 

//
// 


//QUE - JOB SEQUENCXING PROBLEM 
//aPPROACXH = Job ki profit and deadline ke accordinbg hum unhe arrange karlege hum 
//SORT ON THE BASIS OF PROFIT 
// static class job{
//     int deadline;
//     int profit;
//     int id; //index for iteration

//     public job(int i , int d , int p){
//         id = i;
//         deadline = d;
//         profit = p ;
//     }

//     public static void add(tcGreddyAlgo.job job) {
//     }
// }
// public static void main(String args[]){
//     int jobsInfo[][] = {{4,20} , {1,10} , {1,40} , {1,30}};

//     ArrayList <job> Jobs = new ArrayList<>();
//     for(int i = 0 ; i<jobsInfo.length ; i++){
//         job.add(new job(i , jobsInfo[i][0] , jobsInfo[i][1]));
//     }
//     Collections.sort(Jobs,(obj1 , obj2) -> obj2.profit-obj1.profit );
//     ArrayList <Integer> Seq = new ArrayList<>();
//     int time = 0;
//     Jobcurr = Jobs.get[i];
//     if(curr.deadLine > time){
//         Seq.add(curr.id);
//         time++;
//     }

//     //print
//     System.out.println("max jobs " +  Seq.size());
//     for(int i = 0; i<seq.size(); i++){
//         System.out.print(o Set.get(i) + " ");
        
//     }
//     System.out.println();
// }

//QUE - CHOCOLA BPROBLEM = A Chocolate given hai humn usk equal smallest peice krn hai with minu=nun cost
//choco ko div krn ke lie horz and vert lines ki cost hai then build up ther logic and do code 
//Procedure -  


int n = 4 , m = 6;
Integer costVer[] = {2,1,3,1,4};
Integer costHor[] = { 4,1,2};

Arrays.sort(costVer , Collections.reverseOrder());
Arrays.sort(costHor , Collections.reverseOrder());

int h = 0 , v = 0;
int hp = 1;  int vp = 1;
int cost = 0;

//consditions 
while(h<costHor.length && v<costVer.length){
    if(costVer[v] <= costHor[h]){
        cost += (costHor(h) * vp);
        hp++;
        h++;
    }else{
        cost += (costVer[v] * hp);
        vp++;
        v++;
    }
}

//LEFT OVER PARTS OF THE CHOCO;ATE
while(h< costHor.length){
    cost += (costHor[h] * vp);
    hp++;
    h++;
}

while(v < costVer.length){
    cost += (costVer [v] * hp);
    vp++;
    v++;
}

System.out.println( " min cost"  +  cost);
    





}

    private static int costHor(int h) {
        return 0;
    }






}






public class insertionsort1 { //insertion sort ascending
    public static void main(String[] args) {
        int []Array={1,4,2,5,6,8,10,9};
        int n=Array.length;

        for(int i=1;i<n;++i){ //iterate over each value in array starting from 1

            int placeholder=Array[i]; //choose the placeholding  value
            int j=i-1; //to start checking from the left of the array from placeholding value

            while(j>=0 && Array[j]>placeholder){ //looping until any larger value isnt present
                Array[j+1]=Array[j]; //change postion  right if value larger
                j--; //moving the checker to the left to start to see other value
            }

            Array[j+1]=placeholder; //moving the placeholder to the empty place after sorting 
        }
    }
}

package loops.array;
class rev{
public static void reverse(int[]arr){
    int i=0;
    int j=arr.length-1;
    while(i<j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        i++;
        j--;
    }  
}

public static void printArray(int[]arr){
for(int num:arr){
            System.out.println(num+" ");
        }
}
}

public class reverseArray {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        System.out.println("original array");
        rev.printArray(arr);
        rev.reverse(arr);
        System.out.println("reversed array");
       rev.printArray(arr);

    }

}


import java.util.*;

public class Arrays {
    // Delete Value from Array
    public static void deleteValue(int ar[],int val){
        int i;
        for(i=0;i<ar.length;i++){
            if(ar[i]==val) break;
        }
        if(i==ar.length){
            System.out.println("Element not found");
            return;
        }
        for(int j=i;j<ar.length-1;j++){
            ar[j]=ar[j+1];
        }
        ar[ar.length-1]=0;
    }

    // Delete Value from Array at given position
    public static void deleteValueAtPostion(int ar[],int pos){
        if(pos<0 || pos>=ar.length){
            System.out.println("Invalid position");
            return;
        }
        for(int i=pos-1;i<ar.length-1;i++){
            ar[i]=ar[i+1];
        }
        ar[ar.length-1]=0;
    }

    // Linear Search
    public static void LinearSearch(int ar[],int val){
        int i;
        for(i=0;i<ar.length;i++){
            if(ar[i]==val) break;
        }
        if(i==ar.length){
            System.out.println("Element not found");
            return;
        }
        System.out.println((i+1));
    }

    // Binary Search
    public static int BinarySearch(int ar[],int val,int start,int end){
        if(ar.length==0 || start>end){
            return -1;
        }
        int mid=(start+end)/2;

        if(val==ar[mid]) return mid+1;

        if(val<ar[mid]) return BinarySearch(ar, val, start, mid-1);
        else return BinarySearch(ar, val, mid+1, end);
    }

    public static void main(String args[]){
        int ar[]={12,34,45,56,67,78,89,90};

        System.out.println("Array elements are:");
        for(int ele:ar) System.out.print(ele+" ");

        System.out.println();

        System.out.println("Deleting element value 45: ");
        deleteValue(ar,45); 
        for(int ele:ar) System.out.print(ele+" ");

        System.out.println();

        System.out.println("Deleting element at postion 2: ");
        deleteValueAtPostion(ar,2); 
        for(int ele:ar) System.out.print(ele+" ");

        System.out.println();

        System.out.println("Linear Search of element 67: ");
        LinearSearch(ar,67);

        System.out.println();

        System.out.println("Binary Search of element 67: "+BinarySearch(ar,67,0,ar.length-1));

    }    
}

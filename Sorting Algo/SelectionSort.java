public class SelectionSort {  
    
    public static int minimum(int array[], int n, int i)  
    {  
        int min,pos,j;  
        min = array[i];  
        pos = i;  
        //check the minimum value in unsorted array
        for(j=i+1;j<array.length;j++)  
        {  
            if(array[j]<min)  
            {  
                min = array[j];  
                pos=j;  
            }  
        }  
        //return minimum element position
        return pos;  
    }  
    
    public static void main(String[] args) {  
        int[] array = {12,7,3,24,57,13,5,78,46,9};  
        int i,j,k,pos,temp;  
        for(i=0;i<array.length;i++)  
        {  
            pos = minimum(array,array.length,i);  
            temp = array[i];  
            array[i]=array[pos];  //assign mimimum value i position
            array[pos] = temp;  
        }  
        System.out.println("Sorted array");  
        for(i=0;i<array.length;i++)  
        {  
            System.out.print(array[i] +"\t");  
        }  
    }
}  

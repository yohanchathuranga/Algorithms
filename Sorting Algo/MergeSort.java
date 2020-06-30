public class MergeSort  
    {  
    void merge(int array[], int beg, int mid, int end)  
    {  
        int l = mid - beg + 1;  
        int r = end - mid;  
          
        int Leftarray[] = new int [l];  
        int Rightarray[] = new int [r];  
          
        for (int i=0; i<l; ++i)  
        Leftarray[i] = array[beg + i];  
          
        for (int j=0; j<r; ++j)  
        Rightarray[j] = array[mid + 1+ j];  
          
          
        int i = 0, j = 0;  
        int k = beg;  
        while (i<l&&j<r)  
        {  
            if (Leftarray[i] <= Rightarray[j])  
            {  
                array[k] = Leftarray[i];  
                i++;  
            }  
            else  
            {  
                array[k] = Rightarray[j];  
                j++;  
            }  
            k++;  
        }  
        while (i<l)  
        {  
            array[k] = Leftarray[i];  
            i++;  
            k++;  
        }  
          
        while (j<r)  
        {  
            array[k] = Rightarray[j];  
            j++;  
            k++;  
        }  
    }  
          
    void sort(int array[], int beg, int end)  
    {  
        if (beg<end)  
        {  
            int mid = (beg+end)/2;  
            sort(array, beg, mid);  
            sort(array , mid+1, end);  
            merge(array, beg, mid, end);  
        }  
    }  
    public static void main(String args[])  
    {  
        int[] array = {10,3,56,18,4,89,78,5,62,21}; 
        MergeSort ob = new MergeSort();  
        ob.sort(array, 0, array.length-1);  
          
        System.out.println("Sorted array");  
        for(int i =0; i<array.length;i++)  
        {  
            System.out.print(array[i]+"\t");  
        }  
    }  
}  

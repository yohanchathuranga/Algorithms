public class InsertionSort { 
    public static void insertion(int array[]) {
        for(int k=1; k<array.length; k++)   
        {  
            int temp = array[k];  
            int j= k-1;  
            while(j>=0 && temp <= array[j])  
            {  
                array[j+1] = array[j];   
                j = j-1;  
            }  
            array[j+1] = temp;  
        }  
        System.out.println("Sorted array");  
        for(int i=0;i<array.length;i++)  
        {  
            System.out.print(array[i]+"\t");  
        }  
    } 
    
    public static void main(String[] args) {  
        int[] array = {10,3,56,18,4,89,78,5,62,21};  
        insertion(array);
        
    }  
} 

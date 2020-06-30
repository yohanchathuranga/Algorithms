public class BubbleSort { 
    public static void bubble(int array[]) {
        for(int i=0;i<array.length;i++)  
        {  
            for (int j=0;j<array.length;j++)  
            {  
                if(array[i]<array[j])  
                {  
                    //swap elements position
                    int temp = array[i]; //assign minimum element to temp 
                    array[i]=array[j];  //assign large element to i th position
                    array[j] = temp;   //assign small element to j th position
                }  
            } 
        }
        System.out.println("Sorted array");  
        for(int i=0;i<array.length;i++)  
        {  
            System.out.print(array[i]+"\t");  //print sorted array
        }  
    } 
    
    public static void main(String[] args) {  
        int[] array = {10,3,56,18,4,89,78,5,62,21};  
        bubble(array);
        
    }  
} 

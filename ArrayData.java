import java.util.Random;

public class ArrayData {
    public static int[] arr;//array 
    int nElems;
   

    public ArrayData(int max){
        arr= new int[max];
       nElems=0;
    }

    public void Insert(int number){
        for(int i =0; i<arr.length-1; i++){
         Random n =new Random();
         arr[i] = n.nextInt(99);
        }
       
       nElems++;

    }

    public void Display(){
        for(int j=0; j<arr.length;j++){
            System.out.println(arr[j] +"");
            System.out.println("\t" + arr[j]);
        }
       

    }
     
    public static void BubbleSort(int[] arr){
      

     boolean flag = false;
        for (int i=arr.length-1; i>=0; i--){
            for (int j=0; j<i; j++){
                    if(arr[i]>arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        flag =true;

                    }     
            }
        }
           if (flag==false){
            
            System.out.println("the flag is :" +flag);
           }
            
        ;
    }

   public static void SelectionSort(int []arr ){
    for(int i=0; i<arr.length-1; i++){
        int min=i;
        for(int j=i+1; j<arr.length; j++){
            if(arr[j]<arr[min]){
              int temp=arr[min];
              arr[min]=arr[j];
              arr[j]= temp;
            }
        }
    }
   }

   public void InsertionSort(int [] arr){
    for (int i = 1; i < arr.length; ++i) {
        int key = arr [i];
        int j = i - 1;

        // Move element that are greater than key, to one position ahead of their current position
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr [j];
            j = j - 1;
        }
        arr[j + 1] = key;
    }
}
public  void measureTime(Runnable runnable) {
    long startTime = System.nanoTime();
    runnable.run();
    long endTime = System.nanoTime();
    long elapsedTime = endTime - startTime;
    System.out.println("Time taken: " + elapsedTime + " nanoseconds");
}






   }




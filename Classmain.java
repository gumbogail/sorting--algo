/**
 * Classmain
 */
import java.util.Random;
import java.util.Scanner;
public class Classmain {




public static void main(String[] args) {


//prompting the user 
Scanner sc= new Scanner(System.in);
System.out.println("Please select the size of array you want to sort");
int max=sc.nextInt() ;
//Random rn = new Random();
//int number=0;
//for(int Value =0; Value<=98; Value++){
//number = rn.nextInt(98);
//System.out.println(number+ "");
}
ArrayData arr ;
arr= new ArrayData(max);
arr.Insert(number);
arr.Display();
System.out.println("Please select the sorting algorithm you want to use \n select b for bubble sort, i for nsertion sort and s for selection sort ");
Scanner scanner= new Scanner(System.in);
String sort=scanner.nextLine();

if(sort=="i"){
    arr.InsertionSort(null);
    Runnable InsertionSortRunnable = () -> {
        arr. InsertionSort(null);
     };
        arr.measureTime(InsertionSortRunnable);
}
else if(sort=="b"){
    arr.BubbleSort(null);

    Runnable BubbleSortRunnable = () -> {
        arr.BubbleSort(null);
     };
        arr.measureTime(BubbleSortRunnable);
}
else if(sort=="s"){
    arr.SelectionSort();

    Runnable SelectionSortRunnable = () -> {
        arr.SelectionSort();
     };
        arr.measureTime(SelectionSortRunnable);
}
//else{
   // System.out.println("please enter valid  letter:");
}   




}

package Session7;

// Insertion Sorting 
public class TestTwo {
	
	public static void insertionSort(int array[]){
		int n = array.length;
		for(int j = 0; j < n; j++){
			int key = array[j];
			int i = j-1;
			while((i > -1) &&(array[i] > key)){
				array[i+1] = array[i];
				i--;
			}
			
			array[i+1] = key;
		}
				
		
	}
	
	
	public static void main(String[] args) {
		int [] arrayOne = {12, 9, 4, 99, 120, 1, 3, 10};
		System.out.println("Before Insertion Sorting.");
		for(int i : arrayOne){
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		insertionSort(arrayOne);
		
		System.out.println("After Insertion Sort.");
		
		for(int i : arrayOne){
			System.out.print(i +" ");
		}
	}
	
	

}

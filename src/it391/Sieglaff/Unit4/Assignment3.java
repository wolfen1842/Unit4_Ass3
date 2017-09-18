package it391.Sieglaff.Unit4;

public class Assignment3 {

	/**
	 * Main entry point for the program
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] studentGrades = {65, 95, 75, 55, 56, 90, 98, 88, 97, 78};
		int[] tempArray = studentGrades;
		int low = 0;
		int high = studentGrades.length-1;
		
		sortArrayDes(studentGrades, low, high);
		printArray("Quick Sort Descending.", studentGrades);
		
		low=0;
		high = tempArray.length -1;
		sortArrayAsc(tempArray, low, high);
		printArray("Quick Sort Ascending.", tempArray);
	}// end main

	private static void sortArrayAsc(int[] grades, int low, int high) {
		if(grades == null || grades.length == 0) return;
		
		if(low>=high) return;
		
		int middle = low + (high-low)/2;
		int pivot = grades[middle];
		
		int i = low, j = high;
		
		while(i<=j) {
			while(grades[i]<pivot) {
				i++;
			}
			
			while(grades[j]>pivot) {
				j--;
			}
			
			if(i <= j) {
				int temp = grades[i];
				grades[i]=grades[j];
				grades[j] = temp;
				i++;
				j--;
			}
		}
		
		if(low<j) {
			sortArrayAsc(grades,low,j);
		}
		
		if(high>j) {
			sortArrayAsc(grades,i,high);
		}
	}

	private static void printArray(String heading, int[] grades) {
		System.out.println(heading);
		
		for(int grade:grades)
			System.out.printf("%d ", grade);
		
		System.out.println();
	}

	private static void sortArrayDes(int[] grades, int low, int high) {
		if(grades == null || grades.length == 0) return;
		
		if(low>=high) return;
		
		int middle = low + (high-low)/2;
		int pivot = grades[middle];
		
		int i = low, j = high;
		
		while(i<=j) {
			while(grades[i]>pivot) {
				i++;
			}
			
			while(grades[j]<pivot) {
				j--;
			}
			
			if(i <= j) {
				int temp = grades[i];
				grades[i]=grades[j];
				grades[j] = temp;
				i++;
				j--;
			}
		}
		
		if(low<j) {
			sortArrayDes(grades,low,j);
		}
		
		if(high>j) {
			sortArrayDes(grades,i,high);
		}
	}
	
	
}

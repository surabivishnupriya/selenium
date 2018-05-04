package newpackage;

public class QuickSort {

	public static void main(String[] args) {
		int a[] = { 1, 9, 5, 5, 8, 4, 2 };
		int n = a.length;
		//QuickSort qs = new QuickSort();
		//System.out.println(n);
		sort(a, 0, n - 1);

		for (int i :a) {
			System.out.println(i);
		}
	}

	static void sort(int a[] , int start, int end) {
		int q;
		if (start <end) {
			q = partition(a, start, end);
			sort(a, start, q - 1);
			sort(a, q + 1, end);
		}
	}

	static int partition(int a[], int start, int end) {
		// TODO Auto-generated method stub
		int pivot = a[end]; //2
		int i = start - 1; //-1
		int j, temp;
		for (j = start; j < end; j++) {
			if (a[j] <= pivot) { //1<=2 , 9>2
				i++; //0
				temp = a[j]; //1
				a[j] = a[i];//1
				a[i] = temp; //1
			}
		}
		temp = a[i + 1];
		a[i + 1] = a[end];
		a[end] = temp;
			
		return  i+1;
	}			
	
}
package newpackage;


public class AlertDemo {

		public static void main(String[] args) 
		{
		int A[] = {1,2,5,7,3,4,6,};
		int n = A.length;
		int temp = A[n-1];
		int prev,count=0;
		
			
		while(A[temp-1] != temp)
		{
			
		    prev=A[temp-1];
		    A[temp-1]=temp;
		    temp=prev;
		    
		
			
		}	
		    System.out.println(temp);
		
		}	
		
}
      		
import java.util.Scanner;
/**
 * 
 */

/**
 * @author lavish
 *
 */
public class sorting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating a scanner keyboard 	 
		Scanner myKeyboard=new Scanner(System.in);
		
		String Decision = " ";
		do {
				
		int choice; 
		 int array_number [] = new int[5];//the user can enter 5 number and the output will display
		 int n = array_number.length;
		 int low = 999;
		 int temp =0;
		  int i;
		  int j=0;
		  
		
		
		System.out.println("1 : Insertion sort");
		System.out.println("2 : Bubble sort");
		System.out.println("3 : Selection sort");
		System.out.println("4 : Quick sort");
		//The user can make their choice of what sorting theory He/She want to use
		System.out.println("Please enter your choice:");
		choice= myKeyboard.nextInt();

		if (choice!= 1 && choice!= 2 &&  choice!= 3 &&  choice!= 4) {
			System.out.println("Enter a valid number");
		}
		if (choice==1) {
			//insertion sorting
			for ( i=0;i<n;i++) {
		    	   System.out.println("Please enter number:");
		    	   array_number[i] = myKeyboard.nextInt();
		       }
		       
		       boolean swap;
			do {   
		    	 swap = false;
		             for (i=1;i<n;i++) {
		    	   temp = array_number[i];
		    	   j=i-1;
		    	   while(temp < array_number[j]){
		    		   //the smallest value is swapped
		    		   temp= array_number[j];
		    		   array_number[j]= array_number[i];
		    		   array_number[i]= temp;
		    		   swap= true; //
		    	   }
		             }
		       }
		       while(swap);
			
		       for ( i=0;i<n;i++) {
		    	   System.out.print( array_number[i] +" ");
		       }
			
		}
		else if (choice==2) {
			//bubble sort
			for ( i=0;i<n;i++) {
		    	   System.out.println("Please enter number:");
		    	   array_number[i] = myKeyboard.nextInt();
		       }
			boolean swap;
			do {   
		    	 swap = false;
		             for ( i=1;i<n;i++) {
		    	   temp = array_number[i];
		    	   j=i-1;
		    	   while(temp < array_number[j]){
		    		   //the smallest value is swapped
		    		   temp= array_number[j];
		    		   array_number[j]= array_number[i];
		    		   array_number[i]= temp;
		    		   swap= true;
		    	   }
		             }
		       }
		       while(swap);
		       for ( i=0;i<n;i++) {
		    	   System.out.print(array_number[i] +" ");
		       }
		}
		
		//selection sort
		else if (choice==3) {
			for ( i= 0;i < n;i++) {
		 		 System.out.print("Please enter number :");
				 array_number[i] = myKeyboard.nextInt();
						
			}
		 	
		 for ( i=0;i < n;i++) {                            
			 for ( j= i +1;j < n;j++) {   	 			
				 if  (array_number[i] > array_number[j] ) {    
					  temp = array_number[j];
					 array_number[j]= array_number[i];
					 array_number[i]= temp;
					 
				 }
			 }

	}
		 for (i= 0;i < n;i++) {
			 System.out.print( array_number[i] +" ");
			 
		 }

		}

		else if(choice==4) {
			for ( i= 0;i < n;i++) {
		 		 System.out.print("Please enter number :");
				 array_number[i] = myKeyboard.nextInt();
				 
    }
				 //q_s--> Quick sort
					 sorting q_s= new sorting();
					 q_s.quickSort (array_number, 0, n-1);
					 q_s.printArray(array_number);

		}
		
		 
		
		
		System.out.println(" Do you want to continue again YES/NO");
		Decision = myKeyboard.next();
		}
		while(Decision.equals("YES"));
			System.out.println("Exit");
	}
	

	
	
				
			//we create a function for quick sort so that the pivot can move and to create separate 2 arrays
			int partition(int array_number[] , int left ,int right) {
				int pivot = array_number[(left+ right)/2];//middle array
				
				while(left<=right) {
					while(array_number[left]<pivot) {
						left++;
							
					}
					while (array_number[right]>pivot) {
						right--;
						
					}
					if (left<=right) {
						int temp =array_number[left];
						array_number[left]=array_number[right];
						array_number[right]=temp;
						
						left++;
						right--;
					}
				}
					return left;
				
			}

			void quickSort (int[]array_number, int left,int right) {
				
				int pi=partition(array_number, left, right);
				
				if(left<pi-1) {
					quickSort(array_number,left , pi-1);
					
				}
				if (pi<right) {
					quickSort(array_number, pi,right);
				}
	
			}			
	

				  
				 
		void printArray(int[]array_number) {
			for(int i :array_number) {
				System.out.println(i+" ");
			
		
			}
			
		}
		
		
	}
	
	
	
	
	

			
	
	

	






			
		
	
	

 



			 
			
			
			
			
		
	
	
	
	

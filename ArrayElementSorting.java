package sgPractice.Assignments;
public class ArrayElementSorting {
	public static void main(String[] args) {
		//int[]  samplearray= new int [5];		
		int[]  samplearray1= {1,2,3,4,5};	
		int n = 3;  
		for (int i=0; i<samplearray1.length;i++)
		{System.out.println(samplearray1[i]);
		}for(int i = 0; i < n; i++){  
			  int j, last;
			  last = samplearray1[samplearray1.length-1]; 	          
	            for(j = samplearray1.length-1; j > 0; j--){ samplearray1[j] = samplearray1[j-1];   }
	            samplearray1[0] = last;  
	            System.out.println(); 	            
	            //Displays resulting array after rotation  
	            System.out.println("Array after right rotation: ");  
	            for(int k = 0; k< samplearray1.length; k++){  
	                System.out.print(samplearray1[k] + " ");  
	            }  		}	}}

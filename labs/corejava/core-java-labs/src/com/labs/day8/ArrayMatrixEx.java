package com.labs.day8;

// multidimentional  array example matrix 
//addition

public class ArrayMatrixEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating two matrices    
		int a[][]={{1,1,1},{2,2,2},{3,3,3}};    
		int b[][]={{1,1,1},{2,2,2},{3,3,3}};    
		
		//creating another matrix to store the multiplication of two matrices    
		int c[][]=new int[3][3];  //3 rows and 3 columns  
		
//		// addition
//		
//		for( int i=0; i<3; i++) {
//			
//			for( int j=0; j<3; j++) {
//				
//				c[i][j]=0;
//				for( int z=0; z<3; z++) {
//					
//					c[i][j]=a[i][z] + b[z][j];
//				}
//				//end of z loop  
//				System.out.print(c[i][j]+" ");  //printing matrix element  
//			}
//			//end of j loop  
//			System.out.println();//new line    
//		}
		
				
		// addition of two arrays 
	
		System.out.println();//new line    
		
		for( int i=0; i<3; i++) {
			
			for( int j=0; j<3; j++) {
				
											
					c[i][j]=a[i][j] + b[i][j];
				
				System.out.print(c[i][j]+" ");  //printing matrix element  
			}
			//end of j loop  
			System.out.println();//new line    
		}
		
		
	}

}

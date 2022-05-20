package com.assignments.day2;

//23) Multiply Two Matrices


public class MultiplyTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//creating two matrices    
				int a[][]={{1,3,4},{2,4,3},{3,4,5}};    
				int b[][]={{1,3,4},{2,4,3},{1,2,4}};    
				   
				// First 2D array display
				System.out.println("First 2D Array for Matrix");//new line
				for(int i=0;i<3;i++){    
					for(int j=0;j<3;j++){    
						System.out.print(a[i][j]+" ");    
					}    
					System.out.println();//new line    
				}
				
				
				// Second 2D array display
				System.out.println("\nSecond 2D Array for Matrix");//new line
						
				for(int i=0;i<3;i++){    
					for(int j=0;j<3;j++){    
						System.out.print(b[i][j]+" ");    
					}    
					System.out.println();//new line    
				}
				
				//creating another matrix to store the sum of two matrices    
				int c[][]=new int[3][3];  //3 rows and 3 columns  
				    
				// Second 2D array display
				System.out.println("\nResult of Multiplication of 2 given Matrix:");//new line
						
				//adding and printing addition of 2 matrices    
				for(int i=0;i<3;i++){    
					for(int j=0;j<3;j++){    
						c[i][j]=a[i][j]*b[i][j];    
						System.out.print(c[i][j]+" ");    
					}    
					System.out.println();//new line    
				}    

				
	}

}

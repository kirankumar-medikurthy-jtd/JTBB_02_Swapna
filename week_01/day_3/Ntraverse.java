/*Write a program to print “N” Traversal  elements present in an array?
Example : Input  : [[1 3  4]
                   [6 3 2]
                   [9 2 10]]                          
                                          Output :  9 6 1 3 10 2 4*/



public class Ntraverse 
{

    public static void main(String[] args) 
    {
        int[][] array = {{1, 3, 4,5}, {6, 3, 2,7}, {9, 2, 10,8},{2, 5,6,7}};
        int row = 4;
        int col = 4;
       	// first column traversal of elements
       	for(int i = row-1; i >= 1; i--){ 
       		System.out.print(array[i][0]+" ");
       	} 
       	//left diagonal traversal of elements;
       	int i = 0;
       	int j = 0;
       	while(i < row-1 && j < col-1) {
       		System.out.print(array[i++][j++]+" ");
       	}
       	//last column traversal
       	for(int k = row-1; k>=0; k--){
       		System.out.print(array[k][col-1]+" ");
       	}
       
        
        
    }
}




/*Write a program to print all the element present in the matrix below spiral traversal
             Input : mat[][] = {{1, 2, 3}, 
                                          {4, 5, 6}, 
                                          {7, 8, 9}}
             Output : 1 2 3 6 9 8 7 4 5*/
             
  class SpiralTraversal 
  {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,10},{4,5,6,11},{7,8,9,12},{13,14,15,16}};
        int row = 4;
        int col = 4;
        int T = 0;
        int B = row - 1;
        int L = 0;
        int R = col - 1;
        int dir = 0;
        while( T <= B && L <= R) {
            if(dir == 0) {
                for(int i = L; i <= R; i++) {
                    System.out.print(arr[T][i]+" ");
                }
                T+=1;
            }else if(dir == 1) {
                for(int i = T; i <=B; i++) {
                    System.out.print(arr[i][R]+" ");
                }
                R -= 1;
            }else if(dir == 2) {
                for(int i = R; i >= L; i--){
                    System.out.print(arr[B][i]+" ");
                }
                B -= 1;
            }else {
                for(int i = B; i>=T; i--){
                    System.out.print(arr[i][L]+" ");
                }
                L += 1;
            }
            dir = (dir + 1) % 4;
            System.out.println("direction : " + dir);
        }
    }
}
          


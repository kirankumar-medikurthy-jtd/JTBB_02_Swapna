/*Write a program to find union of two sorted arrays
Input: arr1[] = {1, 3, 4, 5, 7}
        arr2[] = {2, 3, 5, 6} 
Output: Union : {1, 2, 3, 4, 5, 6, 7} */

class UnionofArrays {
    public static void main(String[] args){
        int arr1[] = {1,3,4,5,7};
        int arr2[] = {2,3,5,6};
        int result[] = new int[100];
        for(int i = 0; i < arr1.length; i++){
            result[arr1[i]] += 1;
        }
        for(int i = 0; i < arr2.length; i++){
            result[arr2[i]] += 1;
        }
        for(int i = 0; i < result.length; i++){
            if(result[i] > 0){
                System.out.print(i+" ");
            }
        }
    }
}

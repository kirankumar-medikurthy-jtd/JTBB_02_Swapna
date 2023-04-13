/*Write a program to find a missing number present in an array
Input : array[] = {1,2,4,6,3,7,8}
Output : 5*/



class missingNumber {
    public static void main(String[] args){
        int[] arr = {1,2,4,6,3,7,8};
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if(arr[i] < minNumber) minNumber = arr[i];
            if(arr[i] > maxNumber) maxNumber = arr[i];
        }
        int[] result = new int[100];
        for(int i = 0; i < arr.length; i++){
            result[arr[i]] += 1;
        }
        for(int i = minNumber; i <= maxNumber; i++)
        {
            result[i] += 1;
        }
        for(int i = 0; i < result.length; i++) {
            if(result[i] == 1){
                System.out.println("missing Number : " + i);
            }
        }
        
    }
}    

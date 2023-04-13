/*Given an array that contains both positive and negative integers, find the product of the maximum product subarray. 
            Input: arr[] = {6, -3, -10, 0, 2}
            Output:   180  // The subarray is {6, -3, -10}
           Input: arr[] = {-1, -3, -10, 0, 60}
           Output:   60  // The subarray is {60}*/




class MaxProductSubArray {
    public static void main(String[] args) {
        int[] arr = {6,-3,-10,0,2};
        String MaxProductsubString = "";
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                int product = 1;
                String subStr = "";
                for(int k = i; k <= j; k++){
                    product *= arr[k];
                    subStr += arr[k]+" ";
                }
                if(product > max){
                    max = product;
                    MaxProductsubString = subStr;
                }
                System.out.println(subStr);
            }
        }
        System.out.println("Max Product : " + max+" Max Product Substring : " + MaxProductsubString);
    }
}

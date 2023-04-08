public class Larg {
    public static void main(String[] args) {
        int[] arr = {3, 8, 19, 3, 2, 7, 6};
        int thirdLargest = findThirdLargest(arr);
        int secondSmallest = findSecondSmallest(arr);
        System.out.println("Third largest element: " + thirdLargest);
        System.out.println("Second smallest element: " + secondSmallest);
    }
    
    public static int findThirdLargest(int[] arr) {
        int firstLargest = arr[0];
        int secondLargest = arr[0];
        int thirdLargest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = arr[i];
            } else if (arr[i] > secondLargest) {
                thirdLargest = secondLargest;
                secondLargest = arr[i];
            } else if (arr[i] > thirdLargest) {
                thirdLargest = arr[i];
            }
        }
        
        return thirdLargest;
    }
    
    public static int findSecondSmallest(int[] arr) {
        int firstSmallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < firstSmallest) {
                secondSmallest = firstSmallest;
                firstSmallest = arr[i];
            } else if (arr[i] < secondSmallest) {
                secondSmallest = arr[i];
            }
        }
        
        return secondSmallest;
    }
}


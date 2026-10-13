//public class Count {
   // public static void main(String[] args) {
        // 1. find count of even odd
//      int[] arr = {2,3,5,6,7,9};

//        int Odd = 0;
//        int Even = 0;
//
//        for (int i=0; i< arr.length; i++) {
//            if (arr[i] % 2 == 0) {
//                Even++;
//            } else{
//                Odd++;
//            }
//        }
//        System.out.println("Odd number is: " + Odd);
//        System.out.println("Even number is: " + Even);

        // 2. count negative, positive and zero.

//        int[] arr = {2,4,-1,-6,0,0,1,-4};
//
//        int positive = 0;
//        int negative = 0;
//        int zero = 0;
//
//        for (int i=0; i< arr.length; i++) {
//            if (arr[i] > 0) {
//                positive++;
//            } else if (arr[i] < 0) {
//                negative++;
//            } else {
//                zero++;
//            }
//        }
//        System.out.println("count of positive is: " +positive);
//        System.out.println("count of nagative is: " +negative);
//        System.out.println("count of zero is: " + zero);


        // 3. Reverse an array.

//        int[] arr = {1,2,3,4,5};
//        int start = 0;
//        int end = arr.length-1;
//
//        while (start < end) {
//            int n = arr[start];
//            arr[start] = arr[end];
//            arr[end] = n;
//
//            start++;
//            end--;
//        }
//        for (int num: arr) {
//            System.out.println(num);
//        }

        // 4. find second-largest number in array.

//        int arr[] = {2,1,4,6,7,9,8};
//
//        int largest = arr[0];
//        int second = arr[0];
//
//        for (int i=0; i< arr.length; i++) {
//            if (arr[i] > largest) {
//                largest = arr[i];
//            }
//        }
//        for (int i=0; i< arr.length; i++) {
//            if (arr[i] > second && arr[i] != largest) {
//                second = arr[i];
//            }
//        }
//        System.out.println("second largest no: " +second);

        // 5. sort array in ascending order.

//        int[] arr = {6, 1, 4, 5, 9, 3};
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int num : arr) {
//            System.out.println(num);
//        }

        // 6. searching element from array.

//        int[]arr = {2,4,5,6,10,12};
//        int target = 12;
//
//        for (int i=0; i< arr.length; i++) {
//            if (arr[i] == target) {
//                target = arr[i];
//            }
//        }
//        System.out.println("element search for: " +target);
//    }
//}

// pattern printing

//public class Count {
//    public static void main(String[] args) {
//        int n = 5;
//        for (int i=n; i>=1; i--) {
//            for (int j=1; j<=i; j++) {
//                System.out.print(j);
//            }
//            for (int j=1; j<= (n-i)*2-1; j++ ) {
//                System.out.print(" ");
//            }
//            for (int j=i; j>=1; j--) {
//                if (j < 5) {
//                    System.out.print(j);
//                }
//            }
//            System.out.println();
//        }
//    }
//}

// find largest and second-largest number with method.

//public class Count{
//    static int findLargest(int[] arr) {
//        int largest= Integer.MIN_VALUE;
//        int seclargest = Integer.MIN_VALUE;
//
//        for (int num: arr) {
//            if (num > largest) {
//                seclargest = largest;
//                largest = num;
//            } else if (num > seclargest && num!=largest) {
//                seclargest = num;
//            }
//        }
//        return largest;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {10,20,30,40,50};
//        System.out.println("largest: " + findLargest(arr));
//        System.out.println("second largest: " + findLargest(arr));
//
//    }
//}

// leetcode 167. return the indices with sum of two numbers.

//class Solution {
//    public int[] twoSum(int[] numbers, int target) {
//        int i=0;
//        int j = numbers.length-1;
//
//        while(i<j) {
//            int sum = numbers[i] + numbers[j];
//            if (sum == target) {
//                return new int[] {i+1,j+1};
//            } else if (sum < target) {
//                i++;
//            } else {
//                j--;
//            }
//        }
//        return new int[] {};
//    }
//}
//public class Count {
//    public static void main(String[] args) {
//         int numbers[]= {1, 2, 3, 4, 6, 8, 12, 15};
//         int target = 15;
//         Solution s = new Solution();
//        int[] result =  s.twoSum(numbers, target);
//        System.out.println(result[0] + " " + result[1]);
//
//    }
//}

// leetcode no. 83
//* facing issues to solve it cause of collections.

// try to solve remove duplicates in sorted array.

//public class Count {
//    public static void main(String[] args) {
//        int[] arr = {1, 1, 2, 2, 3, 3, 3, 4};
//
//        for (int i = 0; i< arr.length; i++) {
//            for (int j=i+1; j< arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                } else if (arr[i] != arr[j]){
//                    i++;
//                    j++;
//                }
//            }
//        }
//        for (int num: arr) {
//            System.out.println(num);
//        }
//    }
//}

//class Count {
//    public static int[] search(int[][] arr, int target) {
//        for (int i=0; i<arr.length; i++) {
//            for (int j=0; j<arr[i].length; j++) {
//                if (arr[i][j] == target) {
//                    return new int[] {i,j};
//                }
//            }
//        }
//        return new int[] {-1,-1};
//    }
//
//    public static void main(String[] args) {
//        int[][] arr = {{33,31,29}, {18,16,17}, {12,13,23} };
//        int target = 12;
//        int[] result = search(arr, target);
//
//        for (int num: result) {
//            System.out.println(num);
//        }
//    }
//}

// program using Binary search.

//public class Count {
//    public static int BinarySearch(int arr[], int target) {
//        int left = 0;
//        int right = arr.length-1;
//
//        while(left <= right) {
//            int mid = left+(right - left) /2;
//
//            if(arr[mid] == target) {
//                return mid;
//            } else if (arr[mid] < target) {
//                left = mid +1;
//            } else {
//                right = mid -1;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {10,24,26,27,29};
//        int target = 24;
//        int result = BinarySearch(arr, target);
//        System.out.println(result);
//    }
//}

//public class Count {
//    public static void main(String[] args) {
//        int[] arr = {5, 2, 8, 1, 9, 3};
//
//        for (int i = 0; i < arr.length ; i++) {
//            for (int j = i+1; j < arr.length; j++) {
//                if (arr[i] > arr[j]) {
//                    int temp = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = temp;
//                }
//            }
//        }
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//    }
//}

// Bubble sort

//import java.util.Arrays;
//
//public class Count {
//    public static int[] ascending(int[] arr) {
//        int[] result = Arrays.copyOf(arr, arr.length);
//
//        for (int i=0; i< result.length; i++) {
//            for (int j=i+1; j< result.length; j++) {
//                if (result[i] > result[j]) {
//                    int temp = result[i];
//                    result[i] = result[j];
//                    result[j] = temp;
//                }
//            }
//        }
//        return result;
//    }
//
//    public static int[] desending(int[] arr) {
//        int[] result1 = Arrays.copyOf(arr, arr.length);
//
//        for (int i=0; i< result1.length; i++) {
//            for (int j=i+1; j< result1.length; j++) {
//                if (result1[j] > result1[i]) {
//                    int temp = result1[j];
//                    result1[j] = result1[i];
//                    result1[i] = temp;
//                }
//            }
//        }
//        return result1;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {2,4,3,6,9,5,1};
//        System.out.println("asending" + Arrays.toString(ascending(arr)));
//        System.out.println("descending" + Arrays.toString(desending(arr)));
//    }
//}


//public class Count{
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//
//        int Odd = 0;
//        int Even = 0;
//
//        for(int i=0; i<=arr.length-1; i++) {
//            if (arr[i] % 2 == 0) {
//                Even += arr[i];
//            } else {
//                Odd += arr[i];
//            }
//        }
//        System.out.println("Even number is " + Even);
//        System.out.println("Odd number is " + Odd);
//    }
//
//}

//class Count {
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5,6,8};
//
//        int Even = 0;
//        int Odd = 0;
//
//        for(int i=0; i<= arr.length-1; i++){
//            if (arr[i] % 2 == 0) {
//                Even++;
//            } else {
//                Odd++;
//            }
//        }
//        System.out.println(Even);
//        System.out.println(Odd);
//    }
//}

//class Count {
//    public static void main(String[] args) {
//
//        int m = 5;
//        int n = 5;
//
//        for (int i=0; i<m; i++) {
//            for (int j=0; j<n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//}

//class Count {
//    public static void main(String[] args) {
//        int[] arr = {1,2,7,4,9};
//
//        int max = arr[0];
//        int min = arr[1];
//
//        for (int i=0; i<=arr.length-1; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        System.out.println("The maximum number is:" + max);
//        System.out.println("The minimum number is:" + min);
//    }
//}

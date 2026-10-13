// 1. Printing Solid Matrix Star Pattern
// public class Patterns {
    // public static void main(String[] args) {
//        int n = 5;
//        for (int i=1; i<=n; i++) {
//            for (int j=1; j<=n; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    // 2. Print Right Angle Rectangle.

//        int n = 5;
//        for (int row = 1; row <= n; row++) { // For each row variable column.
//            for (int col = 1; col<=row; col++) { // For each row will print each star. col-> row-> value of row.
//                System.out.print("* ");
//            }
//            System.out.println();
//
//          }

    // 3. Print Right-shifted square/rectangle star pattern

//        int n = 5;
//        for (int row = 1; row<=n; row++) { // Print row star.
//            // For each row -> Spaces and stars
//
//            for (int col=1; col<= n-row; col++) { // For Spaces
//                System.out.print(" ");
//            }
//            for (int col = 1; col<=n; col++) { // For Stars
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    // 4. Print Inverted Right side Rectangle.

//        int n = 5;
//        for (int row = 1; row<=n; row++) { // will print row n times.
//            for (int col = 1; col<=n-row+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

    // 5. Pyramid Star Print.

//        int n=5;
//        for(int row =1; row<=n; row++){
//            for(int col = 1; col<=n-row; col++) {
//                System.out.print(" ");
//            }
//            for(int col =1; col<=2*row-1; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

    // 6. Print Hollow rectangle.

    //  int n = 4;

//        for (int row = 1; row<=n; row++) {
//            for (int col=1; col<=6; col++) {
//                if (row == 1 || row == n) {
//                    System.out.print("* ");
//                } else if (col == 1 || col == 6) {
//                    System.out.print("* ");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

    // Functions program.
    // 1. Print add of two element.

//    static int add(int a, int b) {
//        int result = a+b;
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int total = add(10, 12);
//        System.out.println(total);
//    }

    // 2. Print multiply of two elements.

//  static void multi(int a, int b) {
//        int result = a*b;
//        System.out.println(result);
//    }
//
//    public static void main(String[] args) {
//        multi(18, 2);
//    }

    // 3. Create a function.

//    static void greet() {
//        System.out.println("Hello, Welcome Saurav");
//    }
//
//    public static void main(String[] args) {
//        greet();
//    }

    // 4. Create function with parameter.

//    static void greet(String name) {
//        System.out.println("Hello " + name);
//    }
//
//    public static void main(String[] args) {
//        greet("Saurav");
//    }

    // 5. Check Even or Odd.

//    static boolean isEven(int n) {
//       return n%2==0;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(isEven(11));
//    }

    // 6. Find the largest of two number.

//    static int largest(int a, int b) {
//        if (a > b) return a;
//        else return b;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(largest(12,24));
//    }

    // 7. Find largest element.

//    static int largest(int[] arr) {
//        int max = arr[0];
//        for (int i=0; i<=arr.length-1; i++) {
//            if (max<=arr[i]) {
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {22,36,42,51,99};
//        System.out.println(largest(arr));
//    }

    // 8. Calculate aaray sum.

//    static int sum(int[] arr) {
//        int sum = 0;
//        for (int i=0; i< arr.length; i++) {
//            sum+=arr[i];
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50};
//        System.out.println(sum(arr));
//    }

    // 9. Find largest using ArrayList.

//    static int largest(ArrayList<Integer> list) {
//        int max = list.get(0);
//        for (int i=0; i<list.size(); i++) {
//            if (max < list.get(i)) {
//                max = list.get(i);
//            }
//        }
//        return max;
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(32);
//        list.add(24);
//        list.add(82);
//        list.add(96);
//        list.add(67);
//
//        System.out.println(largest(list));
//    }

    // 10. Count occurrence.

//    static int Find(int[] arr, int target) {
//        int count = 0;
//        for (int i=0; i<arr.length; i++) {
//            if (arr[i] == target) {
//                count++;
//            }
//        }
//        return count;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {12,12,2,22,43};
//        System.out.println(Find(arr, 12));
//    }

    // 11. Find smallest.

//    static int Smallest(int[] arr) {
//        int min = arr[0];
//        for (int i=0; i< arr.length; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = {34,98,23,67,76};
//        System.out.println(Smallest(arr));
//    }

    // 12. Print sum of array.

//    static int Sum(int[] arr) {
//        int sum = 0;
//        for (int i=0; i< arr.length; i++) {
//            sum+= arr[i];
//        }
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {20,12,2,4,6};
//        System.out.println(Sum(arr));
//    }

    // 13. Search an element.

//    static boolean search(int[] arr, int target) {
//        for (int i=0; i< arr.length; i++) {
//            if (arr[i] == target) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {21,22,31,44};
//        System.out.println(search(arr, 32));
//    }

    // 14. Print digits of a number.

//    static void printDigit(int num) {
//        while (num != 0) {
//            int digit = num % 10;
//            System.out.print(digit);
//            num = num/10;
//        }
//    }
//
//    public static void main(String[] args) {
//        printDigit(2345);
//    }

    // 15. Reverse a number.

//    static int reverse(int num) {
//        int reverseNum = 0;
//        while (num != 0) {
//            int digit  = num % 10;
//            reverseNum = reverseNum*10+digit;
//            num = num/10;
//        }
//        return reverseNum;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(reverse(123456));
//    }

    // 16. Find second largest.

//    static int secondLargest(int[] arr) {
//        int largest = arr[0];
//        int secondL = arr[1];
//        for (int i=0; i<arr.length; i++) {
//            if (largest > secondL && secondL > arr[i]) {
//                secondL = arr[i];
//            }
//        }
//        return secondL;
//    }
//
//    public static void main(String[] args) {
//        int[] num = {12,32,45,76,81};
//        System.out.println(secondLargest(num));
//    }

    // 17. Find duplicate.

//    static boolean duplicate(int[] arr) {
//        for (int i=0; i< arr.length; i++) {
//            for (int j=i+1; j< arr.length; j++) {
//                if (arr[i] == arr[j]) return true;
//            }
//        }
//        return false;
//    }
//    public static void main(String[] args) {
//        int[] arr = {10,20,22,20};
//        System.out.println(duplicate(arr));
//    }

    // 18. Find pair with target sum.

//    static void sum(int[] arr, int target) {
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] + arr[j] == target) {
//                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//        int[] arr = {2, 4, 6, 7, 3};
//        int target = 6;
//        sum(arr, target);
//    }
//}
//    public static void main(String[] args) {
//        int [] arr = {7,31,44,92,99};
//        int max = arr[0];
//        for (int i=0; i< arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println(max);
//    }
//}

// 19. Program to remove duplicate numbers in array.

//public class Patterns {
//    static void remove(int[] nums) {
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] == nums[j]) {
//                int temp = nums[i];
//                nums[i] = nums[j];
//                nums[j] = temp;
//                }
//            }
//        }
//    }
//    public static void main(String[] args) {
//     int[] nums = {2,4,9,2,4,1};
//    }
//}

// 20. check whether a number is palindrome or not.

public class Patterns {
    public static void main(String[] args) {
        int n = 121;
        int original = n;
        int rev = 0;

        while(n>0) {
            int digit = n%10;
            rev = rev*10+digit;
            n = n/10;
        }
        if (original == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not palindrome");
        }

    }
}

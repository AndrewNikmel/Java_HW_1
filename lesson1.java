// import java.time.LocalDateTime;

// public class lesson1 {

//     public static void main(String[] args) {
//         System.out.println("Hello, world!");
//         System.out.println(LocalDateTime.now());   // returns the current date and time
        
//     }
// }



// import java.util.Scanner;

// public class lesson1 {

//     public static void main(String[] args) {
//         Scanner str = new Scanner(System.in);
//         System.out.print("Input name!: ");
//         String name = str.nextLine();
//         System.out.printf("Hello, %s", name);
//         str.close();
//     }
// }


// /**
//  * lesson1
//  */
// public class lesson1 {

//     public static void main(String[] args) {
        
//         int[] arrayNum = new int[] {1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1};
//         int count = 0;
//         int max = 0;
//         for (int i =0; i < arrayNum.length; i++){
//             if (arrayNum[i] == 1) {
//                 count++;
//                 if (max < count) {
//                     max = count;
//                 }
//             }
//             else{
//                 count = 0;
//             }
//         }
//         System.out.printf("Maximal count of one numbers is %d", max);
//     }
// }

/**
 * create and print array by methods
 */
public class lesson1 {

    public static int[] createArray(int length){
        int [] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;

    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.printf("%d ", element);
            System.out.println();
        }
            
    }
}

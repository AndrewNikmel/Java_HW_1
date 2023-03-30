// 1. Task. Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class homework1 {

    public static int factorial(int n){
        if (n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }

    public static int triangleNumber(int n){
        if (n == 1){
            return 1;
        }
        return n + triangleNumber(n-1);
    }
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        String str = iScanner.nextLine();
        Integer num = Integer.valueOf(str);
        Integer triangle = triangleNumber(num);
        Integer factorial = factorial(num);
        System.out.printf("The triangle number of %d is %d", num, triangle);
        System.out.println();
        System.out.printf("The factorial number of %d is %d", num, factorial);
        iScanner.close();

        
        
    }
    
    
}


// 2. Task. Вывести все простые числа от 1 до 1000

// public class homework1 {
//     public static void main(String[] args) {
        
//     }
    
// }


// 3. Task. Реализовать простой калькулятор

// public class homework1 {
//     public static void main(String[] args) {
        
//     }
    
// }


// 4*. Task +Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 
// 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.


// public class homework1 {
//     public static void main(String[] args) {
        
//     }
    
// }
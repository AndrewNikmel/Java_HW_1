// 1. Task. Вычислить n-ое треугольного число (сумма чисел от 1 до n), 
// n! (произведение чисел от 1 до n)


// import java.util.Scanner;

// public class homework1 {

//     public static int factorial(int n){
//         if (n == 1){
//             return 1;
//         }
//         return n*factorial(n-1);
//     }

//     public static int triangleNumber(int n){
//         if (n == 1){
//             return 1;
//         }
//         return n + triangleNumber(n-1);
//     }
//     public static void main(String[] args) {
//         Scanner iScanner = new Scanner(System.in);
//         System.out.println("Enter the number: ");
//         String str = iScanner.nextLine();
//         Integer num = Integer.valueOf(str);
//         Integer triangle = triangleNumber(num);
//         Integer factorial = factorial(num);
//         System.out.printf("The triangle number of %d is %d", num, triangle);
//         System.out.println();
//         System.out.printf("The factorial number of %d is %d", num, factorial);
//         iScanner.close();

        
        
//     }
    
    
// }


// 2. Task. Вывести все простые числа от 1 до 1000

// public class homework1 {

//     public static void main(String [] args){
//         int x, y;
//         for(x = 1; x < 1000; x++){
//             y = 0;
//             for(int i = 1; i <= x; i++){
//                 if(x%i == 0){
//                     y++;
//                 }
//             }
//             if (y<=2)
//                 System.out.print(x + ", ");
//         }
//     }

// }

// 3. Task. Реализовать простой калькулятор
import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }
 
    public static int getInt(){
        System.out.println("Введите число:");
        int num;
        if(Scanner.hasNextInt()){
            num = Scanner.nextInt();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            Scanner.next();//рекурсия
            num = getInt();
        }
        return num;
    }
 
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(Scanner.hasNext()){
            operation = Scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            Scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }
 
    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}



// 4*. Task +Задано уравнение вида q + w = e, q, w, e >= 0. 
// Некоторые цифры могут быть заменены знаком вопроса, например, 
// 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. 
// Предложить хотя бы одно решение или сообщить, что его нет.


// public class homework1 {
//     public static void main(String[] args) {
        
//     }
    
// }
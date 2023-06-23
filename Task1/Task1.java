package Task1;
//Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    
    public static void main(String[] args){
       
        NumbersTriangle();

    }
    
    public static void NumbersTriangle(){
        System.out.println("Введите целое число");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        if(N<1){
            System.out.println("Число не может быть отрицательным или нулем!");
        }
        else{
        int Triangle = N * (N+1)/2;
        System.out.println("Сумма чисел от одного до " + N + " = " + Triangle );
        }
        scanner.close();
    }


}

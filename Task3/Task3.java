package Task3;
import java.util.Scanner;

public class Task3 {
    
    public static void main (String[] args){
        Calc();
    }

    public static void Calc(){  
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.println("Введите первое число");
        double numberOne = scanner.nextDouble();
        System.out.println("Введите второе число число");
        double numberSecond = scanner.nextDouble();
        
  
        while(true){
            printCalc();
            int Case = scanner.nextInt();
            if(Case == 1){
                System.out.println("Выполняем действие сложение: " + numberOne + " + " + numberSecond );
                double sum = numberOne + numberSecond;
                System.out.println("Ответ = " + sum);
            } else if(Case == 2){
                System.out.println("Выполняем действие вычитание: " + numberOne + " - " + numberSecond );
                double subtraction = numberOne - numberSecond;
                System.out.println("Ответ = " + subtraction);
            } else if(Case == 3){
                System.out.println("Выполняем действие умножение: " + numberOne + " * " + numberSecond );
                double multiplication = numberOne * numberSecond;
                System.out.println("Ответ = " + multiplication);
            } else if(Case == 4){
                System.out.println("Выполняем действие деление: " + numberOne + " / " + numberSecond );
                double division = numberOne / numberSecond;
                System.out.println("Ответ = " + division);
            } else if (Case == 0){
                System.out.println("Выход");
            } else {
                System.out.println("Извините, пока такой комманды нет!");
            }
            }
    }
        }

        public static void printCalc(){
        System.out.println("Что вы хотите сделать? ");
        System.out.println("1 - Сложение");
        System.out.println("2 - Вычитание");
        System.out.println("3 - Умножение");
        System.out.println("4 - Деление");
        System.out.println("0 - Выход");
        }

    
}

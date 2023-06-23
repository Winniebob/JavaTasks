package Task4;
//(дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 2?(4) + (4)?5 = 69. 
//Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, что его нет.
import java.util.Scanner;

public class Task4 {
      public static void main(String[] args){
      Yravnd();
    }

    public static void Yravnd(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = scanner.nextInt();
        System.out.println("Введите второе число:");
        int b = scanner.nextInt();
        System.out.println("Введите сумму:");
        int sum = scanner.nextInt();
        int x = 0;
        int y = 0;
        scanner.close();
        for ( int i=0; i<9;i++){
            for(int j =0; j<99; j++)
            {
                if ((i + a*10) + (j*10 + b) == sum ){
                    x = i;
                    y = j*10;
                    a = a *10;
                }
               
            }
        }
        if(x>0 & y>0){
        System.out.println( "Число 1 = " + x + " Число 2 = " + y + " Или общее выражение = " + a + "+" + x + "+" + b + "+" + y + "=" + sum);
        }
        else{
            System.out.println("Ответа нет.");
        }

    }

}


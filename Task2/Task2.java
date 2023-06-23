package Task2;
//Вывести все простые числа от 1 до 1000

public class Task2 {
    
   public static void main(String args[]) {
   int i, j;
   System.out.println("Простые числа:");
   boolean isprime;
         for(i=2; i < 1000; i++) {
         isprime = true;
             // проверить, делится ли число без остатка
             for (j=2; j <= i/j; j++)
                   // если число делится без остатка, значит, оно не простое
                      if((i%j) == 0) isprime = false;
             if (isprime)
                
                System.out.print(i+" ");
}
}
}
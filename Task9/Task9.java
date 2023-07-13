//Вилькс Максим.
package Task9;

import java.util.ArrayDeque;
import java.util.Deque;

public class Task9{
    public static void  main(String[] args){
        Deque<Integer> numbers = new ArrayDeque<Integer>(3);
        Deque<Integer> numbersSecond = new ArrayDeque<Integer>(3);
        multiplictation(numbers);
        sumNumb(numbersSecond);
    }
    public static void multiplictation(Deque<Integer> numbers){
        
        numbers.add(12);
        numbers.add(10);
        int numberOne = numbers.getFirst();
        int numberTwo = numbers.getLast();
        int multiplicationNumbers = numberOne * numberTwo;
        numbers.add(multiplicationNumbers);
        System.out.print(numbers);
    }
    public static void sumNumb (Deque<Integer> numbersSecond){
        numbersSecond.add(-32);
        numbersSecond.add(15);
        int numberOne = numbersSecond.getFirst();
        int numberTwo = numbersSecond.getLast();
        int sumNumbers = numberOne + numberTwo;
        numbersSecond.add(sumNumbers);
        System.out.println(numbersSecond);
    }
}
//Вилькс Максим.
package Task9;

import java.util.ArrayDeque;

public class Task9{
    public static void  main(String[] args){
        ArrayDeque<Integer> numbers = new ArrayDeque<Integer>(3);
        ArrayDeque<Integer> numbersSecond = new ArrayDeque<Integer>(3);
        multiplictation(numbers);
        sumNumb(numbersSecond);
    }
    public static void multiplictation(ArrayDeque<Integer> numbers){
        
        numbers.add(12);
        numbers.add(10);
        int numberOne = numbers.getFirst();
        int numberTwo = numbers.getLast();
        int multiplicationNumbers = numberOne * numberTwo;
        numbers.add(multiplicationNumbers);
        System.out.print(numbers);
    }
    public static void sumNumb (ArrayDeque<Integer> numbersSecond){
        numbersSecond.add(-32);
        numbersSecond.add(15);
        int numberOne = numbersSecond.getFirst();
        int numberTwo = numbersSecond.getLast();
        int sumNumbers = numberOne + numberTwo;
        numbersSecond.add(sumNumbers);
        System.out.println(numbersSecond);
    }
}
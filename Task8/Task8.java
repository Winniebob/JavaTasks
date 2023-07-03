package Task8;

import java.util.ArrayList;



public class Task8 {
    
    public static void main (String[] args){
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(42);
        numbers.add(99);
        numbers.add(2323);
        numbers.add(423);
        numbers.add(21);
        numbers.add(26);
        numbers.add(4232);


        DeletNumbersEven(numbers);
        MinAndMaxElementListNumbers(numbers);
        AverageValue(numbers);
        
        
        
    }


    public static int MinAndMaxElementListNumbers (ArrayList<Integer> numbers){
        int min = numbers.get(0);
        int max = numbers.get(0);
        for (Integer i : numbers){
            if(i<min){
            min =i;
        }
            if(i>max){
            max = i;
            }

        }
        System.out.println("Минимальное значение: " + min);
        System.out.println("Максимальное значение: " + max);
        return max;
        }
    
    public static void DeletNumbersEven(ArrayList<Integer> numbers){
      
      for (int i =0; i < numbers.size(); i++){
      if (numbers.get(i)%2 == 0){
         numbers.remove(i);
       }
       
       }
        
        System.out.println("Массив без четных чисел: " + numbers);
    }
       
    

    public static int AverageValue(ArrayList<Integer> numbers){
        int Avarage = numbers.size()/2;
        int avar = numbers.get(Avarage);
        System.out.println("Среднее значение: " + avar);
        return avar;
    }


}

    
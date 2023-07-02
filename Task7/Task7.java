// Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
package Task7;


import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.SimpleFormatter;
import java.util.logging.Logger;
import java.util.logging.FileHandler;


public class Task7{
    public static void main (String[] args) throws SecurityException, IOException{
        int [] array = {23,3,15,6434,32,1,83};
 

        Bubles(array);
        printArray(array);
        
    }


    public static void Bubles(int[] array) throws SecurityException, IOException{
        boolean isSorted = false;
        Logger logger = Logger.getLogger(Task7.class.getName());
        FileHandler ch = new FileHandler("Popit");

        int buf;
        while(!isSorted){
            isSorted = true;
            for (int i= 0; i <array.length - 1; i++){
                if(array[i]>array[i+1]){
                    isSorted = false;
                    
                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1]=buf;

                   

                    logger.addHandler(ch);
                    SimpleFormatter sFormat = new SimpleFormatter();
                    ch.setFormatter(sFormat);
                    logger.log(Level.WARNING,"Sorting happened");
                    logger.info(" swapped the number " + array[i] + " " + buf  );
                    }
  
                }

            }         
 
        }
        
    static void printArray(int[] array)
    {
        int i;
        for (i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println();
    }

}




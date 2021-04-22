import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the number of integers you are entering: ");
    int total = in.nextInt();
    ArrayList<Integer> numberList = new ArrayList<Integer>(total);
    for(int i = 0; i < total; i++){
      System.out.print("Enter #" + (i+1) + " number: ");
      numberList.add(in.nextInt());
    }
    int maxCount = 0;
    int currentCount = 0;
    int value = numberList.get(0);
    for (int i : numberList){
      for (int j : numberList){
        if (j == i){
          currentCount++;
        }
      }
      if (currentCount > maxCount){
        currentCount = maxCount;
        value = i;
      }
      currentCount = 0;
    }
    System.out.println("Highest occurence number: " + value);
  }
}

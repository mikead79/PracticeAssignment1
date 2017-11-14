package net.javavideotutorials.assignment1;

import java.util.HashSet;
import java.util.Set;
import java.util.Random;

public class LotteryNumberGenerator 
{
  /**
   * This method should return a Set of 6 different
   * integers.  
   * 
   * Hint: use the 'Random' class located here: java.util.Random
   *       to generate random numbers
   * @return
   */
  public Set<Integer> generateLotteryNumbers ()
  {
    Set<Integer> winningNumbers = new HashSet<Integer>();
    Random randomGenerator = new Random();
    int i = 0;
    while(i<6) {
      int randomInt = randomGenerator.nextInt(48)+1;
      boolean isUnic = false;
      if(randomInt >=1 ) isUnic = winningNumbers.add(randomInt);
      if(isUnic) {
        i++;
      }
    }
    return winningNumbers;
  }
}

package org.wecancodeit.fizzbuzz;


public class FizzBuzz {
    public String say(int numberToTranslate) {
      if (numberToTranslate % 3 == 0){
          return "Fizz";
      }else if(numberToTranslate % 5 == 0){
          return "Buzz";
        }

        return "" + numberToTranslate;
    }
}

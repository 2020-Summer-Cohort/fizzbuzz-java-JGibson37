package org.wecancodeit.fizzbuzz;


public class FizzBuzz {
    public String say(int numberToTranslate) {
      if ( numberToTranslate % 3 == 0 && numberToTranslate % 5 ==0) {
          return "FizzBuzz";
      }else if (numberToTranslate % 3 == 0 && numberToTranslate % 11 == 0){
          return "FizzBANG";
      } else if (numberToTranslate % 3 == 0){
          return "Fizz";
      }else if(numberToTranslate % 5 == 0){
          return "Buzz";
      }else if(numberToTranslate % 11 == 0){
          return "BANG";
      }
        return "" + numberToTranslate;
    }
}
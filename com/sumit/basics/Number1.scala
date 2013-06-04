package com.sumit.basics

/*
 * Write a program to check whether the no. is:-
 * 1. Odd/Even
 * 2. Palindrome
 * 3. Prime
 * 4. Pythagoras Triplet eg. 345(3^2 + 4^2 = 5^2)
 * 5. Print Reverse of the number 
 */

object Number1 {

  def main(args: Array[String]): Unit = {
    
    val num = readInt
    if(num < 100 || num > 999) {
      println("Invalid Input")
    }else{
      if(num % 2 == 0){
        println(num + " is Even")
      }else{
        println(num + " is Odd")
      }
      
      var x = num % 10
      var y = (num % 100) / 10
      var z = num / 100
      
      var reverse = x * 100 + y * 10 + z
      println(num + " reverse is " + reverse)
      
      if(num == reverse) 
      	println(num + " is Palindrome")
      else
      	println(num + " is not Palindrome")
      	
	  if(Math.pow(z, 2) + Math.pow(y,2) == Math.pow(x,2)) {
	    println(num + " is pythagorem triplet")
	  }else{
	  	  println(num + " is not pythagorem triplet")
	  }
      
      var isPrime = true
      
      for(x <- 2 to (num - 1)) {
        if(num % x == 0) {
          isPrime = false
        }
      }
      
      if(isPrime) {
        print(num + " is prime")
      }else{
        print(num + " is not prime")
      }
      
    }
  }
}
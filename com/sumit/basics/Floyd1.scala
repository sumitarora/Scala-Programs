package com.sumit.basics

/*
 * Program to print floyd triangle as below.
 * 1 
 * 2 3 
 * 4 5 6 
 * 7 8 9 10 
 * 11 12 13 14 15 
*/

object Floyd1 {
  var count = 1
  def main(args: Array[String]): Unit = {
    for(x <- 1 to 5) {
	    for(y <- 1 to x) {
	        print(count + " ")
	        count = count + 1
	    }
	    println();
    }
  }  
}
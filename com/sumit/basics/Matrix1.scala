package com.sumit.basics
/*
 * Write a program to print the below output?
 * 1 2 3 4 5
 * 2 4 8 16 32
 * 3 9 27 81 243
 * 4 16 64 256 1024
 * 5 25 125 625 3125
 */

object Matrix1 {
  
  def main(args: Array[String]): Unit = {
    for(x <- 1 to 5){
      for(y <- 1 to 5) {
        print("   " + Math.pow(x, y).toInt)
      }
      println
    }
  }
}
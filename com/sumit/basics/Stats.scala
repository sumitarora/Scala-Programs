package com.sumit.basics

/*
 * Program to find smallest, largest, and mean of given numbers within an array? Also print reverse of array?
 */
import scala.collection.mutable.ListBuffer

object Stats {
  var nlst:List[Int] = List()
  def main(args: Array[String]): Unit = {
    var lst = ListBuffer[Int]()
    for(x <- 1 to 10) {
      lst += (Math.random * 50).toInt
    }    
    nlst = lst.toList
    
    println("Array: " + nlst)
    println("Max: " + nlst.max)
    println("Min: " + nlst.min)
    println("Average: " + nlst.sum / nlst.size)
    println("Reverse: " + nlst.reverse)
    println("Sorted: " + nlst.sorted)
  }
}
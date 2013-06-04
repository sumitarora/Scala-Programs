package com.sumit.basics

/*
 * Program to find area and circumference of square, rectangle, triangle or circle? 
 */

object Area {
  
  def main(args: Array[String]): Unit = {
    calculateRectangleData(10, 20)
    calculateCircleData(10)
    calculateTriangleData(4, 3)
  }
  
  def calculateRectangleData(length:Int, bredth:Int):Unit = {
    val area:Int = length * bredth
    val circumfrence:Int = 2 * (length + bredth)
    
    println("Area: " + area + " Circumfrence: " + circumfrence)
  }
  
  def calculateCircleData(radius:Int):Unit = {
    val area:Int = (22 * radius * radius) / 7
    val circumfrence:Int = (2 * 22 * radius) / 7
    
    println("Area: " + area + " Circumfrence: " + circumfrence)
  }
  
  def calculateTriangleData(perpendicular:Int, base:Int):Unit = {
    val area:Int = (perpendicular * base) / 2;
    val hypo:Int = Math.sqrt(perpendicular * perpendicular + base * base).toInt
    val circumfrence:Int = perpendicular + hypo + base
    
    println("Area: " + area + " Circumfrence: " + circumfrence)
  }  
  
}
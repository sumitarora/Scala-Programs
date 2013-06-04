package com.sumit.basics

/*
 * Electricity bill is calculated based on below conditions find the actual amount to be paid by the user individually and cumulative.
 * Units 		Cost/Unit
 * 0-100   		$1
 * 100-300 		$0.75
 * 300-500 		$0.50
 * 500>    		$0.25
 */
object Stats2 {

  def main(args: Array[String]): Unit = {
    val unitsConsumed = readInt
    var totalCostInd = 0.0
    var totalCostCum = 0.0
    
    if (unitsConsumed <= 100) {
    	totalCostInd = unitsConsumed * 1
    	totalCostCum = unitsConsumed * 1
    }else if(unitsConsumed <= 300) {
    	totalCostInd = unitsConsumed * 0.75
    	totalCostCum = 100 * 1 + (unitsConsumed - 100) * 0.75      
    }else if(unitsConsumed <= 500) {
    	totalCostInd = unitsConsumed * 0.50
    	totalCostCum = 100 * 1 + 200 * 0.75 + (unitsConsumed - 300) * 0.50      
    }else{
    	totalCostInd = unitsConsumed * 0.50
    	totalCostCum = 100 * 1 + 200 * 0.75 + 200 * 0.50 + (unitsConsumed - 500) * 0.25
    }
    
    println("Individual Cost: " + totalCostInd)
    println("Cumlative Cost: " + totalCostCum)
  }
}
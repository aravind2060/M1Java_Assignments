package com.cpg.lab1.exercise2;

public class SumOfSquaresAndSquareOfSumFirstNNaturalNumbers {
	
	int calculateDifference(int n)
    {
    	int Difference=0;
    	 int sumOfSquares=(n*(n+1)*(2*n+1))/6;
    	 int squareOfSum=((n*(n+1)))/2;
    	 squareOfSum*=squareOfSum;
    	 Difference=(int)Math.abs(sumOfSquares-squareOfSum);
    	return Difference;
    }

}

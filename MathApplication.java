package com.niit.mockito;

public class MathApplication {
	
private CalculatorService calcService;

public void setCalculatorService(CalculatorService calcService)
{
	this.calcService=calcService;
}

public double add(Double input1,double input2)
{
	return calcService.add(input1, input2);
}
public double subtract(Double input1,double input2)
{
	return calcService.subtract(input1, input2);
}
public double multiply(double input1,double input2)
{
	return calcService.multiply(input1, input2);
}

public double divide(double input1,double input2)
{
	return calcService.divide(input1, input2);
}
}

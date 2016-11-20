
public class Calculator {

public static double sum(double[] numbers) {
	double num = 0;
	for(int i=0; i < numbers.length;i++){
		num += numbers[i];
	}
	
	return num;
	
}

public static double average(double[] numbers) {
	double num = 0;
	for(int i=0; i < numbers.length;i++){
		num += numbers[i];
	}
	
	return num/numbers.length;
}
public static double product(double[] numbers) {
	double num = 0;
	for(int i=0; i < numbers.length;i++){
		num += numbers[i];
	}
	
	return num*num;
}
	
	
	
}
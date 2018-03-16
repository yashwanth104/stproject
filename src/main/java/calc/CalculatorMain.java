package calc;

public class CalculatorMain {
	public CalculatorMain(){
		
	}
	public int add(int a, int b){
		return a+b;
	}
	public int sub(int a, int b){
		return a-b;
	}
	public int mul(int a, int b){
		return a*b;
	}
	public int div(int a, int b){
		if(b==0)
			return b;
		else
		return a/b;
	}
	public int pwr(int a, int b){
		return (int)Math.pow(3.0,2.0);
	}
	
}

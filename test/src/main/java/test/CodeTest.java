package test;
/**
 * 
 * @author QiuWeiXi
 *
 * @date 2018年11月14日
 * 
 * 编码测试
 */
public class CodeTest {
	public static void main(String[] args) {
		CodeTest codeTest = new CodeTest();
		codeTest.printNumbers1();//输出要求一结果
		codeTest.printNumbers2();//输出要求二结果
	}
	/*
	 * 要求一:输出数字1到100，能被3整除的数字用“Fizz”代替,
	 * 		能被5整除的数字用“Buzz”代替,能同时被3和5整除的用“FizzBuzz”代替.
	 */
	public void printNumbers1(){
		System.out.println("。。。。。开始输出要求一结果。。。。。");
		String three = "Fizz";				//被3整除替换字符串
		String five = "Buzz";				//被5整除替换字符串
		String threeFive = "FizzBuzz";		//同时被3和5整除替换字符串
		
		for(int i=1;i<=100;i++){
			if(i%3==0 && i%5==0){//同时被3和5整除
				System.out.println(threeFive);
			}else if(i%3==0){//被3整除
				System.out.println(three);
			}else if(i%5==0){//被5整除
				System.out.println(five);
			}else{
				System.out.println(i);
			}
		}
		System.out.println("。。。。。结束输出要求一结果。。。。。");
	}
	
	/*
	 * 要求二:输出数字1到100，
	 * 能被3整除或者含有3的数字用“Fizz”代替,
	 * 能被5整除或者含有5的数字用“Buzz”代替,(和上面的条件部分有重叠)
	 * 
	 * A number is FizzBuzz if it is divisible by 3 or 5 or if it has a 3 or 5 in it.
	 * 一个数字如果可以被3或5整除，或者它有3或5。用“FizzBuzz”代替.(包含了上面两个条件,重叠了结果,条件判断不会进入)
	 */
	public void printNumbers2(){
		System.out.println("。。。。。开始输出要求二结果。。。。。");
		String three = "Fizz";				//被3整除或者含有3替换字符串
		String five = "Buzz";				//被5整除或者含有5替换字符串
		String threeFive = "FizzBuzz";		//同时被3或5整除或者含有3或5替换字符串
		
		for(int i=1;i<=100;i++){
			if(bo(i,3)){
				System.out.println(three);
			}else if(bo(i,5)){
				System.out.println(five);
			}else if(i%3==0 || i%5==0 || String.valueOf(i).contains(String.valueOf(3)) ||String.valueOf(i).contains(String.valueOf(5))){
				System.out.println(threeFive);
			}else{
				System.out.println(i);
			}
		}
		
		System.out.println("。。。。。结束输出要求二结果。。。。。");
	}
	
	/*
	 * 判断是否整除或者是否包含
	 */
	private boolean bo(int i,int number){
		if(i%number==0 || String.valueOf(i).contains(String.valueOf(number))){
			return true;
		}else{
			return false;
		}
	}
}

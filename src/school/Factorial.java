package school;
import java.math.BigInteger;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Factorial {

	public static void main(String[] args) throws IOException {
		final BufferedReader bufferReader=new BufferedReader(new InputStreamReader(System.in));
		final int t=Integer.parseInt(bufferReader.readLine());
		for(int i=0;i<t;i++) {
			System.out.println(factorial(Integer.parseInt(bufferReader.readLine())));
		}

	}
	private static BigInteger factorial (int n) {
		java.math.BigInteger result=BigInteger.ONE;
		for (int i=2;i<=n;i++) {
			result=result.multiply(BigInteger.valueOf(i));
	
		}
		return result;
	}
	

}

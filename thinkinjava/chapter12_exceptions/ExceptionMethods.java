package chapter12_exceptions;
//exceptions   P257
import static net.mindview.util.Print.print;
public class ExceptionMethods {

	public static void main(String[] args) {
		try{
			throw new Exception("My Exception");
		}catch(Exception e){
			print("Caught Exception");
			print("1.getMessage():" + e.getMessage());
			print("2.getLocalizedMessage():" + e.getLocalizedMessage());
			print("3.toString():" + e);
			print("4.printStackTrace():");
			e.printStackTrace(System.out);
		}finally{
			
		}
	}

}

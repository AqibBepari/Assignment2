package AssignmentDay3;
import java.util.function.Function;
 class FunctionTest {
	 public static void main(String[]args) {
			String s="Cash    back";
			Function<String,String> f=s1->s1.replaceAll(" ","");
			System.out.println(f.apply(s));
		}

	}



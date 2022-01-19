import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamDemoApplication {
	/**
	 * @author heminpanchal11@gmail.com
	 * @param args
	 */

	public static void main(String[] args) {
		//Stream Api was first introduced in java 8 with main purpose of processing of collection objects.
		//A Stream object is a sequence of objects, upon which many processing can be performed and desired results/ outputs can be obtained.
		//Stream dont make modification to original collection, instead it computes output from them.
		//
		
		//Following operation can be performed on stream
		
		//there are basically two type of operations allowed on streams.
		//Intermediate Operations:
		/**
		 * 1. map-> map is used to apply method to each elements of stream
		 * 2. filter -> filter method is used to filter elements based on predicated condition.
		 * 3. sorted -> sorted method is used to sort elements of the stream.
		 */
		
		//Terminal Operations:
		
		 //* 1. collect -> collect method is used to collect elements 
		 //* which are processed/ returned by Intermediate methods.
		// * 2. forEach -> forEach method is used to iterate over each elements of the stream.
		 //* 3. reduce -> reduce method is used to reduce collection of elements into one element. like maximum element or minimum element.
		
		
		
		// to demonstrate stream operation here are some code snippets
	    List<Integer> number = Arrays.asList(2,3,4,5);
	    //following code will map each element to its square value and further give processed elements to collect method.
	    // collect method furthere process elements into one list which is square.
	    List<Integer> square = number.stream().map(x -> x*x).collect(Collectors.toList());
	    System.out.println(square);
	    
	    
	    // create a list of String
	    List<String> names =Arrays.asList("Reflection","Collection","Stream");
	  
	    // following code snippet will filter each elements based on s->s.startsWith("S") condition.
	    // and collect into one list.
	    List<String> filteredNames = names.stream().filter(s->s.startsWith("S")).collect(Collectors.toList());
	    System.out.println(filteredNames);
	    
	    //following code snippet will sort names elements.
	    List<String> sortedNames =names.stream().sorted().collect(Collectors.toList());
	    System.out.println(sortedNames);
	    
	    //following code snippet will call forEach method on each elements of stream.
	    number.stream().map(x->x*x).forEach(y->System.out.println(y));
		
	}

}

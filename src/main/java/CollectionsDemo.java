import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections; 
public class CollectionsDemo {
	public static void show() {
		Collection<String> collection = new ArrayList<>();
		collection.add("a");
		collection.add("b");
		collection.add("c");
		Collections.addAll(collection, "a", "b", "c");
		collection.remove("a");
		collection.clear();
		System.out.println(collection );
		System.out.println(collection.isEmpty());
		var containsA = collection.contains("a");
		System.out.println(containsA); 
		Collections.addAll(collection, "a", "b", "c");
		var objectArray = collection.toArray();
		var stringArray = collection.toArray(new String[0]);
		Collection<String> other = new ArrayList<>();
		other.addAll(collection);
		// two different objects in memory so false 
		System.out.println(collection == other);
		// true because exact same content 
		System.out.println(collection.equals(other));
		
	}

}
 
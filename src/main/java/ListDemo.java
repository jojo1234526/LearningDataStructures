import java.util.List;
import java.util.ArrayList;
public class ListDemo {
	public static void show() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(0, "!");
		list.set(0,  "a+");
		System.out.println(list);
		System.out.println(list.indexOf("a+"));
		System.out.println(list.lastIndexOf("b"));
		System.out.println(list.subList(0, 3));
	}

}

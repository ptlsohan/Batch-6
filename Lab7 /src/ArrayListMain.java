
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> li = new ArrayList<String>();
		li.add("laptop");
		li.add("mobile");
		li.add("speaker");
		li.add("headphones");
		li.add("tv");
		
		Collections.sort(li);
		for(String l: li) {
			System.out.println(l);
		}
	}

}

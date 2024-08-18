package milestone1.collections.lists.myarraylist;
import java.util.ArrayList;
public class MyArrayList<E> extends ArrayList<E> {

	@Override
	public boolean add(E e) {
		// TODO Auto-generated method stub
		if (e instanceof Integer || e instanceof Float || e instanceof Double) {
			super.add(e);
			return true;
		} else {
			throw new ClassCastException("Only Integer, Float, and Double are supported.");
		}
	}
	
}

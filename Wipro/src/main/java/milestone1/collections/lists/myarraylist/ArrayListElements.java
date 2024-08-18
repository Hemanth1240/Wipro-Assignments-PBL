package milestone1.collections.lists.myarraylist;

import java.util.List;

public class ArrayListElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new MyArrayList<>();
		
		try {
			list.add(15);
			list.add(1.24F);
			list.add(3.1415D);
			list.add("Test");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(list);
	}

}

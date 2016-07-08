import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ints = new ArrayList<Integer>();
		ints.add(1);
		ints.add(2);
		List<Double> doub = new ArrayList<Double>();
		doub.add(2.2);
		doub.add(3.5);
		List <? extends Number> nums = ints;
		System.out.println(nums);

	}

}

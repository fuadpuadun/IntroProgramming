package tp1;

public class e2 {
	public static void main(String[ ] args) {
		try {
			int[] myNumbers = {1, 2, 3};
			System.out.println(myNumbers[10]);
			} catch (Exception e) {
				System.out.println("Array too short !");
			}
		}
}

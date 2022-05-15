import java.util.Scanner;

public class Teclado {

		public static String lerString (String rotulo) {
			System.out.println(rotulo);
			Scanner sc = new Scanner(System.in);
			return sc.nextLine();
		} 
		
		public static int lerInteiro(String rotulo) {
			System.out.println(rotulo);
			Scanner sc = new Scanner(System.in);
			return sc.nextInt();
		} 
		
		public static String lerfone (String rotulo) {
			System.out.println(rotulo);
			Scanner sc = new Scanner(System.in);
			return sc.nextLine();
		} 
}

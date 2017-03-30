public class Kata {
	public static String palindromization(String elements, int n) {
		if(elements.length() == 0 || n < 2) return "Error!";
		StringBuilder sb = new StringBuilder();
		int i = 0;
		for(i = 0; i < n / 2; i++){
			sb.append(elements.charAt(i % elements.length()));
		}
		// reverse method would reverse the original StringBuilder, so create new
		String reverse = new StringBuilder(sb).reverse().toString();

		if(n % 2 != 0) {
			sb.append(elements.charAt(i % elements.length()));
		} 
		sb.append(reverse);
		return sb.toString();
	}
}
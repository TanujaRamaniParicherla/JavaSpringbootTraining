public class Ex8UserMainCode {

	public String getString(String s) {
		if (s.charAt(0)=='k') {
			return s.substring(0, 1) + s.substring(2, s.length());
		} else if (s.charAt(0)=='b') {
			return s.substring(1, 2) + s.substring(2, s.length());
		} else {
			return s.substring(2, s.length());
		}
	}
}


public class ToCamelCase {

	public String toCamel(String x) {
		String nova = "";
		String praCima = "";
		String novaMemo = "";
		int cont = 0;
		for (int i = 0; i < x.length(); i++) {
			if(i+1 == x.length()) {
				novaMemo+=x.substring(cont, x.length());
			}
			if (x.charAt(i) == '-' || x.charAt(i) == '_') {
				nova = x.substring(cont,i);
				praCima = x.substring(i+1, i + 2).toUpperCase();
				novaMemo+=nova+praCima;
				i = i+1;
				cont = i+1;	
			}
		}
		return novaMemo;
	}
}

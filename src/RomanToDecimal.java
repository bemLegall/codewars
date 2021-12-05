
public class RomanToDecimal {

	private int resultado = 0;
	private String romanSeqAteDez = "";

	public void reset() {
		this.resultado = 0;
		//this.romanSeqAteDez = "";

	}

	public int RomanToDeci(String a) {
		a = a.toLowerCase();
		String romanSeqAteDez = "";
		for (int i = 0; i < a.length(); i++) {
			char roman = a.charAt(i);
			if (a.length() > i + 1) {
				this.romanSeqAteDez = a.substring(i, i + 2);
			}
			// um monte de switch ou um monte de case :)
			if (roman == 'm' && !romanSeqAteDez.equals("cm")) {
				resultado += 1000;
				//romanSeqAteDez = "";
			}
			if (romanSeqAteDez.equals("cm")) {
				resultado += 900;
				this.reset();
			}
			if (roman == 'd' && !romanSeqAteDez.equals("cd")) {
			resultado += 500;
			//romanSeqAteDez = "";
			}
			if (romanSeqAteDez.equals("cd")) {
				resultado += 400;
				this.reset();
			}
			if (roman == 'c' && !romanSeqAteDez.equals("xc")) {
				resultado += 100;
				//romanSeqAteDez = "";
			}
			if (romanSeqAteDez.equals("xc")) {
				resultado += 90;
				this.reset();
			}
			if (roman == 'l' && !romanSeqAteDez.equals("xl")) {
				resultado += 50;
				//romanSeqAteDez = "";
			}
			if (romanSeqAteDez.equals("xl")) {
				resultado += 40;
				this.reset();
			}
			if (roman == 'x' && !romanSeqAteDez.equals("ix")) {
				resultado += 10;
				//romanSeqAteDez = "";
			}
			if (roman == 'v' && !romanSeqAteDez.equals("iv")) {
				resultado += 5;
				//romanSeqAteDez = "";
			}
			if (romanSeqAteDez.equals("ix")) {
				resultado += 9;
				this.reset();
			}
			if (romanSeqAteDez.equals("iv")) {
				resultado += 4;
				this.reset();
			}
			if (roman == 'i' && !romanSeqAteDez.equals("iv") && !romanSeqAteDez.equals("ix")) {
				resultado += 1;
				//romanSeqAteDez = "";
			}
		}
		return resultado;
	}
}

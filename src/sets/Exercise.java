package sets;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Exercise {

	private static Map<String, String> morse = new HashMap<>();

	static {
		morse.put(".-", "a");
		morse.put("-...", "b");
		morse.put("-.-.", "c");
		morse.put("-..", "d");
		morse.put(".", "e");
		morse.put("..-.", "f");
		morse.put("--.", "g");
		morse.put("....", "h");
		morse.put("..", "i");
		morse.put(".---", "j");
		morse.put("-.-", "k");
		morse.put(".-..", "l");
		morse.put("--", "m");
		morse.put("-.", "n");
		morse.put("---", "o");
		morse.put(".--.", "p");
		morse.put("--.-", "q");
		morse.put(".-.", "r");
		morse.put("...", "s");
		morse.put("-", "t");
		morse.put("..-", "u");
		morse.put("...-", "v");
		morse.put(".--", "w");
		morse.put("-..-", "x");
		morse.put("-.--", "y");
		morse.put("--..", "z");
	}

	public static String translate(String toTranslate) {
		String translated = "";
		for (String word : toTranslate.split("/")) {
			System.out.println("WORD: " + word);
			for (String letter : word.trim().split(" ")) {
				System.out.println("LETTER: " + letter);
				translated += morse.get(letter);
			}
			translated += " ";
		}

		return translated.trim();
	}

	public static String untranslate(String toUnTranslate) {
		String unTranslated = "";
		for (String word : toUnTranslate.toLowerCase().split(" ")) {
			for (String letter : word.split("")) {
				System.out.println("LETTER: " + letter);
				for (Entry<String, String> entry : morse.entrySet()) {
					if (entry.getValue().equals(letter))
						unTranslated += entry.getKey();
				}
				unTranslated += " ";
			}
			unTranslated += "/ ";
		}
		return unTranslated.trim();
	}

	public static void main(String[] args) {
		System.out.println(translate(".--- .- ...- .- / .. ... / -.-. --- --- .-.. / --- -.-"));
		System.out.println(untranslate("Java is cool ok"));
	}
}

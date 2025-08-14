package rle;

public class RunLengthEncoding {

	public static String compress(String text) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			int count = 1;
			
			while (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)) {
				count++;
				i++;
			}

			sb.append(text.charAt(i)).append(count);
		}

		return sb.toString();
	}

	public static String decompress(String text) {
		StringBuilder sb = new StringBuilder();
		int i = 0;

		while (i < text.length()) {
			char letter = text.charAt(i);
			i++;

			int count = 0;

			while (i < text.length() && Character.isDigit(text.charAt(i))) {
				count = count * 10 + (text.charAt(i) - '0');
				i++;
			}

			for (int j = 0; j < count; j++) {
				sb.append(letter);
			}
		}

		return sb.toString();
	}
}

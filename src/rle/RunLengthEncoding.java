package rle;

public class RunLengthEncoding {

	public static String compress(String text) {
		long inicio = System.nanoTime();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < text.length(); i++) {
			int count = 1;
			
			while (i < text.length() - 1 && text.charAt(i) == text.charAt(i + 1)) {
				count++;
				i++;
			}

			sb.append(text.charAt(i)).append(count);
		}
		
		long fim = System.nanoTime();
		double duracao = (fim - inicio)/1_000_000_000.0;
		System.out.printf("Tempo de compressão: %.7f segundos\n", duracao);
		
		return sb.toString();
	}

	public static String decompress(String text) {
		long inicio = System.nanoTime();
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
		
		long fim = System.nanoTime();
		double duracao = (fim - inicio)/1_000_000_000.0;
		System.out.printf("Tempo de decompressão: %.7f segundos\n", duracao);

		return sb.toString();
	}
}

package rle;

public class App {

	public static void main(String[] args) {
		String s = "aaabbbbbbbbbbbbbbbbbbbbcccccccdeeee";
		String compressed = RunLengthEncoding.compress(s);
		String decompressed = RunLengthEncoding.decompress(compressed);
		
		System.out.println("Compressed: " + compressed + "\nDecompressed: " + decompressed);
	}

}

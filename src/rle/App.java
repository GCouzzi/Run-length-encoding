package rle;

public class App {

	public static void main(String[] args) {
		
		String warmupSmall = "abcdefghijklmnopqrstuvwxyz";
		String warmupMedium = ("a".repeat(250) + "b".repeat(250));
		String warmupLarge = ("a".repeat(1034) + "b".repeat(1046) + "c".repeat(1020));

		for (int i = 0; i < 3; i++) {
		    RunLengthEncoding.compress(warmupSmall);
		    RunLengthEncoding.decompress(warmupSmall);

		    RunLengthEncoding.compress(warmupMedium);
		    RunLengthEncoding.decompress(warmupMedium);

		    RunLengthEncoding.compress(warmupLarge);
		    RunLengthEncoding.decompress(warmupLarge);
		}
		
		for(int i = 0; i < 10; i++) {
//			teste26();
//			teste104();
//			teste520();
//			teste1040();
//			teste5200();
//			teste10400();
		}
	}
	public static void teste26() {
		System.out.println("------------------------------------------------");
		System.out.println("26 Caracteres\n");

		System.out.println("\nBloco único");
		String s = "a".repeat(26);
		String compressed = RunLengthEncoding.compress(s);
		String decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nSem repeticação");
		s = "abcdefghijklmnopqrstuvwxyz";
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nAlta repeticação");
		s = "a".repeat(11) + "b".repeat(15);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nRepetição parcial");
		s = "a".repeat(3) + "b".repeat(5) + "c".repeat(2) + "d".repeat(6) + "e".repeat(4) + "f".repeat(6);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);
	}
	
	public static void teste104() {
		System.out.println("\n------------------------------------------------");
		System.out.println("104 Caracteres\n");

		System.out.println("\nBloco único");
		String s = "a".repeat(104);
		String compressed = RunLengthEncoding.compress(s);
		String decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nSem repeticação");
		s = "abcdefghijklmnopqrstuvwxyz".repeat(4);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nAlta repetição");
		s = "a".repeat(50) + "b".repeat(54);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nRepetição parcial");
		s = "a".repeat(5) + "b".repeat(13) + "c".repeat(6) + "d".repeat(12) + "e".repeat(7) + "f".repeat(11)
				+ "g".repeat(9) + "h".repeat(9) + "i".repeat(8) + "j".repeat(10) + "k".repeat(7) + "l".repeat(7);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		
	}

	public static void teste520() {
		System.out.println("\n------------------------------------------------");
		System.out.println("520 Caracteres\n");

		System.out.println("\nBloco único");
		String s = "a".repeat(520);
		String compressed = RunLengthEncoding.compress(s);
		String decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nSem repetição");
		s = "abcdefghijklmnopqrstuvwxyz".repeat(20);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nAlta repetição");
		s = "a".repeat(98) + "b".repeat(110) + "c".repeat(100) + "d".repeat(108) + "e".repeat(104);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nRepetição parcial");
		s = ("a".repeat(9) + "b".repeat(17) + "c".repeat(7) + "d".repeat(19)).repeat(10);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);
	}

	public static void teste1040() {
		System.out.println("\n------------------------------------------------");
		System.out.println("1040 Caracteres\n");

		System.out.println("\nBloco único");
		String s = "a".repeat(1040);
		String compressed = RunLengthEncoding.compress(s);
		String decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nSem repetição");
		s = "abcdefghijklmnopqrstuvwxyz".repeat(40);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nAlta repetição");
		s = "a".repeat(204) + "b".repeat(212) + "c".repeat(200) + "d".repeat(216) + "e".repeat(208);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nRepetição parcial");
		s = ("a".repeat(11) + "b".repeat(15) + "c".repeat(12) + "d".repeat(14) + "a".repeat(8) + "b".repeat(18)
				+ "c".repeat(7) + "d".repeat(15) + "e".repeat(4)).repeat(10);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

	}

	public static void teste5200() {
		System.out.println("\n------------------------------------------------");
		System.out.println("5200 Caracteres\n");

		System.out.println("\nBloco único");
		String s = "a".repeat(5200);
		String compressed = RunLengthEncoding.compress(s);
		String decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nSem repetição");
		s = "abcdefghijklmnopqrstuvwxyz".repeat(200);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nAlta repetição");
		s = "a".repeat(1034) + "b".repeat(1046) + "c".repeat(1020) + "d".repeat(1012) + "e".repeat(1088);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nRepetição parcial");
		s = ("a".repeat(11) + "b".repeat(15) + "c".repeat(12) + "d".repeat(14) + "a".repeat(8) + "b".repeat(18)
				+ "c".repeat(7) + "d".repeat(15) + "e".repeat(4)).repeat(50);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);
	}
	
	public static void teste10400() {
		System.out.println("\n------------------------------------------------");
		System.out.println("10400 Caracteres\n");

		System.out.println("\nBloco único");
		String s = "a".repeat(10400);
		String compressed = RunLengthEncoding.compress(s);
		String decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nSem repetição");
		s = "abcdefghijklmnopqrstuvwxyz".repeat(400);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nAlta repetição");
		s = "a".repeat(2068) + "b".repeat(1292) + "c".repeat(2040) + "d".repeat(2024) + "e".repeat(1088)
				+ "a".repeat(1088) + "b".repeat(800) + "c".repeat(523) + "d".repeat(523);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);

		System.out.println("\nRepetição parcial");
		s = ("a".repeat(11) + "b".repeat(15) + "c".repeat(12) + "d".repeat(14) + "a".repeat(8) + "b".repeat(18)
				+ "c".repeat(7) + "d".repeat(15) + "e".repeat(4)).repeat(100);
		compressed = RunLengthEncoding.compress(s);
		decompressed = RunLengthEncoding.decompress(compressed);
	}

}

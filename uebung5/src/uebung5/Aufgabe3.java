package uebung5;

import java.io.IOException;

public class Aufgabe3 {

	// Main class; generates array b and array bb with double length of b
	public static void main(String[] args) {
		FileIO file = new FileIO();
		byte b[];
		byte bb[];
		try {
			b = file.readFile("/Users/Jessi/git/repository/uebung5/src/uebung5/myFile.txt");
		} catch (IOException ex) {
			System.out.println("Error! Falsche Eingabe");
			ex.printStackTrace();
			return;
		}
		bb = new byte[b.length * 2];
		
		System.out.println(b.length);
		
		// encryption of MyRSA
		MyRSA rsa = new MyRSA();
		for (int i = 0, x = 0; i < b.length; i++) {
			System.out.println(b[i]);
			
			int k = b[i];
			System.out.print("k="+k);
			int j = k%20;
			int c = k/20;
			j = rsa.encryption_RSA(j);
			c = rsa.encryption_RSA(c);
			System.out.println(" verschl:"+(j)+" "+(c));
	
			bb[x++] = (byte) (j);
			bb[x++] = (byte) (c);
			b[i] = (byte) (j);
			b[i] = (byte) (c);
		}
		file.writeFile("/Users/Jessi/git/repository/uebung5/src/uebung5/verschluesselt.txt", bb);
		
		try {
		bb = file.readFile("/Users/Jessi/git/repository/uebung5/src/uebung5/verschluesselt.txt");
		}
		catch (IOException ex) {
			ex.printStackTrace();
			System.out.println("Error! Falsche Eingabe");
			return;
		}
		for(int i = 0; i < bb.length; i++) {
			System.out.println(bb[i]);
		}
		// decryption of MyRSA
		for (int i = 0; i < b.length; i++) {
			short cc = (short) (rsa.encryption(bb[i * 2]) + 20 * rsa.decryption(bb[i * 2 + 1]));
			b[i] = (byte)cc;
		}
		
		file.writeFile("/Users/Jessi/git/repository/uebung5/src/uebung5/entschluesselt.txt", b);
	}

}

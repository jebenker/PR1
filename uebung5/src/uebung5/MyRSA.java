package uebung5;

public class MyRSA {
	int e = 5; // öffentlicher Schlüssel 
	int N = 21; // öffentlicher Schlüssel 
	int d = 5; // privater Schlüssel
	
	//class for encryption of myFile
	public short encryption(int k) {
		// int c = (int)(Math.pow(k,e)) % N;
		System.out.print("k="+k);
		int j = k%20;
		int c = k/20;
		j = encryption_RSA(j);
		c = encryption_RSA(c);
		System.out.println(" verschl:"+(byte)(20*c+j));
		return (short)(20 * c + j);
	}
	
	//class for encryption of myFile
	public byte encryption_RSA (int k) {
		return (byte)((Math.pow(k,e)) % N);
	}
	
	//class for decryption of myFile
	public short decryption (int k) {
		//int k = (int)(Math.pow(c, d)) % N;
		System.out.print("verscl="+k);
		int j = k%20;
		int c = k/20;
		j = decryption_RSA(j);
		c = decryption_RSA(c); 
		System.out.println(" k="+(20*c+j));
		return (short)(20 * c + j);
	}
	
	//class for decryption of myFile
	public byte decryption_RSA (int c) {
		return (byte)((Math.pow(c, d)) % N);
		
	}
}

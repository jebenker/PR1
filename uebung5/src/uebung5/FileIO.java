package uebung5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class FileIO {
	public byte[] readFile(String fileName) throws IOException {        
    	//new object File
		File file = new File(fileName);
    	//new long with length of File
        long length = file.length();
        //Error if long is bigger than max value of an Integer
        if (length > Integer.MAX_VALUE) {
            // File is too large
            throw new IOException("File is too large!");
        }

        // Create the byte array to hold the data
        byte[] bytes = new byte[(int)length];

        // Read in the bytes
        int offset = 0;
        int numRead = 0;
        //generates Input Stream to read File
        InputStream is = new FileInputStream(file);
        try {
            while (offset < bytes.length
                   && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
                offset += numRead;
            }
        } 
        
        finally {
            is.close();
        }

        // Ensure all the bytes have been read in
        if (offset < bytes.length) {
            throw new IOException("Could not completely read file "+file.getName());
        }
		
        return bytes;
    }		
    public void writeFile(String fileName, byte[] buf)
    {
		
		FileOutputStream fos = null;
		
		try
		{
		   fos = new FileOutputStream(fileName);
		   fos.write(buf);
		}
		catch(IOException ex)
		{
		   System.out.println(ex);
		}
		finally
		{
		   if(fos!=null)
		      try
		      {
		         fos.close();
		      }
		      catch(Exception ex)
		      {
		      }
		}
    }
}

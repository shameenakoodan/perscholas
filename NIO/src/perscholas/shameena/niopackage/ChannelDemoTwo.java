/**
 * 
 */
package perscholas.shameena.niopackage;

import java.nio.*;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.*;
import java.nio.ByteBuffer;
/**
 * @author homeoffice
 *
 */
public class ChannelDemoTwo {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String fname = "C:/Downloads/testingFile.txt";
	       FileInputStream file = new FileInputStream(fname);
	       FileChannel fileChannel = file.getChannel();
	       long filesize =  fileChannel.size();
	       // intializing buffer,
	       // ByteBuffer buffersize  =  ByteBuffer.allocate(200);
	       ByteBuffer byteBuffer  =  ByteBuffer.allocate( (int) filesize);
	       // read date from a channel into buffer
	       while (fileChannel.read(byteBuffer) > 0) {
	           // flip the buffer to prepare for get operation
	           byteBuffer.flip();
	           while (byteBuffer.hasRemaining()) {
	               //get() method used to read data from buffer and
	               // read 1 byte at a time from buffer
	               System.out.print((char) byteBuffer.get());
	           }
	       }
	       file.close();
	       fileChannel.close();

	}

}

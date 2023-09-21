/**
 * 
 */
package perscholas.shameena.newio;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @author homeoffice
 *
 */
public class NioExample {

	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// initializing two files in Array;
		String[] inputFiles = {
				"/Users/homeoffice/Shameena/PerScholas/Java Tutorials/G-LabNewIO/src/perscholas/shameena/newio/file1.txt",
				"/Users/homeoffice/Shameena/PerScholas/Java Tutorials/G-LabNewIO/src/perscholas/shameena/newio/file2.txt" };
		// Specify out file with path location
		// Files contents will be written in these files
		String outputFile = "/Users/homeoffice/Shameena/PerScholas/Java Tutorials/G-LabNewIO/src/perscholas/shameena/newio/nioOutput.txt";

		// Get Channel for destination or outputFile
		FileOutputStream fos = new FileOutputStream(outputFile);
		FileChannel targetChannel = fos.getChannel();

		for (int i = 0; i < inputFiles.length; i++) {
			// Get channel for inputFiles
			FileInputStream fis = new FileInputStream(inputFiles[i]);
			FileChannel inputchannel = fis.getChannel();
			long size = inputchannel.size();
			ByteBuffer buf = ByteBuffer.allocate((int) size);
			System.out.print((char) buf.get());
			while (inputchannel.read(buf) > 0) {
				buf.flip();
				while (buf.hasRemaining()) {
					// System.out.print((char) buf.get());
					targetChannel.write(buf);
				}
			}
			// fis.close();
		}
	}
}

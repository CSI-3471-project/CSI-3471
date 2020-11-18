package project.iterationII;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Timer;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public class Encrypter {
	private final String TRANSFORMER = "AES/CBC/PKCS5Padding";
	
	private static Logger logger = Logger.getLogger(Encrypter.class.getName());
	
	static {
		try {
			InputStream configFile = Timer.class.getClassLoader().getResourceAsStream("logger.properties");
			LogManager.getLogManager().readConfiguration(configFile);
			configFile.close();
		} catch (IOException ex) {
			System.out.println("WARNING: Could not open configuration file");
		    System.out.println("WARNING: Logging not configured (console output only)");
		}
		logger.info("Encryption Logger Complete");
	}
	
	
	private Cipher ciph;
	private SecretKey secretKey;
	public Encrypter() {
		try {
			secretKey = KeyGenerator.getInstance("AES").generateKey();
			ciph = Cipher.getInstance(TRANSFORMER);
		} catch (NoSuchAlgorithmException e) {
			logger.severe("NO SUCH ALGORITHM EXCEPTION THROWN BY ENCRYPTER CONSTRUCTOR");
		} catch (NoSuchPaddingException e) {
			logger.severe("NO SUCH PADDING EXCEPTION THROWN BY ENCRYPTER CONSTRUCTOR");
		}
	}
	
	public byte[] encrypt(String[] cardInfo) {
		try {
			ciph.init(Cipher.ENCRYPT_MODE, secretKey);
			byte[] iv = ciph.getIV();
			ByteArrayOutputStream dataBuilder = new ByteArrayOutputStream();
			BufferedOutputStream buffCipher = new BufferedOutputStream(new CipherOutputStream(dataBuilder, ciph));
			
			dataBuilder.write(iv);
			for(String s: cardInfo)
				buffCipher.write(s.getBytes());
			
			return dataBuilder.toByteArray();
			
		} catch (InvalidKeyException e) {
			logger.severe("INVALID KEY EXCEPTION THROWN BY ENCRYPT METHOD");
		} catch (IOException e) {
			logger.severe("IO EXCEPTION THROWN BY ENCRYPT METHOD");
			e.printStackTrace();
		}
		return null;
	}
	

	
}

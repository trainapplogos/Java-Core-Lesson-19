package trainapplogos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

public class Methods {
	
	public static void serialize(File file, Serializable obj) throws IOException {
		OutputStream fos = new FileOutputStream(file);
		ObjectOutputStream ous = new ObjectOutputStream(fos);
		ous.writeObject(obj);
		ous.close();
		fos.close();
	}
	
	public static Serializable deserealize(File file) throws IOException, ClassNotFoundException {
		InputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Serializable obj = (Serializable) ois.readObject();
		ois.close();
		fis.close();
		return obj;
	}
}

package decoration;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileLoger implements ILoger{

	@Override
	public void log(String msg) {
		DataOutputStream dos=null;
		try {
			dos=new DataOutputStream(new FileOutputStream("08_decorator/cn/ccx"));
			dos.writeBytes(msg);
			dos.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

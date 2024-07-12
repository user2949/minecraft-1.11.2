import java.io.File;
import java.io.FileNotFoundException;

public class cac extends FileNotFoundException {
	public cac(File file, String string) {
		super(String.format("'%s' in ResourcePack '%s'", string, file));
	}
}

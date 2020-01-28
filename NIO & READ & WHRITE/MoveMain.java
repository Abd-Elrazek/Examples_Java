import java.nio.file.Files;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

 public class MoveMain{
	     //move from and to same directory
	     Path source = FileSystems.getDefault().getPath("./distination");
	     Path distination = FileSystems.getDefault().getPath("./distination");
	
	public boolean moveFile() {
        

		boolean fileMoved = true;

		try {

			Files.move(source.getFileName(),distination.getFileName(), StandardCopyOption.REPLACE_EXISTING);

		} catch (Exception e) {

			fileMoved = false;
			e.printStackTrace();
		}

		return fileMoved;
    }

	public static void main(String abdelrazek[]){
		for (int i = 0; i < Integer.valueOf(abdelrazek[0]); i++){
	        System.out.println(new MoveMain().moveFile());
		}
	}
 }
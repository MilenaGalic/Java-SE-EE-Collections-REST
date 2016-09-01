import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {
	
		public static void main(String[] args) {
			System.out.println("Writting objects...");
			
			Person mike = new Person(543, "Mike");
			Person.setCount(88);
			
			try(ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("people.bin"))) {
				
				os.writeObject(mike);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

}

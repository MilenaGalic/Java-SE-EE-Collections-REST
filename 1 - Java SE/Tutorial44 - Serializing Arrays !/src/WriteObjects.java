import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObjects {
	
		public static void main(String[] args) {
			System.out.println("Writting objects...");
			
			Person[] people = {
					new Person(1, "Sue"), 
					new Person(2, "Mike"),
					new Person(3, "Bob"),
			};
			
			ArrayList<Person> peopleList = new ArrayList<Person>(Arrays.asList(people));
			
			try(FileOutputStream fs = new FileOutputStream("people.bin")) {
			
				ObjectOutputStream os = new ObjectOutputStream(fs);
				
				os.writeObject(people);
				
				os.writeObject(peopleList);
				
				os.close();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}

}

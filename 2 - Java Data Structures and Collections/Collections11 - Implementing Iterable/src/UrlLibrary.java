import java.util.Iterator;
import java.util.LinkedList;

public class UrlLibrary implements Iterable<String> {

	private LinkedList<String> urls = new LinkedList<String>();
	
	public UrlLibrary() {
		urls.add("http://www.milanlatinovic.com");
		urls.add("http://www.milanlatinovic.info");
		urls.add("http://www.facebook.com");
		urls.add("http://www.google.com");
	}

	@Override
	public Iterator<String> iterator() {
		return urls.iterator();
	}
}

import java.io.*;
import java.util.*;


public class Main {

	public static void println (String str) {
		System.out.println(str);
	}

	public static void main (String[] args) throws IOException {
		Main m = new Main();
		m.run();
	}

	public void run () throws IOException {
		println("");
		println("System Properties");
		println("-----------------");

		Properties props = System.getProperties();
		SortedMap sortedSystemProperties = new TreeMap(props);
        Set keySet = sortedSystemProperties.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String propertyName = (String) iterator.next();
            String propertyValue = props.getProperty(propertyName);
            println(propertyName + ": " + propertyValue + "");
        }
		
		
		println("");
		println("Version info");
		println("------------");

		Properties versionProps = new Properties();
		InputStream in = getClass().getResourceAsStream("/version.properties");
		if (in != null) {
			versionProps.load(in);
			in.close();

			Set<String> versionPropKeys = versionProps.stringPropertyNames();
			Iterator<String> iter = versionPropKeys.iterator();
			while (iter.hasNext()) {
				String key = iter.next();
				String value = versionProps.getProperty(key);
				println(key + " = " + value);
			}
		} else {
			println("No version.properties file found");
		}

	}
}

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
/**
 * Makes the clock count
 * <p>
 * gets information from the computer's clock to count upwards. 
 * This is an abstract class, so it has full methods that have code, and has one with no code that just establishes a name.
 * <p>
 * @author Ben Harper
 * @version 1.0
 * @since 1.0
 */
abstract class MyTime {
	public abstract void display();
	
	public static String getTime() {
		String t = "";
		DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
		Calendar cal = Calendar.getInstance();
		t = dateFormat.format(cal.getTime());
		return t;
	}
	
	public static String getDate() {
		String d = "";
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Calendar cal = Calendar.getInstance();
		d = dateFormat.format(cal.getTime());
		return d;
	}
	
}

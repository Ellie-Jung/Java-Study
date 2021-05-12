package book;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ImportTest {

	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("오늘시간은"+date.format(today));
		System.out.println("현재시간은"+ time.format(today));
	}

}

package utilities;

import org.openqa.selenium.os.WindowsUtils;

public class WindowUtils {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WindowsUtils.killByName("chrome.exe");
		WindowsUtils.killByName("firefox.exe");

	}
}

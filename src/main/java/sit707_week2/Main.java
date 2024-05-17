package sit707_week2;

import java.io.IOException;

/**
 * Hello world!
 * 
 * @author Ahsan Habib
 */
public class Main {
	public static void main(String[] args) throws IOException {
		int choice = 1;

		switch (choice) {
		case 1:
			SeleniumOperations
					.officeworks_registration_page("https://www.officeworks.com.au/app/identity/create-account");
			break;
		case 2:
			SeleniumOperations.centrecom_registration_page("https://www.centrecom.com.au/register");
			break;
		default:
			System.out.println("Invalid choice.");
			break;
		}

	}
}

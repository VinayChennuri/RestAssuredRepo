package DynamicData;

import com.github.javafaker.Faker;

public class RandomNames {

	public static void main(String[] args) {
		
		     Faker faker = new Faker();
		     
		     // Random Name
	        String randomName = faker.name().fullName();
	        System.out.println("Name: " + randomName);
	        
	        // Random Last Name
	        String randomLastName = faker.name().lastName();
	        System.out.println("Last Name: " + randomLastName);
	        
	        // Random Phone Number
	        String randomPhoneNumber = faker.phoneNumber().cellPhone();
	        System.out.println("Phone Number: " + randomPhoneNumber);
	        
	        // Random Pin Code
	        String randomIndianPinCode = faker.address().zipCode();
	        System.out.println("PIN Code: " + randomIndianPinCode);
	        
	        // Random Mail ID
	        String randomEmail = faker.internet().emailAddress();
	        System.out.println("Random Email: " + randomEmail);

	}

}

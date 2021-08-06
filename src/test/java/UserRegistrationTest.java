//Importing The Junit Packages
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//Declaring User Registration Test class

public class UserRegistrationTest {
    //Defining User Registration
    UserRegistration userRegistration = new UserRegistration();

    //Test To Valid FirstName Starts With Cap Letter And It Has Min 3 Letters
    @Test
    //Validation Of First Name And Return True
    public void givenFirstName_Return_True() {
        //Checking Validate FirstName With Pattern And Storing In result
        boolean result = userRegistration.validateFirstName("Kaviya");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true, result);
    }

    //Test To Valid FirstName If It Starts With Small Letter Print False
    @Test
    public void givenFirstName_Return_False() {
        //Checking Validate FirstName With Pattern And Storing In result
        boolean result = userRegistration.validateFirstName("kaviya");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(false, result);
    }
    //UC2
    //Test To Valid LastName Starts With Cap Letter And It Has Min 3 Letters
    @Test
    public void givenLastName_Return_True() {
        //Checking Validate LastName With Pattern And Storing In result
        userRegistration.validateLastName("Sree");
        boolean result = userRegistration.validateFirstName("Sree");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenLastName_Return_False() {
        //Checking Validate LastName With Pattern And Storing In result
        boolean result = userRegistration.validateLastName("sree");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(false, result);
    }
    //UC3
    //Test To Valid Email Starts With Small Letter
    @Test
    public void givenEmail_StartsWithSmallLetter_ReturnTrue() {
        //Checking Validate Email With Pattern And Storing In result
        boolean result = userRegistration.validateemail("kaviyarajalingam@gmail.com");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true, result);
    }
    //Test To Valid Email Starts With Cap Letter
    @Test
    public void givenEmail_StartsWithCapLetter_ReturnFalse() {
        //Checking Validate Email With Pattern And Storing In result
        boolean result = userRegistration.validateemail("Kaviyarajalingam@gmail.com");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(false, result);
    }
    //Test To Valid Email Ends With .Com
    @Test
    public void givenEmail_EndsWithCom_ReturnTrue() {
        //Checking Validate Email With Pattern And Storing In result
        boolean result = userRegistration.validateemail("kaviyarajalingam@gmail.com");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true, result);
    }
    //UC4
    //Test To Phone Number Start With Country Code
    @Test
    public void givenPhoneNumber_StartWithCountryCode_ReturnTrue() {
        //Checking Validate Phone Number With Pattern And Storing In result
        boolean result = userRegistration.validatePhoneNumber("91 9790543056");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true, result);
    }
    //Test To Phone Number Does Not Have 10Numbers Return False
    @Test
    public void givenPhoneNumber_DoesNotHave10Numbers_ReturnFalse() {
        //Checking Validate Phone Number With Pattern And Storing In result
        boolean result = userRegistration.validatePhoneNumber("91 979054305");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(false, result);
    }
    //Test To Phone Number Does Have 10Numbers Return True
    @Test
    public void givenPhoneNumber_DoesHave10Numbers_ReturnTrue() {
        //Checking Validate Phone Number With Pattern And Storing In result
        boolean result = userRegistration.validatePhoneNumber("91 9790543056");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true, result);
    }

    //UC5
    //Test To Password Does Have 8Characters Return True
    @Test
    public void givenPassword_ContainsEightDigits_ReturnTrue() {
        //Checking Validate Password With Pattern And Storing In result
        boolean result = userRegistration.validatePassword("Kaviya$145");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true,result);
    }
    //Test To Password Does Not Have 8Characters Return False
    @Test
    public void givenPassword_DoesNotContainsEightDigits_ReturnFalse() {
        //Checking Validate Password With Pattern And Storing In result
        boolean result = userRegistration.validatePassword("kaviya$144");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(false,result);
    }

    //UC6 Password Should Contain One UpperCase Letter
    //Test To Password Does Have One UpperCase And 8 Characters Return True
    @Test
    public void givenPassword_ShouldHaveOneUpperCase_AndContainsEightDigits_ReturnTrue() {
        //Checking Validate Password With Pattern And Storing In result
        boolean result = userRegistration.validatePassword("Kaviya$144");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true,result);
    }
    //Test To Password Does Not Have UpperCase And 8 Characters Return False
    @Test
    public void givenPassword_ShouldNotHaveOneUpperCase_AndContainsEightDigits_ReturnFalse() {
        //Checking Validate Password With Pattern And Storing In result
        boolean result = userRegistration.validatePassword("kaviya$144");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(false,result);

    }
    //UC7 Password Should Contain One Numeric Number
    //Test To Password Does Have One Numeric Number And 8 Characters Return True
    @Test
    public void givenPassword_ShouldHaveOneNumericNbr_AndContainsEightDigits_ReturnTrue() {
        //Checking Validate Password With Pattern And Storing In result
        boolean result = userRegistration.validatePassword("Kaviya$144");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true,result);
    }
    //Test To Password Does Not Have One Numeric Number And 8 Characters Return True
    @Test
    public void givenPassword_ShouldNotHaveOneNumericNbr_AndContainsEightDigits_ReturnFalse() {
        //Checking Validate Password With Pattern And Storing In result
        boolean result = userRegistration.validatePassword("kaviya$rdy");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(false,result);
    }
    //UC8 Password Should Contain One Special Character
    //Test To Password Does Have One Numeric Number And 8 Characters Return True
    @Test
    public void givenPassword_ShouldHaveOneSpecialCharacter_AndContainsEightDigits_ReturnTrue() {
        //Checking Validate Password With Pattern And Storing In result
        boolean result = userRegistration.validatePassword("Kaviya$144");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(true,result);
    }
    //Test To Password Does Not Have One Numeric Number And 8 Characters Return True
    @Test
    public void givenPassword_ShouldNotHaveOneSpecialCharcter_AndContainsEightDigits_ReturnFalse() {
        //Checking Validate Password With Pattern And Storing In result
        boolean result = userRegistration.validatePassword("Kaviyarre");
        //Asserting The Result As Boolean Type True Or False
        Assertions.assertEquals(false,result);
    }
}
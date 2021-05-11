package pages;

public class TestSandbox extends BasePage{
    private String categoryDropdown = "//select[@id='testingDropdown']";

    public TestSandbox(){
        super(driver);
    }

    public void navigateToSandbox(){
        navigateTo("https://www.testandquiz.com/selenium/testing.html");
    }

    public void selectCategory(String category){
        selectFromDropdownByValue(categoryDropdown, category);
    }
}

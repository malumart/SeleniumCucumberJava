package pages;

//import java.util.concurrent.PriorityBlockingQueue;

public class GooglePage extends BasePage{
    
    private String searchButton = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]";
    private String searchTextField = "/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input";
    public GooglePage(){
        super(driver);
    }


    public void navigateToGoogle(){
        navigateTo("https://www.google.com");
    }

    public void clickGoogleSearch(){
        clickElement(searchButton);
    }

    public void enterSearchCriteria(String criteria){
        write(searchTextField, criteria);
    }
}

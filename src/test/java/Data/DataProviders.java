package Data;
import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "usernamePassword")
    public static Object[][] getDataFromDataProvider(){
        return new Object[][]{{"buquxahu@cars2.club","kisulea"}};
    }
}

package Data;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.annotations.DataProvider;

public class DataProviders {
    @DataProvider(name = "usernamePassword")
    public static Object[][] getDataFromDataProvider(){
        return new Object[][]{{"buquxahu@cars2.club","kisulea"}};
    }

    @DataProvider(name = "ChangeName")
    public static Object[][] changeNameData(){
        Object[][] data = new Object[1][1];
        data[0][0]= RandomStringUtils.randomAlphabetic(9).toLowerCase();
        return data;
    }
    @DataProvider(name = "ChangePasswordPositive")
    public static Object[][] changePasswordData(){
        Object[][] data = new Object[1][3];
        data[0][0]= "kisulea";
        data[0][1] = "kisulea";
        data[0][2] = "kisulea";
        return data;
    }
    @DataProvider(name = "ChangePasswordNegative")
    public static Object[][] changePasswordNegative(){
        return new Object[][]{
                {"kisulea12345","kisulea","kisulea"},
                {"","phillipa","phillipa"},
                {"kisulea", "1234n","1234n"},
                {"kisulea","kisulea","12345b"},
                {"kisulea","kisulea",""}


        };
    }
}

package utilities;


import org.testng.annotations.DataProvider;

public class DataProviderClass {
    @DataProvider(name="SingleValue")
    public Object[][]storeSingleValue(){
        return new Object[][]{{"New York"},{"New Jersey"},{"Pennsylvania"}};
    }

    @DataProvider(name="multipleValue")
    public Object[][] storeMultipleValue(){
        return new Object[][]{{"FirstState","New York"},{"Second State","New Jersey"},{"Third State","Pennsylvania"}};
    }

    @DataProvider(name="RealAprRate")
    public Object[][]storeRealAprRate() {
        return new Object[][]{{"200000", "20000", "3%", "30", "3.132%"}};
    }

}



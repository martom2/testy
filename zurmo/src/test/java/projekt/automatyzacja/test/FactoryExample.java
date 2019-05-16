package projekt.automatyzacja.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Test;

public class FactoryExample {
    String userMode;

    @Factory(dataProvider = "userModeProvider")
    public FactoryExample(String userMode) {
        this.userMode = userMode;
    }

    @BeforeClass(alwaysRun = true)
    public void init() throws Exception {
        System.out.println("Before Running the class userMode is " + userMode);
    }

    @Test(groups = "testFactory", description = "test method1")
    public void testMethod1() throws Exception {
        System.out.println("Inside method 1 " + userMode );
    }

    @Test(groups = "testFactory", description = "test method2")
    public void testMethod2() throws Exception {
        System.out.println("Inside method 2 " + userMode);
    }

    @DataProvider
    private static String [][] userModeProvider() {
        return new String [][]{
                new String []{"Admin"},
                new String []{"Tenant"},
                new String []{"AdminUser"},
                new String []{"TenantUser"},
        };
    }

}
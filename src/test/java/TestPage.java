import Base.BasePage;
import org.testng.annotations.Test;

public class TestPage extends BasePage {

    @Test(priority = 1)
    public void test1() {
        System.out.println("Test 1");
    }

}

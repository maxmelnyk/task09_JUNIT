import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.IncludeClassNamePatterns;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.runner.RunWith;

/*@RunWith(Suite.class)
@SuiteClasses({
    CalculatorTest.class,
    MulWithCalculatorTest.class,
    MyLaptopTest.class
})*/
@RunWith(JUnitPlatform.class)
@SelectPackages("com.melnyk.tasks")
@IncludeClassNamePatterns({"^.*$"})
public class RunAllTests {

}

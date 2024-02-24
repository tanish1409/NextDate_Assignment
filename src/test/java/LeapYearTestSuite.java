import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(LeapYear.class)
@Suite.SuiteClasses(NextDateTest.class)
public class LeapYearTestSuite {
    //Code already in the Main Test Class
}

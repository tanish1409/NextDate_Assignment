import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(InvalidDate.class)
@Suite.SuiteClasses(NextDateTest.class)
public class InvalidDateTestSuite {
    //Code already in the Main Test Class
}

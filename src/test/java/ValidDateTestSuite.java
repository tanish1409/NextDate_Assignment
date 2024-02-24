import org.junit.experimental.categories.Categories;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Categories.class)
@Categories.IncludeCategory(ValidDate.class)
@Suite.SuiteClasses(NextDateTest.class)
public class ValidDateTestSuite {
    //Code already in the Main Test Class
}
import junit.framework.JUnit4TestAdapter;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import calculadora.TestCalculadora;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestCalculadora.class})
public class TestSuite {
    public static junit.framework.Test suite(){
        return new JUnit4TestAdapter(TestSuite.class);
    }
}
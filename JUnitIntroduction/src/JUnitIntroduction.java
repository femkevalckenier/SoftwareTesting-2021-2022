import org.junit.*;

import static junit.framework.TestCase.fail;

public class JUnitIntroduction {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Executed before class");

    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Executed after class");
    }

    @Before
    public void setUp() throws Exception {
        System.out.println("Executed before");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("Executed after");
    }

    @Test
    public void test1() {
        System.out.println("Executed test1");
    }

    @Test
    public void test2() {
        System.out.println("Executed test2");
    }
}

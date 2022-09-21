package course3.homework7;

public class TestMe {

    @BeforeSuite
    public static void firstTest (){
        System.out.printf("First test");
    }
    @Test(priority = 1)
    public static void priority1Test(){
        System.out.printf("First priority test");
    }
    @Test(priority = 2)
    public static void priority2Test1(){
        System.out.printf("Second priority test 1");
    }
    @Test(priority = 2)
    public static void priority2Test2() {
        System.out.printf("Second priority test 2");
    }
    @Test
    public static void Test(){
        System.out.printf("Default priority test");
    }
    @Test(priority = 10)
    public static void priority10Test(){
        System.out.printf("Last by priority test");
    }
    @Test(priority = -100)
    public static void priorityNegative100Test(){
        System.out.printf("-100 priority test");
    }
    @AfterSuite
    public static void afterTest(){
        System.out.printf("Last test");
    }
}

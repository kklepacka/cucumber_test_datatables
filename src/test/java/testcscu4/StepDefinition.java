package testcscu4;

import cucumber.api.java.en.Given;

public class StepDefinition {

    @Given("test '")
    public void test1(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test ` echo test `")
    public void test2(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test $test")
    public void test3(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test & echo toto")
    public void test4(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test ; echo toto")
    public void test5(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test | echo toto")
    public void test6(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test ^")
    public void test7(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test %test%")
    public void test8(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test $\\{echo test}")
    public void test9(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test $\\(echo test)")
    public void test10(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test #test")
    public void test11(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test 𨱏")
    public void test12(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test 👩‍❤️‍💋‍👨")
    public void test13(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test [test]")
    public void test14(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test ^^")
    public void test15(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test ,.+-_~@€çé=àû*?!")
    public void test16(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
    @Given("Test .\\/test")
    public void test17(io.cucumber.datatable.DataTable dataTable) {
            System.out.println("test");
    }
}

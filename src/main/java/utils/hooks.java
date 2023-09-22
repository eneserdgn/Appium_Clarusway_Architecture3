package utils;

import io.cucumber.java.*;

public class hooks {

    @BeforeAll
    public static void beforeAll() {
    }

    @Before
    public void before() {
        driverFactory.setDriver();
    }

    @BeforeStep
    public void beforeStep() {
    }

    @AfterStep
    public void afterStep() {
    }

    @After
    public void after() {
        driverFactory.quitDriver();
    }

    @AfterAll
    public static void afterAll() {
    }
}

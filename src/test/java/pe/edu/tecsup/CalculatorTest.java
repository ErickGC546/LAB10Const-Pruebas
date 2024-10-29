package pe.edu.tecsup;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import org.apache.logging.log4j.core.config.Configurator;
public class CalculatorTest {
    private static final Logger log = LogManager.getLogger(CalculatorTest.class);
    @BeforeAll
    static void initAll() {
        Configurator.setRootLevel(Level.INFO);
        log.info("initAll().....!");
    }
    @AfterAll
    static void finishAll() {
        log.info("finishAll()....!");
    }
    @BeforeEach
    void beforeTest() {
        log.info("beforeTest()....!");
    }
    @AfterEach
    void afterTest() {
        log.info("afterTest()....!");
    }
    @Test
    void testSub() {
        log.info("testSub()....!");
        final int EXPECTED = 1;
        Calculator app = new Calculator();
        int actual = app.sub(4, 3);
        assertEquals(EXPECTED, actual);
    }
    @Test
    void testAdd() {
        log.info("testAdd()....!");
        final int EXPECTED = 7;
        // process
        Calculator app = new Calculator();
        int actual = app.add(4, 3);
        //validate
        assertEquals(EXPECTED, actual);
    }
    @Test
    void testMultiplicacion() {
        log.info("testMultiplicacion()....!");
        final int EXPECTED = 12;
        Calculator app = new Calculator();
        int actual = app.multiplicacion(4, 3);
        assertEquals(EXPECTED, actual);
    }
    @Test
    void testDivision() {
        log.info("testDivision()....!");
        final double EXPECTED = 2.5;
        Calculator app = new Calculator();
        double actual = app.division(5, 2);
        assertEquals(EXPECTED, actual, 0.000000000000001);
    }
}


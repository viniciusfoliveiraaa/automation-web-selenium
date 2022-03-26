package suits;

import helpers.HelperDriver;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import testes.DesafioDoisRunnerTest;
import testes.DesafioUmRunnerTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({DesafioUmRunnerTest.class, DesafioDoisRunnerTest.class})
public class SuitsTest {

    @BeforeClass()
    public static void setup(){
        HelperDriver.inicializar();
    }
    @AfterClass
    public static void tearDown(){
        HelperDriver.finalizar();
    }
}

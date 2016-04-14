package assignment_6.cput.za.ac.pc_assembly_store_app.TestFactories;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 * Created by CuanL on 14/04/2016. Testing Commits
 */

@RunWith(Suite.class)
@Suite.SuiteClasses({
        TestComputerFactory.class,
        TestContactDetailsFactory.class,
        TestCPUFactory.class,
        TestEmployeeFactory.class,
        TestGeographicalDetailsFactory.class,
        TestGPUFactory.class,
        TestHDDFactory.class,
        TestMotherboardFactory.class,
        TestPSUFactory.class,
        TestRAMFactory.class
})
public class TestSuite {
}

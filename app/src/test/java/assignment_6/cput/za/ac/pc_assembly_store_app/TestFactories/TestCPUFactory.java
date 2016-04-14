package assignment_6.cput.za.ac.pc_assembly_store_app.TestFactories;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.CPU;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Processor_Brand;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.CPUFactory;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.impl.CPUFactoryImpl;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestCPUFactory {
    private CPUFactory factory;

    @Before
    public void setUp() throws Exception{
        factory = CPUFactoryImpl.getInstance();
    }

    @Test
    public void testCPUCreation()
    {
        CPU cpu = factory.createCPU(121232123L,"5351AA","Intel Skylake",1150, Processor_Brand.Intel,132323,123,8,true);
        Assert.assertEquals(true, cpu.isActive());
    }

    @Test
    public void testCPUCreationUpdate()
    {
        CPU cpu = factory.createCPU(121232123L, "5351AA", "Intel Skylake", 1150, Processor_Brand.Intel, 132323, 123, 8, true);
        Assert.assertEquals(true, cpu.isActive());

        CPU updateCpu = new CPU.Builder()
                .copy(cpu)
                .active(false)
                .build();

        Assert.assertEquals(false, updateCpu.isActive());
        Assert.assertEquals(8, updateCpu.getCores().intValue());
    }
}

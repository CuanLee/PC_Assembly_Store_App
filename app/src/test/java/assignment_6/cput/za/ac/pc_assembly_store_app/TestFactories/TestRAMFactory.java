package assignment_6.cput.za.ac.pc_assembly_store_app.TestFactories;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.RAM;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.RAMFactory;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.impl.RAMFactoryImpl;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestRAMFactory {
    private RAMFactory factory;

    @Before
    public void setUp() throws Exception{
        factory = RAMFactoryImpl.getInstance();
    }

    @Test
    public void testRAMCreation()
    {
        RAM ram = factory.createRAM(1231321L,"vengance","corsair vengance ram","4GB",400,"Dula Module",true);
        Assert.assertEquals(true, ram.isActive());
    }

    @Test
    public void testRAMCreationUpdate()
    {
        RAM ram = factory.createRAM(1231321L,"vengance","corsair vengance ram","4GB",400,"Dula Module",true);
        Assert.assertEquals(true, ram.isActive());

        RAM updateRAM = new RAM.Builder()
                .copy(ram)
                .active(false)
                .build();

        Assert.assertEquals(false, updateRAM.isActive());
        Assert.assertEquals("vengance", updateRAM.getCode());
    }
}

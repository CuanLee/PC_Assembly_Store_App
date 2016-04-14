package assignment_6.cput.za.ac.pc_assembly_store_app.TestFactories;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.FormFactor;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Motherboard;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.MotherboardFactory;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.impl.MotherboardFactoryImpl;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestMotherboardFactory {
    private MotherboardFactory factory;

    @Before
    public void setUp() throws Exception{
        factory = MotherboardFactoryImpl.getInstance();
    }

    @Test
    public void testMOBOreation()
    {
        Motherboard motherboard = factory.createMotherboard(2104654L,"Asus B85m", "Asus Golden Series",null,"1150",null,2133,null,null,4,2,null, FormFactor.ATX,true);
        Assert.assertEquals(true, motherboard.isActive());
        Assert.assertEquals("Asus B85m", motherboard.getCode());
    }

    @Test
    public void testMOBOCreationUpdate()
    {
        Motherboard motherboard = factory.createMotherboard(2104654L, "Asus B85m", "Asus Golden Series", null, "1150", null, 2133, null, null, 4, 2, null, FormFactor.ATX, true);
        Assert.assertEquals(true, motherboard.isActive());
        Assert.assertEquals("Asus B85m", motherboard.getCode());

        Motherboard updateMobo = new Motherboard.Builder()
                .copy(motherboard)
                .active(false)
                .code("Asus b777")
                .build();

        Assert.assertEquals(false, updateMobo.isActive());
        Assert.assertEquals("Asus b777", updateMobo.getCode());
        Assert.assertEquals("Asus Golden Series", updateMobo.getDescription());
    }

}

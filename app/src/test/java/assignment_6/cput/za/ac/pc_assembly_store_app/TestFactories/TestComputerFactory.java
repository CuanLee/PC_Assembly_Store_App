package assignment_6.cput.za.ac.pc_assembly_store_app.TestFactories;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Computer;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.FormFactor;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Motherboard;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.ComputerFactory;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.MotherboardFactory;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.impl.ComputerFactoryImpl;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.impl.MotherboardFactoryImpl;

/**
 * Created by Cuan on 4/3/2016.
 */
public class TestComputerFactory {
    private ComputerFactory factory;
    private MotherboardFactory mobofactory;

    @Before
    public void setUp() throws Exception{
        factory = ComputerFactoryImpl.getInstance();
        mobofactory = MotherboardFactoryImpl.getInstance();
    }

    @Test
    public void testComputerCreation()
    {
        Motherboard motherboard = mobofactory.createMotherboard(2104654L,"Asus B85m", "Asus Golden Series",null,"1150",null,2133,null,null,4,2,null, FormFactor.ATX,true);
        Computer computer = factory.createComputer(56464L,"7501212","Monster Build",motherboard,true,6,4,FormFactor.ATX);
        Assert.assertEquals(true, computer.isActive());
        Assert.assertEquals(4, computer.getCaseFans().intValue());
    }

    @Test
    public void testComputerCreationUpdate()
    {
        Motherboard motherboard = mobofactory.createMotherboard(2104654L, "Asus B85m", "Asus Golden Series", null, "1150", null, 2133, null, null, 4, 2, null, FormFactor.ATX, true);
        Computer computer = factory.createComputer(56464L,"7501212","Monster Build",motherboard,true,6,4,FormFactor.ATX);
        Assert.assertEquals(true, computer.isActive());
        Assert.assertEquals(4, computer.getCaseFans().intValue());

        Computer updateComputer = new Computer.Builder()
                .copy(computer)
                .active(false)
                .hddBays(1)
                .build();

        Assert.assertEquals(false, updateComputer.isActive());
        Assert.assertEquals(1, updateComputer.getHddBays().intValue());
    }
}

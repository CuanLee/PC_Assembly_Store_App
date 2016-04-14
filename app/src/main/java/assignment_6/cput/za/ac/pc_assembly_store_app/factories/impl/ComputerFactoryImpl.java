package assignment_6.cput.za.ac.pc_assembly_store_app.factories.impl;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Computer;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.FormFactor;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Motherboard;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.ComputerFactory;

/**
 * Created by Cuan on 4/3/2016.
 */
public class ComputerFactoryImpl implements ComputerFactory {
    private static ComputerFactoryImpl factory = null;

    private ComputerFactoryImpl(){

    }

    public static ComputerFactoryImpl getInstance(){
        if (factory == null)
            factory = new ComputerFactoryImpl();

        return factory;
    }

    public Computer createComputer(Long id, String code, String description, Motherboard motherboard, boolean active, Integer hddBays, Integer caseFans, FormFactor formFactor){
        Computer computer = new Computer.Builder()
                .id(id)
                .code(code)
                .description(description)
                .motherboard(motherboard)
                .hddBays(hddBays)
                .caseFans(caseFans)
                .formFactor(formFactor)
                .active(active)
                .build();
        return computer;
    }
}

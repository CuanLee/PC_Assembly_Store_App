package assignment_6.cput.za.ac.pc_assembly_store_app.factories.impl;



import java.util.List;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.CPU;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.FormFactor;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.GPU;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.HDD;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Motherboard;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.PSU;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.RAM;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.MotherboardFactory;

/**
 * Created by Cuan on 4/3/2016.
 */
public class MotherboardFactoryImpl implements MotherboardFactory {
    private static MotherboardFactoryImpl factory = null;

    private MotherboardFactoryImpl(){

    }

    public static MotherboardFactoryImpl getInstance(){
        if (factory == null)
            factory = new MotherboardFactoryImpl();

        return factory;
    }

    public Motherboard createMotherboard(Long id, String code, String description, CPU cpu, String chipset, List<RAM> ramList, Integer sataPorts, List<HDD> hddList, PSU psu, Integer usb2, Integer usb3, List<GPU> gpuList, FormFactor formFactor, boolean active){
        Motherboard motherboard = new Motherboard.Builder()
                .id(id)
                .code(code)
                .description(description)
                .cpu(cpu)
                .chipset(chipset)
                .ramList(ramList)
                .sataPorts(sataPorts)
                .hddList(hddList)
                .psu(psu)
                .usb2(usb2)
                .usb3(usb3)
                .gpuListgpu(gpuList)
                .formFactor(formFactor)
                .active(active)
                .build();
        return motherboard;
    }
}

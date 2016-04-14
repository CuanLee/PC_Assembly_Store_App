package assignment_6.cput.za.ac.pc_assembly_store_app.factories;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.CPU;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.FormFactor;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.GPU;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.HDD;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Motherboard;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.PSU;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.RAM;

import java.util.List;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface MotherboardFactory {
    Motherboard createMotherboard(Long id, String code, String description, CPU cpu, String chipset, List<RAM> ramList, Integer sataPorts, List<HDD> hddList, PSU psu, Integer usb2, Integer usb3, List<GPU> gpuList, FormFactor formFactor, boolean active);
}

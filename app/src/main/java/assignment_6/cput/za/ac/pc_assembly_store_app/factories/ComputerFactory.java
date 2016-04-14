package assignment_6.cput.za.ac.pc_assembly_store_app.factories;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Computer;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.FormFactor;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Motherboard;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface ComputerFactory {
    Computer createComputer(Long id, String code, String description, Motherboard motherboard, boolean active, Integer hddBays, Integer caseFans, FormFactor formFactor);
}

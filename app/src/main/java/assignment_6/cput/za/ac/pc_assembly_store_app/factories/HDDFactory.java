package assignment_6.cput.za.ac.pc_assembly_store_app.factories;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.HDD;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface HDDFactory {
    HDD createHDD(Long id, String code, String description, double size_MB, double rpm, boolean sata, boolean active);
}

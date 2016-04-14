package assignment_6.cput.za.ac.pc_assembly_store_app.factories.impl;


import assignment_6.cput.za.ac.pc_assembly_store_app.domain.HDD;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.HDDFactory;

/**
 * Created by Cuan on 4/3/2016.
 */
public class HDDFactoryImpl implements HDDFactory {
    private static HDDFactoryImpl factory = null;

    private HDDFactoryImpl(){

    }

    public static HDDFactoryImpl getInstance(){
        if (factory == null)
            factory = new HDDFactoryImpl();

        return factory;
    }

    public HDD createHDD(Long id, String code, String description, double size_MB, double rpm, boolean sata, boolean active){
        HDD hdd = new HDD.Builder()
                .id(id)
                .code(code)
                .description(description)
                .size_MB(size_MB)
                .rpm(rpm)
                .sata(sata)
                .active(active)
                .build();
        return hdd;
    }
}

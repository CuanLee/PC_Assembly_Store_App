package assignment_6.cput.za.ac.pc_assembly_store_app.factories.impl;



import java.util.List;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Computer;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.ContactDetails;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Employee;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Gender;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.GeographicalDetails;
import assignment_6.cput.za.ac.pc_assembly_store_app.factories.EmployeeFactory;

/**
 * Created by Cuan on 4/3/2016.
 */
public class EmployeeFactoryImpl implements EmployeeFactory {
    private static EmployeeFactoryImpl factory = null;

    private EmployeeFactoryImpl(){

    }

    public static EmployeeFactoryImpl getInstance(){
        if (factory == null)
            factory = new EmployeeFactoryImpl();

        return factory;
    }

    public Employee createEmployee(Long id, String username, String password, String firstName, String lastName, Gender gender, ContactDetails contactDetails, GeographicalDetails geographicalDetails, String idNumber, List<Computer> computerList){
        Employee employee = new Employee.Builder()
                .id(id)
                .username(username)
                .password(password)
                .firstName(firstName)
                .lastName(lastName)
                .gender(gender)
                .contactDetails(contactDetails)
                .geographicalDetails(geographicalDetails)
                .idNumber(idNumber)
                .computerList(computerList)
                .build();
        return employee;
    }

}

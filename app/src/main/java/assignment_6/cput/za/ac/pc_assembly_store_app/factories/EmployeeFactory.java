package assignment_6.cput.za.ac.pc_assembly_store_app.factories;

import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Computer;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.ContactDetails;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Employee;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.Gender;
import assignment_6.cput.za.ac.pc_assembly_store_app.domain.GeographicalDetails;

import java.util.List;

/**
 * Created by Cuan on 4/3/2016.
 */
public interface EmployeeFactory {
    Employee createEmployee(Long id, String username, String password, String firstName, String lastName, Gender gender, ContactDetails contactDetails, GeographicalDetails geographicalDetails, String idNumber, List<Computer> computerList);
}

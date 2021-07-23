package com.employeepayroll;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class EmployeePayRollServiceTest {
    /**
     * create Method for Testing the 3 Employees When Writing to Files should match the Employee Entries
     */
    @Test
    public void given3EmployeeWhenWrittenToFilesShouldMatchEmployeeEntries() {
        EmployeePayRollData[] arrayOfEmployees = {
                new EmployeePayRollData(1,"abc",60000),
                new EmployeePayRollData(2,"xyz",75000),
                new EmployeePayRollData(3,"pqr",50000)
        };
        EmployeePayRollService employeePayRollService = new EmployeePayRollService(Arrays.asList(arrayOfEmployees));
        employeePayRollService.writeEmployeePayuRollData(EmployeePayRollService.IOService.FILE_IO);
        employeePayRollService.printData(EmployeePayRollService.IOService.FILE_IO);
        long entries = employeePayRollService.countEntries(EmployeePayRollService.IOService.FILE_IO);
        Assertions.assertEquals(3,entries);
    }
}

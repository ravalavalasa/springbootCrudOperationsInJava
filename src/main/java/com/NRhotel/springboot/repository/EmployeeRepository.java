package com.NRhotel.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.NRhotel.springboot.model.Employee;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all the crud database methods

}

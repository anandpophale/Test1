package com.xebia.service;

import com.xebia.Application;
import com.xebia.domain.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Collection;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class EmployeeServiceTests {

    @Autowired
    private EmployeeService service;

    @Test
    public void findAllReturnsEmployees() {
        Collection<Employee> list = service.findAll();
        Assert.assertEquals(list.size(), 2);
    }
}

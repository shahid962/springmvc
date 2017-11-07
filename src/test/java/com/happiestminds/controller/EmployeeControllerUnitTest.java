package com.happiestminds.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.servlet.ModelAndView;

import com.happiestminds.entity.Employee;

/**
 * The class <code>EmployeeControllerTest</code> contains tests for the class <code>{@link EmployeeController}</code>.
 *
 * @generatedBy CodePro at 11/2/17 12:10 PM, using the Spring generator
 * @author Mohammed.rahaman
 * @version $Revision: 1.0 $
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:/test-mvc-dispatcher-servlet.xml" })
public class EmployeeControllerUnitTest {
	
	
	 @Test
	public void testSaveEmployee_1()
		throws Exception {
		Employee employee = new Employee();
		employee.setName("happy");
		employee.setSalary(20000);
		employee.setAge(23);
		employee.setId(2);

		ModelAndView result = new EmployeeController().saveEmployee(employee);
		

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.happiestminds.controller.EmployeeController.saveEmployee(EmployeeController.java:51)
		//assertNotNull(result);
	}

	
	

	
}
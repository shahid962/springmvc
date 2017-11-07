package com.happiestminds.controller;

import org.springframework.test.web.ModelAndViewAssert;
import org.springframework.web.servlet.ModelAndView;
import com.happiestminds.entity.Employee;
import junit.framework.*;

/**
 * The class <code>EmployeeControllerTest</code> contains tests for the class <code>{@link EmployeeController}</code>.
 *
 * @generatedBy CodePro at 11/2/17 11:54 AM, using the Spring generator
 * @author Mohammed.rahaman
 * @version $Revision: 1.0 $
 */
public class EmployeeControllerTest extends TestCase {
	/**
	 * Run the ModelAndView createEmployee(Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 11:54 AM
	 */
	public void testCreateEmployee_1()
		throws Exception {
		EmployeeController fixture = new EmployeeController();
		Employee employee = new Employee();
		employee.setName("Shahid");
		employee.setSalary(10000);
		employee.setAge(32);
		employee.setId(1);

		ModelAndView result = fixture.createEmployee(employee);

		// add additional test code here
		assertNotNull("ModelAndView should not be null", result);
		ModelAndViewAssert.assertViewName(result, "employeeForm");
	}

	/**
	 * Run the ModelAndView deleteEmployee(long) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 11:54 AM
	 */
	public void testDeleteEmployee_1()
		throws Exception {
		EmployeeController fixture = new EmployeeController();
		long id = 1;

		ModelAndView result = fixture.deleteEmployee(id);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.happiestminds.controller.EmployeeController.deleteEmployee(EmployeeController.java:59)
		assertNotNull(result);
	}

	/**
	 * Run the ModelAndView editEmployee(long,Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 11:54 AM
	 */
	public void testEditEmployee_1()
		throws Exception {
		EmployeeController fixture = new EmployeeController();
		long id = 1000;
		Employee employee = new Employee();
		employee.setName("Subrath");
		employee.setSalary(50000);
		employee.setAge(30);

		ModelAndView result = fixture.editEmployee(id, employee);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.happiestminds.controller.EmployeeController.editEmployee(EmployeeController.java:41)
		assertNotNull(result);
	}

	/**
	 * Run the ModelAndView saveEmployee(Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 11:54 AM
	 */
	public void testSaveEmployee_1()
		throws Exception {
		EmployeeController fixture = new EmployeeController();
		Employee employee = new Employee();
		employee.setId(1);

		ModelAndView result = fixture.saveEmployee(employee);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.happiestminds.controller.EmployeeController.saveEmployee(EmployeeController.java:51)
		assertNotNull(result);
	}

	/**
	 * Run the ModelAndView saveEmployee(Employee) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 11:54 AM
	 */
	public void testSaveEmployee_2()
		throws Exception {
		EmployeeController fixture = new EmployeeController();
		Employee employee = new Employee();
		employee.setId(0);

		ModelAndView result = fixture.saveEmployee(employee);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.happiestminds.controller.EmployeeController.saveEmployee(EmployeeController.java:49)
		assertNotNull(result);
	}

	/**
	 * Run the ModelAndView searchEmployee(String) method test.
	 *
	 * @throws Exception
	 *
	 * @generatedBy CodePro at 11/2/17 11:54 AM
	 */
	public void testSearchEmployee_1()
		throws Exception {
		EmployeeController fixture = new EmployeeController();
		String searchName = (String) null;

		ModelAndView result = fixture.searchEmployee(searchName);

		// add additional test code here
		// An unexpected exception was thrown in user code while executing this test:
		//    java.lang.NullPointerException
		//       at com.happiestminds.controller.EmployeeController.searchEmployee(EmployeeController.java:73)
		assertNotNull(result);
	}

	/**
	 * Perform pre-test initialization.
	 *
	 * @throws Exception
	 *         if the initialization fails for some reason
	 *
	 * @see TestCase#setUp()
	 *
	 * @generatedBy CodePro at 11/2/17 11:54 AM
	 */
	protected void setUp()
		throws Exception {
		super.setUp();
		// add additional set up code here
	}

	/**
	 * Perform post-test clean-up.
	 *
	 * @throws Exception
	 *         if the clean-up fails for some reason
	 *
	 * @see TestCase#tearDown()
	 *
	 * @generatedBy CodePro at 11/2/17 11:54 AM
	 */
	protected void tearDown()
		throws Exception {
		super.tearDown();
		// Add additional tear down code here
	}

	/**
	 * Launch the test.
	 *
	 * @param args the command line arguments
	 *
	 * @generatedBy CodePro at 11/2/17 11:54 AM
	 */
	public static void main(String[] args) {
		if (args.length == 0) {
			// Run all of the tests
			junit.textui.TestRunner.run(EmployeeControllerTest.class);
		} else {
			// Run only the named tests
			TestSuite suite = new TestSuite("Selected tests");
			for (int i = 0; i < args.length; i++) {
				TestCase test = new EmployeeControllerTest();
				test.setName(args[i]);
				suite.addTest(test);
			}
			junit.textui.TestRunner.run(suite);
		}
	}
}
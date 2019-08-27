
import com.nokia.java.JUnit.BusinessEmployee;
import com.nokia.java.JUnit.EmployeeDetail;
import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class TestEmployeeDetail {
    EmployeeDetail m_employeeDetail = new EmployeeDetail();
    BusinessEmployee m_businessEmployee = new BusinessEmployee();

    @Test
    public void testSalary(){
        m_employeeDetail.setSalary(1200);
        double salary = m_businessEmployee.calculatorSalaryPerYear(m_employeeDetail);
        assertEquals(14400, salary, 0.0);
    }


    @Test
    public void testRaise(){
        m_employeeDetail.setSalary(1200);
        double raise = m_businessEmployee.raise(m_employeeDetail);
        assertEquals(100, raise, 0.0);
        m_employeeDetail.setSalary(100);
        double raise1 = m_businessEmployee.raise(m_employeeDetail);
        assertEquals(50, raise1, 0.0);
    }

}

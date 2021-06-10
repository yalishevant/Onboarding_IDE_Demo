import org.junit.Test

import org.junit.Assert.*

class EmployeeTest {

    private val employee = Employee("Captain Jack Sparrow", Department.MANAGEMENT)

    @Test
    fun getFirstName() {
        assert(employee.getFirstName() == "Jack")
    }

    @Test
    fun getLastName() {
        assert(employee.getLastName() == "Sparrow")
    }
}
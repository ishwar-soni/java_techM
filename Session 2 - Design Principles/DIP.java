class Employee {
    // employee attributes and method
}

class OracleDatabase {
    public Employee fetchById (int id) {
        Employee employee = null;
        //Code to fetch data from the database
        return employee;
    }

    public Employee[] findAll () {
        Employee[] employees = null;
        //Code to fetch data from the database
        return employees;
    }

}

class EmployeeService {
    private OracleDatabase oracleDatabase;
    
    public EmployeeService () {
        oracleDatabase = new OracleDatabase();
    }
    
    public Employee fetchById (int id) {
        return oracleDatabase.fetchById(id);
    }
    
    public Employee[] findAll () {
        return oracleDatabase.findAll();
    }
}

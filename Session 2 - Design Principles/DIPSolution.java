class Employee {
    // student attributes and method
}

interface Database {
    public Employee fetchById (int id);
    public Employee[] findAll ();
}

class OracleDatabase implements Database{
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

class MySQLDatabase implements Database{
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
    private Database database;
    
    public EmployeeService (Database database) {
        this.database = database;
    }

    public Employee fetchById (int id) {
        return database.fetchById(id);
    }
    
    public Employee[] findAll () {
        return database.findAll();
    }
}

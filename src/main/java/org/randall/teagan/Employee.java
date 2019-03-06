package org.randall.teagan;

/**
 * Teagan Randall 3b 215095111
 *
 */

public class Employee
{
    private int empId;
    private String empName;
    private String empSurname;

    public Employee(){
    }

    public Employee(int employeeId, String employeeName, String employeeSurname){
        setEmpId(employeeId);
        setEmpName(employeeName);
        setEmpSurname(employeeSurname);
    }

    public String getEmpSurname(){return empSurname;}

    public void setEmpSurname(String empSurname){this.empSurname = empSurname;}

    public int getEmpId(){
        return empId;
    }

    public void setEmpId(int empId){
        this.empId = empId;
    }

    public String getEmpName(){
        return empName;
    }

    public void setEmpName(String empName){
        this.empName = empName;
    }

    //Overriding the equals() method to test for object equality in the test class
    @Override
    public boolean equals(Object o) {

        boolean isSameObject = false;
        boolean isEmployee = false;
        boolean hasSameValues = false;
        boolean isEqual = false;

        ((Employee) o).setEmpId(111);
        ((Employee) o).setEmpName("Jeff");
        ((Employee) o).setEmpSurname("Stevens");

        if (o == this) {
            isSameObject = true;
        }
        if (o instanceof Employee){
            isEmployee = true;
        }

        Employee c = (Employee) o;

        boolean sameID = ((Employee) o).getEmpId() == c.getEmpId();
        boolean sameName = ((Employee) o).getEmpName().equals(c.getEmpName());
        boolean sameSurnName = ((Employee) o).getEmpSurname().equals(c.getEmpSurname());

       if(sameID && sameName && sameSurnName){
           hasSameValues = true;
       }
       if(isSameObject && isEmployee && hasSameValues){
           isEqual = true;
       }
       return isEqual;
    }
}

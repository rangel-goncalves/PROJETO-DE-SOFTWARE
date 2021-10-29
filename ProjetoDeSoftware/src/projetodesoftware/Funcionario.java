/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetodesoftware;

/**
 *
 * @author Rangel
 */
public class Funcionario {
    
    private String name ;
    private String address;
    private int employeeID;
    private String type;
    
    private float salary;
    private float commission;
    private boolean syndicate;

    public Funcionario(String name, String address, int employeeID, String type, float salary, float commission , boolean syndicate) {
        this.name = name;
        this.address = address;
        this.employeeID = employeeID;
        this.type = type;
        this.salary = salary;
        this.commission = commission;
        this.syndicate = syndicate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public boolean isSyndicate() {
        return syndicate;
    }

    public void setSyndicate(boolean syndicate) {
        this.syndicate = syndicate;
    }

    public float getCommission() {
        return commission;
    }

    public void setCommission(float commission) {
        this.commission = commission;
    }
    
    public void ficha(){
        System.out.println(this.getName()+"\n"+this.getAddress()+"\n"+this.getEmployeeID()+"\n"+this.getType()+"\n"+this.getCommission()+"\n"+
                this.getSalary()+"\n"+this.isSyndicate());
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doublylinkedlist;


public class Employee {
    
    private String name;
    private String branch;
    private long prn;

    public Employee(String name, String branch, long prn) {
        this.name = name;
        this.branch = branch;
        this.prn = prn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public long getPrn() {
        return prn;
    }

    public void setPrn(long prn) {
        this.prn = prn;
    }

    @Override
    public String toString() {
        return "name=" + name + ", branch=" + branch + ", prn=" + prn ;
    }

    
    
    
    
}

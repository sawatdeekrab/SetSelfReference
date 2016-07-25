package tree;

import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Branch {
    private int i;
    private Branch branch;
    private Set<Branch> branches;

    /**
     * @return the i
     */
    public int getI() {
        return i;
    }

    /**
     * @param i the i to set
     */
    public void setI(int i) {
        this.i = i;
    }

    /**
     * @return the testClass
     */
    public Branch getBranch() {
        return branch;
    }

    /**
     * @param testClass the testClass to set
     */
    public void setBranch(Branch tree) {
        this.branch = tree;
    }

    /**
     * @return the testClasses
     */
    public Set<Branch> getBranches() {
        return branches;
    }

    /**
     * @param testClasses the testClasses to set
     */
    public void setBranches(Set<Branch> Branches) {
        this.branches = Branches;
    }
}

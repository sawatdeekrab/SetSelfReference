
package tree;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class Tree {


    public static void main(String[] args) {
        Branch root = new Branch();

        Branch branch1 = new Branch();
        Set<Branch> branch2 = new HashSet<Branch>();
        Branch branch2_1 = new Branch();
        Branch branch2_2 = new Branch();
        
        branch1.setI(1);
        root.setBranch(branch1);
        
        branch2_1.setI(21);
        branch2_2.setI(22);
        branch2.add(branch2_1);
        branch2.add(branch2_2);
        root.setBranches(branch2);

        System.out.println("root:getBranch1: " + root.getBranch().getI());

        Iterator itr = root.getBranches().iterator();
        while (itr.hasNext()) {
            Branch branch = (Branch) itr.next();
            System.out.print("root:getBranch2: " + branch.getI()+"\n");
        }
    }
}

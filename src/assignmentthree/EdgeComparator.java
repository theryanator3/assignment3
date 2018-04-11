/*Authors: Ryan Hansen and Zach Miller
* Date: due, submitted 4/10/18
* Overview: This program constructs a graph from an input adjacency
*           matrix in the form of a comma separated file. It then demonstrates
*           Prim's, Kustal's, and Floyd-Warshall's Algorithms. Controls
*           for the program are found at Main.java line 102. Inputs can
*           be controlled by editing input\\input.cvs.
*/

package assignmentthree;

import java.util.Comparator;

public class EdgeComparator implements Comparator<Edge>{

    @Override
    public int compare(Edge o1, Edge o2) {
        if(o1.getWeight()<o2.getWeight()){
            return -1;
        }else{
            return 1;
        }
    }
}

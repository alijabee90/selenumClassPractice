package treeSet;
import java.util.HashSet;
import java.util.TreeSet;
public class treeHW {

	public static void main(String[] args) {
		

		
				HashSet<String> studentHash = new HashSet<String>();
				studentHash.add("Marcus");
				studentHash.add("Katie");
				studentHash.add("Andy");
				studentHash.add("Kyle");
				studentHash.add("Lucas");
				System.out.println(studentHash);
				TreeSet<String> studentTree = new TreeSet<String>(studentHash);
				studentTree.add("Peter");
				System.out.println(studentTree);

			}

		}
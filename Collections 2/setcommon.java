import java.util.*;
class Setcommon {
  public static void main(String[] args) {

    Scanner Scan= new Scanner (System.in);
    HashSet<Integer> hash1= new HashSet<Integer>();
    HashSet<Integer> hash2= new HashSet<Integer>();

hash1.add(10);
hash1.add(20);
hash1.add(40);
hash1.add(15);
hash1.add(46);

hash2.add(10);
hash2.add(300);
hash2.add(4);
hash2.add(15);
hash2.add(69);

hash1.retainAll(hash2);
    System.out.println(hash1);
  }
}
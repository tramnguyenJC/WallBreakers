import java.util.*;
class SpecialEquivalentStrings {
    public static int numSpecialEquivGroups(String[] A) {
        HashSet<ArrayList<SortedSet>> group = new HashSet<>();
        for(String str : A) {
            SortedSet<Character> oddChars = new TreeSet<>();
            SortedSet<Character> evenChars = new TreeSet<>();
            for (int i = 0; i < str.length(); i++) {
                if (i % 2 == 0) {
                    evenChars.add(str.charAt(i));   
                } else {
                    oddChars.add(str.charAt(i));
                }
            }
            ArrayList<SortedSet> pair = new ArrayList<>();
            pair.add(oddChars);
            pair.add(evenChars);
            group.add(pair);
            System.out.println(str);
            for(Character c : oddChars) {
                System.out.print(c);
            }
            for(Character c : evenChars) {
                System.out.print(c);
            }
        }
        for(ArrayList<SortedSet> pair : group) {
            for (SortedSet set : pair) {
                Iterator it = set.iterator();

                  while (it.hasNext()) {
                     // Get element
                     Object element = it.next();
                     System.out.print(element.toString() + " ");
                  }
                System.out.println("Next one in pair");
            }
            System.out.println("Next pair in group");
        }
        return group.size();
    }

    public static void main(String[] args) {
        String[] A = {"aa","bb","ab","ba"};
        System.out.println(numSpecialEquivGroups(A));
    }
}
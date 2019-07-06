class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> num2Set = new HashSet<>();
        for (int i = 0; i < nums2.length; i++) {
            num2Set.add(nums2[i]);
        }
        HashSet<Integer> intersection = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            if(num2Set.contains(nums1[i])) {
                intersection.add(nums1[i]);
            }
        }
        int[] intersectionArr = new int[intersection.size()];
        Iterator<Integer> iterator = intersection.iterator(); 
        int arrIdx = 0;
        while (iterator.hasNext()) {
            intersectionArr[arrIdx] = iterator.next();
            arrIdx++;
        }
        return intersectionArr;
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(a);

        for (int i = 0; i < a.length - 2; i++) {

            if (i > 0 && a[i] == a[i - 1])
                continue;

            int left = i + 1;
            int right = a.length - 1;

            while (left < right) {

                int sum = a[i] + a[left] + a[right];

                if (sum < 0) {
                    left++;
                }
                else if (sum > 0) {
                    right--;
                }
                else {
                    ans.add(Arrays.asList(a[i], a[left], a[right]));

                    while (left < right && a[left] == a[left + 1])
                        left++;

                    while (left < right && a[right] == a[right - 1])
                        right--;

                    left++;
                    right--;
                }
            }
        }

        return ans;
    }
}
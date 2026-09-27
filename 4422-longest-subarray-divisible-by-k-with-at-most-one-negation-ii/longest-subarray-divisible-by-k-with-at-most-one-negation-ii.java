class Solution {
    public int longestSubarray(int[] nums, int k) {
        int n = nums.length;
        int INF = n + 1;

        int[] firstPrefix = new int[k];
        int[] lastPrefix = new int[k];

        Arrays.fill(firstPrefix, INF);
        Arrays.fill(lastPrefix, -1);

        firstPrefix[0] = 0;
        lastPrefix[0] = 0;

        int[] firstPos = new int[k];
        int[] lastPos = new int[k];

        Arrays.fill(firstPos, INF);
        Arrays.fill(lastPos, -1);

        int prefix = 0;

        for (int i = 0; i < n; i++) {
            int x = ((nums[i] % k) + k) % k;

            if (firstPos[x] == INF) {
                firstPos[x] = i;
            }
            lastPos[x] = i;

            prefix = (prefix + x) % k;

            if (firstPrefix[prefix] == INF) {
                firstPrefix[prefix] = i + 1;
            }
            lastPrefix[prefix] = i + 1;
        }

        int ans = 0;

        for (int r = 0; r < k; r++) {
            if (firstPrefix[r] != INF) {
                ans = Math.max(ans, lastPrefix[r] - firstPrefix[r]);
            }
        }

        for (int x = 0; x < k; x++) {
            if (firstPos[x] == INF) {
                continue;
            }

            int need = (2 * x) % k;

            for (int r = 0; r < k; r++) {
                int left = firstPrefix[r];

                if (left == INF || left > lastPos[x]) {
                    continue;
                }

                int right = lastPrefix[(r + need) % k];

                if (right > firstPos[x]) {
                    ans = Math.max(ans, right - left);
                }
            }
        }

        return ans;
    }
}
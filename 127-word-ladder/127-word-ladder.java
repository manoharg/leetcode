class Solution {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        final Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;

        final Queue<String> q = new LinkedList<>();
        q.offer(beginWord);

        final Set<String> vis = new HashSet<>();
        vis.add(beginWord);

        int count = 1;
        while (!q.isEmpty()) {
            final int size = q.size();
            for (int i = 0; i < size; i++) {
                final String cur = q.poll();

                if (cur.equals(endWord)) return count;

                for (int j = 0; j < cur.length(); j++) {
                    for (int k = 'a'; k <= 'z'; k++) {
                        char[] arr = cur.toCharArray();
                        arr[j] = (char) k;

                        final String str = new String(arr);

                        if (wordSet.contains(str) && !vis.contains(str)) {
                            q.offer(str);
                            vis.add(str);
                            // System.out.println(sb.toString());
                        }
                    }
                }
            }
            count++;
        }
        return 0;
    }
}

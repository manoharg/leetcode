class Solution {

    // TC: O(NlogK)
    public List<String> topKFrequent(String[] words, int k) {
        Map<String, Integer> map = new HashMap<>();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        PriorityQueue<pair> pq = new PriorityQueue<>(
            new Comparator<pair>() {

                public int compare(pair a, pair b) {
                    if (a.freq == b.freq) {
                        return a.word.compareTo(b.word);
                    }
                    return b.freq - a.freq;
                }
            }
        );
        for (String w : map.keySet()) {
            pq.offer(new pair(w, map.get(w)));
            // if (pq.size() > k) {
            //     pq.poll();
            // }
        }
        List<String> res = new ArrayList<>();
        int i=0;
        while (i<k&&!pq.isEmpty()) {
            res.add((pq.poll()).word);
            i++;
        }
        //Collections.reverse(res);
        return res;
    }
}

class pair {
    String word;
    int freq;

    pair(String word, int freq) {
        this.word = word;
        this.freq = freq;
    }
}

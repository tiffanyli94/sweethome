import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKWords {
    public static String[] topKWords(String[] combo, int k) {
        Map<String, Integer> freqMap = new HashMap<>();
        PriorityQueue<Map.Entry<String, Integer>> minHeap = new PriorityQueue<>(k, new Comparator<Map.Entry<String, Integer>>(){
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
//                if (o1.getValue() < o2.getValue()) {
//                    return -1;
//                } else if (o1.getValue() > o2.getValue()) {
//                    return 1;
//                } else {
//                    return 0;
//                }
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        //construct a map of word and its counts
        for (String s : combo) {
            Integer freq = freqMap.get(s);
            if (freq == null) {
                freqMap.put(s, 1);
            } else {
                freqMap.put(s, freq + 1);
            }
        }
        //construct a minHeap with k elements
        int i = 0;
        for (Map.Entry<String, Integer> entry : freqMap.entrySet() ) {
            if (i < k) {
                minHeap.offer(entry);
            } else {
                if (minHeap.peek().getValue() < entry.getValue()) {
                    minHeap.poll();
                    minHeap.offer(entry);
                }
            }
            i++;
        }
        //construct String[] from minHeap
        String[] result = new String[k];
        for (int j = 0; j < k; j++) {
            result[j] = minHeap.poll().getKey();
        }
        return result;
    }


}

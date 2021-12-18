import java.util.List;

public class BoggleBoard {
    DictionaryNode dictionaryRoot;

    //constructor
    public BoggleBoard(char[][] BoggleBoard, String[] Dictionary) {
        dictionaryRoot = generateDictionaryTree(Dictionary);

    }

    //return all words in Boggle Board
    public List<String> getAllWords( ) {
        

    }

    private DictionaryNode generateDictionaryTree(String[] Dictionary) {

        dictionaryRoot = new DictionaryNode(' ');

        for (String word : Dictionary) {
            char[] chars = word.toCharArray();
            DictionaryNode cur = dictionaryRoot;
            for (char c : chars) {
                if (!cur.children.containsKey(c)){
                    cur.children.put(c, new DictionaryNode(c));
                }
                cur = cur.children.get(c);
            }
        }

    }

}

import java.util.List;

public class BoggleBoard {
    DictionaryNode dictionaryRoot;

    //constructor
    public BoggleBoard(char[][] boggleBoard, String[] dictionary) {
        generateDictionaryTree(dictionary);
        dictionaryRoot.print();
    }

    //return all words in Boggle Board
   // public List<String> getAllWords( ) {
    // }

    private void generateDictionaryTree(String[] Dictionary) {

        dictionaryRoot = new DictionaryNode(' ');

        for (String word : Dictionary) {
            char[] chars = word.toCharArray();
            DictionaryNode parent = dictionaryRoot;
            for (int i = 0; i < chars.length; i++) {
                if (!parent.children.containsKey(chars[i])){
                    parent.children.put(chars[i], new DictionaryNode(chars[i]));
                }
                if (i == chars.length - 1) {
                    parent.children.get(chars[i]).isEndOfWord = true;
                }
                parent = parent.children.get(chars[i]);

            }
        }

    }

}

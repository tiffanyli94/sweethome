import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BoggleBoard {
    DictionaryNode dictionaryRoot;

    //constructor
    public BoggleBoard(char[][] boggleBoard, String[] dictionary) {
        generateDictionaryTree(dictionary);
        dictionaryRoot.print();

    }

    //return all words in Boggle Board
    public List<String> getAllWords(char[][] boggleBoard) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        boolean isValid;
        //null check if DicTreeNode is null
        if (dictionaryRoot == null) {
            return result;
        }
        for (int i = 0; i < boggleBoard.length; i++) {
            for (int j = 0; j < boggleBoard[0].length; j++) {
                char startingPoint = boggleBoard[i][j];
                if (dictionaryRoot.children.containsKey(startingPoint)){
                    sb.append(startingPoint);
                    helper(i, j, sb, result, dictionaryRoot.children.get(startingPoint), boggleBoard);
                }
            }
        }
     }

    private void helper(int i, int j, StringBuilder curWord, List<String> result, DictionaryNode curNode, char[][] boggleBoard) {

        //base case
        if (curNode.isEndOfWord) {
            result.add(curWord.toString());
            if (curNode.children.isEmpty()) {
                return;
            }
        }

        for (int[] coordinate : validNex]) [
                tCells(i, j, curNode)) {
            char c = boggleBoard[coordinate[0]][coordinate[1]];
            curWord.append(c);
            DictionaryNode childNode = curNode.children.get(c);
            helper(coordinate[0], coordinate[1], curWord, result, childNode, boggleBoard);
            curWord.deleteCharAt(curWord.length() - 1);
        }
    }

    /**
     *
     * @param i
     * @param j
     * @param curNode
     * @return A set of integer array, first element corresponds to the row index of a valid next cell,
     * second element corresponds to the column index of a valid next cell.
     */
    private Set<int[]> validNextCells(int i, int j, DictionaryNode curNode) {
        Set<int[]> result = new HashSet<>();
        // to be added...
        return result;
    }

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

import java.util.Map;

public class DictionaryNode {
    char value;
    Map<Character, DictionaryNode> children;

    //constructor
    public DictionaryNode(char curChar) {
        this.value = curChar;
    }
}

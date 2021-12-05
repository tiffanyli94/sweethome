public class FindSubset {
    public static void printAllSubsets(char[] input) {
        findSubset(input, 0, new StringBuilder());
    }

    private static void findSubset(char[] input, int index, StringBuilder prefix) {
        //base case
        if (index == input.length) {
            System.out.println(prefix.toString());
            return;
        }

//        prefix.append(input[index]);
//        findSubset(input, index + 1, prefix);
//        prefix.deleteCharAt(input.length - 1);
//
//        prefix.append("");
//        findSubset(input, index + 1, prefix);
//        prefix.deleteCharAt(input.length - 1);

        char[] children = new char[]{input[index], Character.MIN_VALUE};

        for (int i = 0; i < children.length; i++) {
            prefix.append(children[i]);
            findSubset(input, index + 1, prefix);
            prefix.deleteCharAt(prefix.length() - 1);
        }


//        for (int i = 0; i < input.length; i++) {
//            prefix.append(input[i]);
//            findSubset(input, index + 1, prefix);
//            prefix.deleteCharAt(input.length - 1);
//        }
    }
}

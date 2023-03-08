class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int ruleKeyNum;
        if (ruleKey.equals("type")) { // use equals() to compare string values
            ruleKeyNum = 0; // "type" is the first element in each item list
        } else if (ruleKey.equals("color")) {
            ruleKeyNum = 1; // "color" is the second element in each item list
        } else {
            ruleKeyNum = 2; // "name" is the third element in each item list
        }

        int count = 0;

        for (int i = 0 ; i < items.size() ; i++) { // use size() instead of length for lists
            if (items.get(i).get(ruleKeyNum).equals(ruleValue)) { // use get() to access list elements
                count++;
            }
        }

        return count;
    }
}

import java.util.ArrayList;
import java.util.List;

public class _11_Count_Items_Matching_a_Rule {
    public static void main(String[] args) {

        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "lenovo"));
        items.add(List.of("phone", "gold", "iphone"));

        System.out.println(countMatches(items, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            if (ruleKey.equals("type") && ruleValue.equals(item.get(0))) {
                count++;
            } else if (ruleKey.equals("color") && ruleValue.equals(item.get(1))) {
                count++;
            } else if (ruleKey.equals("name") && ruleValue.equals(item.get(2))) {
                count++;
            }
        }
        return count;
    }
}
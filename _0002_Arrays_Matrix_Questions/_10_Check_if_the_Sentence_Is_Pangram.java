import java.util.HashSet;
import java.util.Set;

public class _10_Check_if_the_Sentence_Is_Pangram {
    public static void main(String[] args) {
        
        System.out.println(checkIfPangram("helloworld"));
    }

    public static boolean checkIfPangram(String sentence) {
        
        Set<Character> letterSet = new HashSet<>();

        sentence = sentence.toLowerCase();

        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                letterSet.add(c);
            }
        }

        return letterSet.size() == 26;

    }

    public boolean checkIfPangram2(String sentence) {
        boolean answer = false;
			for(char alpha = 'a' ; alpha<='z' ; alpha++) {
		        	if(sentence.indexOf(alpha) == -1) {
		        		answer= false;
		        		break;
		        	}else {
		        		answer= true;
		        	}
		        }
		        return answer;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Brackets {
// TODO Прокомментировать код
    public static boolean brackets(String line) {

        char[] lineCh = line.toCharArray();
        boolean flag = true;
        List<Character> allBrackets = new ArrayList<>();

        for (int i = 0; i < lineCh.length; i++) {
            if (lineCh[i] == '['
                    || lineCh[i] == '{'
                    || lineCh[i] == '('
                    || lineCh[i] == '}'
                    || lineCh[i] == ']'
                    || lineCh[i] == ')') allBrackets.add(lineCh[i]);
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < allBrackets.size() ; i++) {
            if (allBrackets.get(i).equals('{')||
            allBrackets.get(i).equals('(') ||
            allBrackets.get(i).equals('[')){
                stack.push(allBrackets.get(i));
                //TODO  Почитать про switch
            }else switch (allBrackets.get(i)){
                case '}' : if (stack.isEmpty() || stack.pop() != '{'){
                    flag = false;
                }break;
                case ')' : if (stack.isEmpty() || stack.pop() != '('){
                    flag = false;
                }break;
                case ']' : if (stack.isEmpty() || stack.pop() != '['){
                    flag = false;
                }break;
            }
        }
        return flag;
    }
}

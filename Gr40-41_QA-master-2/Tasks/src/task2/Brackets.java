package task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Brackets {

    public static boolean brackets(String line) {

        char[] lineCh = line.toCharArray();// создаем масив
        boolean flag = true;//Не коректная запись, так как если, мы чтото не указали в условиях, а это не правильно по логике, то нам выдаст true. Хотя есть вопрос, если строка пустая, что должно быть написанно?
        List<Character> allBrackets = new ArrayList<>();//создаем arraylist, в который будем записывать дальнейшии данные

        for (int i = 0; i < lineCh.length; i++) { // используем for, чтобы отсеять все, кроме скобок, которые указаны ниже
            if (lineCh[i] == '['
                    || lineCh[i] == '{'
                    || lineCh[i] == '('
                    || lineCh[i] == '}'
                    || lineCh[i] == ']'
                    || lineCh[i] == ')')
                allBrackets.add(lineCh[i]);
        }

        Stack<Character> stack = new Stack<>();// создаем stack

        for (int i = 0; i < allBrackets.size() ; i++) {//создаем for и проходимся по размеру масива allBrackets
            if (allBrackets.get(i).equals('{')||// условия - если значение с масива allBrackets, равны скобкам, которые здесь указаны, мы кладем их в stack
            allBrackets.get(i).equals('(') ||
            allBrackets.get(i).equals('[')){
                stack.push(allBrackets.get(i));// кладем сюда в stack
            }else switch (allBrackets.get(i)){
                case '}' : if (stack.isEmpty() || stack.pop() != '{'){// дальше идет проверка на следующую скобку, если далее пусто или, не равно, соответстувет, указаным ниже скобкам, то будет false
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
//        if (!stack.isEmpty()){
//            flag = false;
//        }
        return flag && stack.isEmpty();//два условия, если оба true-то будет true, оба false - то будет false, если хотя бы одно условие будет false - nо все будет равно false
    }// stack.isEmpty(); - это исправляет ошибку, что в была написана ранее boolean flag = true;
}

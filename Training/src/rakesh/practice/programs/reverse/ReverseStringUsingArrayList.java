package rakesh.practice.programs.reverse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/*
Using ArrayList object: Convert the input string into the character array by using toCharArray() built in method.
Then, add the characters of the array into the ArrayList object. Java also has built in reverse() method for the
Collections class. Since Collections class reverse() method takes a list object , to reverse the list , we will pass
the LinkedList object which is a type of list of characters.
1. We copy String contents to an object
   of ArrayList.
1. We create a ListIterator object by using
   the listIterator() method on the LinkedList
   object.
2. ListIterator object is used to iterate over
   the list.
3. ListIterator object helps us to iterate
   over the reversed list and print it one
   by one to the output screen.
 */
public class ReverseStringUsingArrayList
{
    public static void main(String args[]) {
        String inputString = "Test Reverse";
        char [] inputCharArray = inputString.toCharArray();
        List<Character> characterList = new ArrayList<Character>();
        for (char c: inputCharArray) {
            characterList.add(c);
        }
        Collections.reverse(characterList);
        ListIterator li = characterList.listIterator();
        while (li.hasNext()) {
            System.out.print(li.next());
        }
    }
}

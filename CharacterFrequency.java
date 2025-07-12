// LinkedHash Map--> HashMap + Linked List = LinkedHashMap
// It stores key-value pairs like HashMap but also remembers the insertion order.
//  Remove Duplicates from Array and Maintain Order (Array to LinkedHashMap)
import java.util.*;
class Student{
    public static void main(String[] args) {
        LinkedHashMap<Character,Integer> freqmap=new LinkedHashMap<>();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=s.nextLine();
        for(char ch:str.toCharArray()){
            freqmap.put(ch,freqmap.getOrDefault(ch,0)+1);
        }
        System.out.println("Frequency of the characters in the given string: "+freqmap);
    }
} 
/* Simple words: "Take character ch, check how many times it already appeared (if not, assume 0), add 1, and put that new value back into the map." */

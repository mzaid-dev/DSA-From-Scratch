package Utilities;

import java.util.*;

/**
 * Java tricks & utilities for DSA problem solving.
 */
public class Java_Tricks {


    // ══════════════════════════════════════════════════════════════════════════
    // 1. MATH UTILITIES
    // ══════════════════════════════════════════════════════════════════════════

    public static void mathUtils() {

        Math.max(3, 7);          // → 7
        Math.min(3, 7);          // → 3
        Math.abs(-5);            // → 5
        Math.pow(2, 10);         // → 1024.0  (returns double)
        Math.sqrt(16);           // → 4.0     (returns double)

        // ⚠️ Use these as infinity in problems (to avoid overflow)
        int  MAX = Integer.MAX_VALUE;   // 2,147,483,647
        int  MIN = Integer.MIN_VALUE;   // -2,147,483,648
        long BIG = Long.MAX_VALUE;      // use when int can overflow
    }


    // ══════════════════════════════════════════════════════════════════════════
    // 2. CHAR ↔ INT CONVERSIONS  (used constantly in string problems)
    // ══════════════════════════════════════════════════════════════════════════

    public static void charConversions() {

        char c = 'a';

        // char → int
        int ascii   = c;               // auto-cast → 97
        int index   = c - 'a';         // → 0  (a=0, b=1, ... z=25)
        int digit   = '5' - '0';       // → 5  (convert digit char to int)

        // int → char
        char back   = (char)('a' + 2); // → 'c'
        char fromD  = (char)('0' + 5); // → '5'

        // check type
        Character.isLetter(c);         // → true
        Character.isDigit('5');        // → true
        Character.isLetterOrDigit(c);  // → true
        Character.isUpperCase(c);      // → false
        Character.isLowerCase(c);      // → true

        // case change
        Character.toUpperCase(c);      // → 'A'
        Character.toLowerCase('A');    // → 'a'
    }


    // ══════════════════════════════════════════════════════════════════════════
    // 3. STRING UTILITIES
    // ══════════════════════════════════════════════════════════════════════════

    public static void stringUtils() {

        String s = "Hello World";

        s.length();                    // → 11
        s.charAt(0);                   // → 'H'
        s.toCharArray();               // → ['H','e','l','l','o',' ','W','o','r','l','d']
        s.substring(6);                // → "World"
        s.substring(0, 5);            // → "Hello"  (end index excluded)
        s.indexOf('o');                // → 4  (first occurrence)
        s.lastIndexOf('o');            // → 7
        s.contains("World");          // → true
        s.startsWith("He");           // → true
        s.endsWith("ld");             // → true
        s.replace('l', 'r');          // → "Herro Worrd"
        s.toLowerCase();              // → "hello world"
        s.toUpperCase();              // → "HELLO WORLD"
        s.trim();                     // removes leading/trailing spaces
        s.split(" ");                 // → ["Hello", "World"]
        s.equals("Hello World");      // → true  (use this NOT ==)
        s.isEmpty();                  // → false (length == 0)
        s.isBlank();                  // → false (length == 0 or only spaces)

        // String ↔ int
        int  n  = Integer.parseInt("42");    // String → int
        String  str = String.valueOf(42);    // int → String

        // Build strings in a loop → always use StringBuilder (NOT String +)
        StringBuilder sb = new StringBuilder();
        sb.append('a');              // add char
        sb.append("bc");            // add string
        sb.reverse();               // reverses in place
        sb.toString();              // → convert back to String
        sb.length();                // current length
        sb.charAt(0);               // access char
        sb.deleteCharAt(0);         // remove char at index
    }


    // ══════════════════════════════════════════════════════════════════════════
    // 4. ARRAYS UTILITIES
    // ══════════════════════════════════════════════════════════════════════════

    public static void arrayUtils() {

        int[] arr = {5, 3, 1, 4, 2};

        Arrays.sort(arr);                        // sorts in place → [1,2,3,4,5]
        Arrays.fill(arr, 0);                     // fill all with 0
        Arrays.copyOf(arr, 3);                   // → [0, 0, 0] (first 3)
        Arrays.copyOfRange(arr, 1, 4);           // → index 1 to 3
        Arrays.toString(arr);                    // → "[0, 0, 0, 0, 0]" (for print)
        Arrays.binarySearch(arr, 3);             // → index of 3 (array must be sorted!)

        // 2D array
        int[][] grid = new int[3][3];
        Arrays.stream(grid).forEach(row -> Arrays.fill(row, 0));
    }


    // ══════════════════════════════════════════════════════════════════════════
    // 5. COLLECTIONS QUICK PICK
    // ══════════════════════════════════════════════════════════════════════════

    public static void collections() {

        // ArrayList — ordered, index access, duplicates allowed
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.get(0);
        list.remove(Integer.valueOf(1));   // remove by value (NOT index)
        Collections.sort(list);
        Collections.reverse(list);
        Collections.max(list);
        Collections.min(list);

        // HashSet — unique values, O(1) add/remove/contains
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.contains(1);               // → true
        set.remove(1);

        // HashMap — key-value, O(1) operations
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 100);
        map.get(1);                    // → 100
        map.getOrDefault(9, 0);        // → 0 (key not found)
        map.containsKey(1);            // → true
        map.containsValue(100);        // → true
        map.remove(1);
        map.size();

        // iterate map
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            entry.getKey();
            entry.getValue();
        }

        // Stack — LIFO
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(1);                 // add to top
        stack.pop();                   // remove from top
        stack.peek();                  // look at top (no remove)

        // Queue — FIFO
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);                // add to back
        queue.poll();                  // remove from front
        queue.peek();                  // look at front (no remove)
    }


    // ══════════════════════════════════════════════════════════════════════════
    // 6. USEFUL ONE-LINERS
    // ══════════════════════════════════════════════════════════════════════════

    public static void oneLiners() {

        // swap two variables without temp
        int a = 3, b = 5;
        a = a ^ b;  b = a ^ b;  a = a ^ b;   // a=5, b=3

        // check even / odd
        int n = 4;
        boolean isEven = (n & 1) == 0;        // faster than n % 2 == 0

        // check if power of 2
        boolean isPow2 = (n & (n - 1)) == 0;  // → true if n=4

        // clamp a value between min and max
        int clamped = Math.max(0, Math.min(n, 10));   // keeps n in [0,10]
    }
}
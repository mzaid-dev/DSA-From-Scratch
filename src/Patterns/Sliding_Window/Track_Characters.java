package Patterns.Sliding_Window;

import java.util.HashMap;
import java.util.Map;

/**
 * Character frequency tracking strategies.
 * Choose based on input charset — prefer arrays over HashMap for speed.
 */
public class Track_Characters {

    // ── Option A 
    // Input: lowercase a–z only | Space: O(1) | Speed: ⚡ Fastest
    public static void optionA(String s) {
        int[] freq = new int[26];

        for (char c : s.toCharArray())
            freq[c - 'a']++;

        
        for (int i : freq) 
            System.out.print(i+" ");
        System.out.println();
    }

    // ── Option B 
    // Input: a–z and A–Z | Space: O(1) | Speed: ⚡ Fast
    // Index mapping → A–Z: 0–25 | a–z: 26–51
    public static void optionB(String s) {
        int[] freq = new int[52];

        for (char c : s.toCharArray()) {
            int idx = (c >= 'A' && c <= 'Z') ? c - 'A' : c - 'a' + 26;
            freq[idx]++;
        }

        for (int i : freq) 
            System.out.print(i+" ");
        System.out.println();
    }

    // ── Option C 
    // Input: any ASCII (letters, digits, symbols) | Space: O(1) | Speed: ⚡ Fast
    // ★ Best default for most problems — covers full ASCII table (0–127)
    public static void optionC(String s) {
        int[] freq = new int[128];

        for (char c : s.toCharArray())
            freq[c]++;  // char auto-casts to its ASCII int value

        for (int i : freq) 
            System.out.print(i+" ");
        System.out.println();
    }

    // ── Option D 
    // Input: anything including Unicode/symbols | Speed: 🐢 Slowest
    // Use only when input goes beyond ASCII (e.g. emoji, Chinese chars)
    public static void optionD(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        for (char c : s.toCharArray()) {

            // getOrDefault → if key exists return its value, else return 0, then +1
            // freq.put(c, freq.getOrDefault(c, 0) + 1);

            // merge → same result, shorter. merge(key, 1, Integer::sum) means:
            // if key not exist → put 1, if exist → add 1 to current value
            freq.merge(c, 1, Integer::sum);
        }

        System.out.println(freq);
    }


    // ── Quick Reference ──────────────────────────────────────────────────────
    //
    //  Option A │ int[26]   │ a–z only           │ ⚡ Fastest
    //  Option B │ int[52]   │ a–z + A–Z          │ ⚡ Fast
    //  Option C │ int[128]  │ All ASCII ★ default │ ⚡ Fast + flexible
    //  Option D │ HashMap   │ Unicode / anything  │ 🐢 Slowest
    //
    // ─────────────────────────────────────────────────────────────────────────

    public static void main(String[] args) {
        optionA("abcd");
        optionB("AaBb");
        optionC("aAbB!1");
        optionD("aAbB!1");
    }
}
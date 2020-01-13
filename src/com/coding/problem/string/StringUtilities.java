package com.coding.problem.string;

import java.util.Arrays;

public class StringUtilities {

    public static void main(String[] args){

       System.out.println(findShortestSubString("This is the test string"));

    }

    /**
     *  Finding Shortest Window in a given String
     *  Input Param - String
     *  Output Param - length of shortest window
     */

    public static String findShortestSubString(String str) {
        int n = str.length();
        final int MAX_CHARS = 256;
        boolean[] visited = new boolean[256];
        Arrays.fill(visited,false);
        int dist_cnt = 0;
        for (int i = 0; i < n; i++) {
            if (visited[str.charAt(i)] == false) {
                dist_cnt++;
                visited[str.charAt(i)] = true;
            }
        }

        int start = 0, start_index = -1, min_len = Integer.MAX_VALUE;
        int[] hash_str = new int[MAX_CHARS];
        int count = 0;
        for (int j = 0; j < n; j++) {
            hash_str[str.charAt(j)]++;
            if (hash_str[str.charAt(j)] == 1) {
                count++;
            }
            if (count == dist_cnt) {

                while (hash_str[str.charAt(start)] >1) {
                    hash_str[str.charAt(start)]--;
                    start++;
                }

                int len = j - start+1;
                if (min_len > len) {
                    min_len = len;

                }
                start_index = start;
            }
        }
        if (start_index == -1) {
            return "";
        }
        System.out.println(start_index+"-"+min_len);
        return str.substring(start_index, min_len + start_index);
    }

}

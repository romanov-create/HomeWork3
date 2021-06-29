package HomeWork3.UrlTop;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class UrlTop {
    public static void main(String[] args) {
        Map<String, Integer> listUrl = new TreeMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader("C://urls.txt"))) {
            int score = 1;
            String readLiner;
            while ((readLiner = reader.readLine()) != null) {
                readLiner = address(readLiner);
                if (listUrl.containsKey(readLiner)) {
                    score = listUrl.get(readLiner) + 1;
                }
                listUrl.put(readLiner, score);
                score = 1;
            }
        } catch (Exception e) {
            System.out.println("Ошибка считывания");
        }

        Set<String> keys = listUrl.keySet();
        int[] quantity = new int[keys.size()];
        int val = 0;
        for (String str : keys) {
            quantity[val] = listUrl.get(str);
            val++;
        }

        Map<Integer, String> listResort = new TreeMap<>();
        int val1 = 0;
        for (String str : keys) {
            listResort.put(quantity[val1], str);
            val1++;
        }

        Arrays.sort(quantity);
        System.out.println("Top Url:");
        for (int i = 1; i <= 10; i++) {
            System.out.println("#" + i + " " + listResort.get(quantity[quantity.length - i])
                    + " - " + quantity[quantity.length - i]);
        }

    }

    private static String address(String readLiner) {
        String[] address = readLiner.split("/");
        String str = address[0].trim();

        if (address[0].startsWith("m.")) {
            str = address[0].substring(2, str.length());
        }
        if (address[0].startsWith("www.")) {
            str = address[0].substring(4, str.length());
        }
        return str;
    }
}
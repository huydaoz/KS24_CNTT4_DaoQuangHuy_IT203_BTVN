package PTIT_CNTT4_IT203_SESSION4.ex1;

import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        String title = "  lập TRÌNH java  cơ bản  ";
        String author = "nguyễn văn a";

        title = title.trim().replaceAll("\\s+", " ").toUpperCase();

        author = author.trim().replaceAll("\\s+", " ").toLowerCase();
        String[] words = author.split(" ");
        String formattedAuthor = "";
        for (String w : words) {
            formattedAuthor += w.substring(0, 1).toUpperCase() + w.substring(1) + " ";
        }
        formattedAuthor = formattedAuthor.trim();

        System.out.println("[" + title + "] - Tác giả: " + formattedAuthor);
    }
}


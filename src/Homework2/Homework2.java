package Homework2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Homework2 {
    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("C:\\Users\\Admin\\IdeaProjects\\GB_Java_I\\src\\Homework2\\Testing.txt"), UTF_8);

        List<String> result = new ArrayList<>();
        int len;
        for (String s : lines) {
            len = s.length();
            StringBuilder sb = new StringBuilder("");
            //sb.append(s.charAt(0));
            //System.out.println("s line = " + s);
            for (int i = 0; i < len ; i++) {
                if ((i > 0) && (i < len - 1)) {
                    if ((s.charAt(i) == ' ') && (!(Character.isLowerCase(s.charAt(i + 1)))))
                        sb.append(".");
                }
                sb.append(s.charAt(i));
            }
            sb.append('.');
            result.add(sb.toString());
        }
        for (String s : result) {
            System.out.println(s);
        }


    }
}
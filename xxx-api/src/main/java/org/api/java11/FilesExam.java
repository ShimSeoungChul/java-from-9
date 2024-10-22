package org.api.java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FilesExam {
    public static void main(String[] args) throws IOException {
        // Files.readString() 메서드 추가
        var path = Paths.get(Paths.get(".").toAbsolutePath() + "/xxx-api/test.txt");
        String str = Files.readString(path);
        System.out.println(str);

        // Files.writeString() 메서드 추가
        var path2 = Paths.get(Paths.get(".").toAbsolutePath() + "/xxx-api/test2.txt");
        Files.writeString(path2, "Hello API");
    }
}

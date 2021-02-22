package com.free_open_university.backend.bean;

import java.io.File;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;

public class ExecuteShellProcessBuilder {

    public static void main(String[] args) {
        String[] cmd = new String[] {"src/main/resources/hello.sh"};
        ProcessBuilder pb = new ProcessBuilder(cmd);
        try {
            File log = new File("src/main/resources/log.txt");
            pb.redirectErrorStream(true);
            pb.redirectOutput(ProcessBuilder.Redirect.appendTo(log));
            Process p = pb.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));
            String s = null;
            while ((s = reader.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            // TODO auto-generated catch block
            e.printStackTrace();
        }
    }
}

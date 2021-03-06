package This;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Inputting {
    private static boolean fromFile = false;
    private static LinkedList<String> scriptCommands = new LinkedList<>();
    public static ArrayList<String> runningScriptNames = new ArrayList<>();




    public static void parseScript(String scriptPath) throws IOException {
        runningScriptNames.add(scriptPath);

        String data = "";
        File file = new File(scriptPath);//file

        FileInputStream fis = new FileInputStream(file);
        BufferedInputStream bis = new BufferedInputStream(fis);
        while (bis.available() > 0) {
            data += (char) bis.read();
        }
        data += '\n';
        String lastLine = "";
        LinkedList<String> comStrs = new LinkedList<>();
        for (char c : data.toCharArray()) {
            if (c == '\n') {
                comStrs.add(lastLine);
                lastLine = "";

            } else {
                lastLine += c;
            }
        }
        comStrs.add("FILE_END" + scriptPath);
        int s = comStrs.size();
        for (int i = 0; i < s; i++) {
            scriptCommands.addFirst(comStrs.pollLast());
        }


        fromFile = true;
    }
    public static boolean isFromFile() {
        return fromFile;
    }

    public static String readLine() {

        if (scriptCommands.size() == 1) {
            runningScriptNames.remove(scriptCommands.poll().split(" ")[1]);
            fromFile = false;
        }

        if (fromFile) {

            String command = scriptCommands.poll();

            if (command.split(" ")[0].equals("FILE_END")) {
                System.out.println("Stop executing file " + command.split(" ")[1]);
                runningScriptNames.remove(command.split(" ")[1]);
                return readLine();

            }


            System.out.print(">");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Problem with sleeping");
                ;
            }

            System.out.println(command);
            return command;

        } else {

            Scanner sc = new Scanner(System.in);
            System.out.print(">");
            return sc.nextLine();
        }
    }
}

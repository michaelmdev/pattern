package gof.structural.facade;

import com.google.common.base.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleFacade {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String getString(String prompt, String def) throws IOException {
        prompt(prompt, def);
        String s = reader.readLine();
        return Strings.isNullOrEmpty(s) ? def : s;
    }

    public int getInt(String prompt, int def) throws IOException {
        prompt(prompt, def);
        while (true) {
            try {
                return Integer.parseInt(reader.readLine());
            }
            catch (NumberFormatException nfe) {
                System.out.println(nfe.getMessage());
                prompt("try again", def);
            }
        }
    }

    private void prompt(String prompt, Object def) {
        System.out.printf("%s [%s] :", prompt, def.toString());
    }
}

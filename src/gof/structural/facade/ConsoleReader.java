package gof.structural.facade;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ConsoleReader {
    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String readString() {
        try {
            return reader.readLine();
        }
        catch (Exception e) {
            throw new ConsoleException(e);
        }
    }

    public int readInt() {
        Integer theInteger = null;

        try {
            return Integer.parseInt(reader.readLine());
        }
        catch (Exception e) {
            throw new ConsoleException(e);
        }
    }

    public Double readDouble() {
        try {
            return Double.parseDouble(reader.readLine());
        }
        catch (Exception e) {
            throw new ConsoleException(e);
        }
    }
}

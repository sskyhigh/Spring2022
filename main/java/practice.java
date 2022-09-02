
import java.util.Scanner;
import java.io.*;

public class practice {

    public static void main(String[] args) throws IOException {
        String source = "ID is 12-AB-1X ";
        int pos = source.indexOf('-');
        int pos1 = source.indexOf(' ', pos + 1);
        String str1 = source.substring(pos + 1, pos1);
        System.out.println(str1);

        source = "from Denver,CO.";
        int pos2 = source.lastIndexOf(',');
        int pos3 = source.lastIndexOf(' ', pos2);
        String str2 = source.substring(pos3 + 1, pos2);
        System.out.println(source.substring(pos3 + 1, pos2));

        System.out.println(str1.compareTo(str2) > 0);

    }
}

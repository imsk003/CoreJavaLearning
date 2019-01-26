import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferedReaderExample
{
    public static void main(String[] args)
    {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = null;
        try {
            name = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(name);
    }
}

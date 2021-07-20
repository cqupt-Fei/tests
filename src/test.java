import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class test {
    public static int readFileByLines(String fileName) {
        File file = new File(fileName);
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(file));
            String tempString = null;
            int line = 0;
            while ((tempString = reader.readLine()) != null) {
                line++;
            }
            reader.close();
            return line;
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (reader != null) {
                try {
                    reader.close();
                }
                catch (IOException e1) {
                }
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int lines = readFileByLines("D:\\test4\\src\\taxi_gps.txt");//取绝对路径
        System.out.println("Number of cars: "+lines);
    }
}

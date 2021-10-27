import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;

public class AvgCounter {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public int fileReader(){
        int sum = 0;
        int count = 0;
        int avg = 0;
        File myFile;
        BufferedReader reader=null;
        String line = null;

        try {
            myFile = new File("src/main/resources/data.txt");
            reader = new BufferedReader(new java.io.FileReader(myFile));
            line = reader.readLine();
        }catch(Exception e){
            logger.error(e.getMessage());
        }
        try{
            if(line!= null){
                while(line != null){
                    sum += Integer.parseInt(line);
                    count++;
                    line = reader.readLine();
                }
            }
        }catch (Exception e){
            logger.error(e.getMessage());
        }
        try {
            reader.close();
            avg = sum/count;
            System.out.println(avg);
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
        return avg;
    }
    }


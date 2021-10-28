import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class AddSumToDataTxt {

    private static Logger logger = LoggerFactory.getLogger(Main.class);

    public void addSum(int sum){
        File myFile;
        BufferedWriter writer=null;

        try {
            
            myFile = new File("src/main/resources/data.txt");
            writer = new BufferedWriter(new FileWriter(myFile, true));
            writer.append("\n").append(String.valueOf(sum));
            writer.close();
            System.out.println("Done");
            
        }catch(Exception e){
            
            logger.error(e.getMessage());
            
        }}}

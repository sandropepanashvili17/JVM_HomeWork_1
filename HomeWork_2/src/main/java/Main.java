import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        AvgCounter avgCounter = new AvgCounter();
        AddSumToDataTxt addSum = new AddSumToDataTxt();


        double sum = avgCounter.fileReader();
        addSum.addSum((int) sum);
    }
}

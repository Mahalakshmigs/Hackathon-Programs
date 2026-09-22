package hackathon;

/*Q31. Read a file content and write it to a new file in reverse order.
(reverse line 1-10 to line 10-1)*/

import java.io.*;

public class Q31ReadLinesFiles {

    public static void main(String[] args) throws Exception {

        // STEP 1: Create input.txt
        FileWriter fw = new FileWriter("input.txt");

        fw.write("1: This is Mahalakshmi.\n");
        fw.write("2: I am learning Java. \n");
        fw.write("3: Through TekArch Training.\n");
        fw.write("4: I learned manual testing.\n");
        fw.write("5: Now I am learning Agile.\n");
        fw.write("6: I learned why Automation testing is necessary.\n");
        fw.write("7: I will also be learning Automation tools.\n");
        fw.write("8: I will learn SQL DataBase\n");
        fw.write("9: I will also learn AI Autmation.\n");
        fw.write("10: I am excited to learn all these interesting topics and growing my knowledge.\n");

        fw.close();

        System.out.println("input.txt created.");

        // STEP 2: Read input.txt
        BufferedReader br = new BufferedReader(
                new FileReader("input.txt"));

        String[] lines = new String[10];

        int count = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lines[count] = line;
            count++;
        }

        br.close();

        // STEP 3: Write to output.txt in reverse order
        BufferedWriter bw = new BufferedWriter(
                new FileWriter("output.txt"));

        for (int i = count - 1; i >= 0; i--) {

            bw.write(lines[i]);
            bw.newLine();
        }

        bw.close();

        System.out.println("output.txt created in reverse order.");
    }
}
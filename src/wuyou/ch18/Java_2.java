package wuyou.ch18;

import java.io.*;

public class Java_2 {
    public static void main(String args[]) {
        String ShowMes[] = {"在那山的那边海的那边有一群蓝精灵", "它们活泼又聪明它们调皮又灵敏", "它们自由自在生活在那绿色的大森林", "它们善良勇敢相互都欢喜！"};
        try {
            //*********Found********
            FileWriter out = new FileWriter(new File("test.txt"));
            BufferedWriter outBW = new BufferedWriter(out);
            for (int i = 0; i < ShowMes.length; i++) {
                outBW.write(ShowMes[i]);
                outBW.newLine();
            }
            //*********Found********
            outBW.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            //*********Found********
            FileReader in = new FileReader(new File("test.txt"));
            BufferedReader inBR = new BufferedReader(in);
            String stext = null;
            int j = 1;
            while ((stext = inBR.readLine()) != null) {
                System.out.println("第" + j + "行内容" + stext);
                //*********Found********
                j++;
            }
            inBR.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

package File��;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class answer����ļ� {
	public static void main(String[] args) {
        // TODO Auto-generated method stub
        int size = 100 * 1024;  /* 100kB */
        File file = new File("C:\\sss\\ss\\eclipse.exe");
        if(file.length() == 0) {
            System.out.println("���ļ������ڣ������˳���");
            System.exit(0);
        }
        //����˼·���Ȱ�eclipse.exe�����ݶ���������data��Ȼ��ͨ����data�ָ��eachdata���ٰ�eachdataͨ�������д��eclipse.exe-i
        byte data[] = new byte[(int)file.length()];
        byte eachdata[] = new byte[size];
        try {
            FileInputStream fis = new FileInputStream(file);
            fis.read(data);
            fis.close();
        }catch(IOException e) {
            e.printStackTrace();
        }
        int num = (int)file.length()/size + 1;
        for(int i = 0; i < num; i++) {
            if(i + 1 != num) 
                eachdata = Arrays.copyOfRange(data, i * size, (i + 1) * size);
            else
                eachdata = Arrays.copyOfRange(data, i * size, (int)file.length());
            String filename = file.getName() + "-" + i;
            File ifile = new File(file.getParent(), filename);
            if(!ifile.exists())
                try {
                    ifile.createNewFile();
                }catch(IOException e) {
                    e.printStackTrace();
                }
            try {
                FileOutputStream fos = new FileOutputStream(ifile);
                fos.write(eachdata);
                fos.close();
                System.out.println(ifile.getAbsolutePath() + " " + ifile.length() + " " + "bytes.");
            }catch(IOException e){
                e.printStackTrace();
            }
        }
         
    }
}

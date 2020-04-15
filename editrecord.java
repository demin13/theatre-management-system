import java.io.*;
import java.util.*;
public class editrecord {
    private static Scanner x;
    public static void main(String[] args){
        String filepath="records.txt";
        String editterm = "4444";
        String newId = "2222";
        String newName = "shekhar";
        String newAge = "20";


        editRecord(filepath,editterm,newId,newName,newAge);
    }
    public static void editRecord(String filepath,String editterm,String newId,String newName,String newAge){
        String tempFile = "temp.txt";
        File oldfile = new File(filepath);
        File newFile = new File(tempFile);
        String ID = "";
        String name = "";
        String age ="";
        try{
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            x=new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");
            while(x.hasNext())
            {
                ID=x.next();
                name= x.next();
                age= x.next();
                if(ID.equals(editterm))
                {
                    pw.println(newId+","+newName+","+newAge);
                }
                else
                {
                    pw.println(ID+","+name+","+age);
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldfile.delete();
            File dump=new File(filepath);
            newFile.renameTo(dump);

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

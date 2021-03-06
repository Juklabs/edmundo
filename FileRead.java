import java.io.*;
public class FileRead  
{
    public static String[] Read(File FileToRead)
    {
        if(FileToRead==null)
            return new String[]{"Save file is unsupported"};
        try{
            FileReader fr = new FileReader(FileToRead);
            BufferedReader br = new BufferedReader(fr);
            String[] TXTData = new String[0];
            for(String Text = br.readLine(); Text!=null; Text=br.readLine())
                TXTData = TextField.addToArray(TXTData,Text);
            br.close();
            if(TXTData.length==0)
                return new String[]{"Save file selected is no any data."};
            return TXTData;
        }
        catch(Exception e)
        {
            return new String[]{"File doesn't exist"}; 
        }
    }
     /*
      * 
      * Test BufferedReader model
    FileReader fr = new FileReader(FoundFile);
    BufferedReader br = new BufferedReader(fr);

    String zeile1 = br.readLine();
    System.out.println(zeile1);
    String zeile2 = br.readLine();
    System.out.println(zeile2);
    String zeile3 = br.readLine();
    System.out.println(zeile3);

    br.close(); */
    
}

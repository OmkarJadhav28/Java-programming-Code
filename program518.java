import java.util.*;
import java.io.*;

class program518
{
    public static void main(String arg[])
    {
    
        Scanner sobj = new Scanner(System.in);
        byte Header[] = new byte[100];

        System.out.println("-------marvellous Packer Unpacker------");

        system.out.println("Unpacking Activity of the appication is started...");
        
        System.out.println("Enter the file name which contains the packed data : ");
        String PackFile = sobj.nextLine();

        try
        {
            File Packobj = new File(PackFile);

            FileInputStream inobj = new FileInputStream(Packobj);

            inobj.read(Header,0,100);

            String HeaderStr = new String(Header);

            System.out.println(HeaderStr);

            String Tokens[];
            Tokens = HeaderStr.split(" ");

            System.out.println("File name : "+Token[0]);
            System.out.println("File length : "+Token[1]);
        }
        catch(Exception obj)
        {
            System.out.println("Exception occured "+obj);
        }
    }    
}    
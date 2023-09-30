
import java.util.*;

class Collection2
{
    public static void main(String arg[])
    {
        Hashtable <String, Integer> hobj = new Hashtable<String,Integer>();

        hobj.put("C programming",990);
        hobj.put("C++ programming",1200);
        hobj.put("Java programming",780);
        hobj.put("Python programming",1650);

        System.out.println("Book price of java"+hobj.get("Java programming"));
        hobj.remove("C++ programming");

        Enumeration eobj = hobj.keys();
        while(eobj.hasMoreElements())
        {
            System.out.println(eobj.nextElement());
        }
    }
}    ō
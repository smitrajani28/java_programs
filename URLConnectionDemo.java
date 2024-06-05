import java.net.*; //required for InetAddress Class 
import java.io.*;
import java.util.*;
public class URLConnectionDemo{  
     public static void main(String[] args) throws IOException{  
	try {
	       URL url=new URL("https://www.w3schools.com/html/default.asp");
	       URLConnection con = url.openConnection();
                      System.out.println("Date: " + new Date(con.getDate()));
                      System.out.println("Content-type: " + con.getContentType());
                      System.out.println("Expiry: " + con.getExpiration());
                      System.out.println("Length of content: " + con.getContentLength());
        //               if(con.getContentLength()>0){
        //         	int ch;
        //         	InputStream in=con.getInputStream();
        //         	while ((ch=in.read())!=-1) {                    
        //         	     System.out.print((char)ch);    
        //        	    	} 
	    //   }	
	}catch(MalformedURLException e) { 
	       System.out.println(e);
	}  
    }  
}

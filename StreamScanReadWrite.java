import java.io.*;
import java.util.Scanner;
public class StreamScanReadWrite {
    public static void main(String[] args) throws IOException {
        File file =new File("C:\\Users\\DELL\\Documents\\file\\file3.txt");
        
        if(file.createNewFile()){
            System.out.println("create file successful");
        }else{
            System.out.println("file exists");
        }
        
        try{
            Scanner sc=new Scanner(System.in);
            PrintWriter pw=new PrintWriter(new FileWriter("C:\\Users\\DELL\\Documents\\file\\file3.txt"));
            String Text="";
            
            while(!Text.equals("n")){
            System.out.println("Enter student Name");
            Text=sc.next();
            pw.write(Text+",");
            System.out.println("Enter student Id");
            Text=sc.next();
            pw.write(Text+",");
            pw.println();
            System.out.println("Import Successfully");
            System.out.println("Press any key For More Input Without n");
            System.out.println("Enter n to finish");
            Text=sc.next();
            }
        
        pw.close();
        System.out.println("completed");
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        try{
            BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\DELL\\Documents\\file\\file3.txt"));
       String st; 
       while ((st = br.readLine()) != null) 
       System.out.println(st); 
            
        }catch(Exception e){
                e.printStackTrace();
                
                }
        }
    }


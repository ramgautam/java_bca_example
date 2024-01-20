package multithreading;

import java.io.*;
import java.util.ArrayList;

public class ThreadManager extends Thread {

	public void run() {
        try {
        	System.out.println("in run");
        	System.out.println("current thread name"+ Thread.currentThread().getName());
            BufferedReader br = null;
            String line;
            String fileNme = "/Users/ramgautam/Documents/Java_class_Daily_points.txt";
            String newfileName = "/Users/ramgautam/Documents/Java_class_Daily_points_1.txt";
            ArrayList<String> fileLines = new ArrayList<String>();
            int numLine = 0;

            File outFile = new File("/Users/ramgautam/Documents/tmp.txt");

            // File Reading  mechanism
            FileInputStream fis = null;
            PrintWriter out = null;

            	//From here is a critical section

                fis = new FileInputStream(fileNme);


            // File Writting  mechanism
                FileOutputStream fos = new FileOutputStream(outFile);
                out = new PrintWriter(fos);
            
                // internal memory mechanism that read stream of character from file
                BufferedReader in = new BufferedReader(new InputStreamReader(fis));

            
            //
            try {
            	
                while ((line = in.readLine()) != null) {
                	System.out.println("new line txt:::"+ line);
                    fileLines.add(line);
                }
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }

            if (!fileLines.isEmpty()) {
                int middleLine = (int) Math.round(fileLines.size() / 2);
                System.out.println("current thread name"+ Thread.currentThread().getName());
                fileLines.add(middleLine, Thread.currentThread().getName());

                for (int i = 0; i < fileLines.size(); i++) {
                    out.println(fileLines.get(i));
                }

                out.flush();
                out.close();
                try {
                    in.close();
                    //new File(fileNme).delete();
                    outFile.renameTo(new File(newfileName));
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

//end critical section
      }
        
    }catch(Exception e) {
    	e.printStackTrace();
    }
}
	
	public static void main(String args[]) {
		ThreadManager threadManager = new ThreadManager();
		threadManager.start();
		
	}
}


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author spencercook
 */
public class ClassManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        RandomAccessFile raf = new RandomAccessFile("random_facts.dat", "rw");
        ClassRecord cr = new ClassRecord("Mathematics", 12, "Bob");
        raf.seek(0);
        raf.writeChars(cr.getName());
        raf.writeChars(cr.getTeacher());
        
        ClassRecord newRecord = new ClassRecord("" , 0, "");
        int recordNumber = 1;
        int position = newRecord.LENGTH * (recordNumber - 1);
        raf.seek(position);
        char[] name = new char[ClassRecord.NAME_LENGTH];
        for (int i = 0; i < name.length; i++) {
            name[i] = raf.readChar();
        }
        
        for (int i = 0; i < name.length; i++) {
            System.out.println(name[i]);
        }
    }
    
}

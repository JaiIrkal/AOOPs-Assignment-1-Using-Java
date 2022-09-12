/*
 * 
 * Q4 : Create a file Alphabets.txt and read the file. If a consonant is 
 * encountered then copy the consonant to consonant.txt and if a vowel
 * is found then throw the VowelNotAllowedException.
*/

import java.io.*;
import java.nio.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.*;

class VowelNotAllowedException extends Exception {

    VowelNotAllowedException(String s) {

        super(s);
    }
}

public class Q4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        File alphabetFile = new File("Alphabet");
        File consonantFile = new File("consonant");

        try {

            alphabetFile.createNewFile();
            consonantFile.createNewFile();

        } catch (Exception e) {

            System.out.println(e);
        }

        // Writing into the alphabet file
        try {

            FileWriter alphabetWriter = new FileWriter(alphabetFile);
            alphabetWriter.write("a\nb\nc\nd\ne\nf\ng\nh\ni\nj\nk\nl\nm\nn\no\np\nq\nr\ns\nt\nu\nv\nw\nx\ny\nz");
            alphabetWriter.close();
            List<String> textList = Files.readAllLines(alphabetFile.toPath(), Charset.defaultCharset());

            FileWriter consonantWriter = new FileWriter(consonantFile);
            String stringText = textList.toString();

            for (String str : textList) {

                if (str.contains("a") || str.contains("e") || str.contains("i") || str.contains("o")
                        || str.contains("u")) {

                    try {

                        throw new VowelNotAllowedException("");

                    } catch (VowelNotAllowedException e) {
                        System.out.println("Vowel not allowed");
                    }
                } else {

                    try {

                        consonantWriter.write(str + "\n");
                        consonantWriter.flush();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
            }

        } catch (IOException w) {

            w.printStackTrace();
        }
    }

}
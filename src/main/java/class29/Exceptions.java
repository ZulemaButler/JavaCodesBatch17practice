package class29;

import java.io.FileInputStream;

public class Exceptions {


        public static void main(String[] args) {

            try (FileInputStream fileInputStream = new FileInputStream("")) {


            } catch (Exception f) {
                System.out.println("Please check the file path");
            }

        }
    }


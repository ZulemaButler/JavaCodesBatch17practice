package class29;

import java.io.FileInputStream;
import java.io.IOException;

public class E10CExceptions {

        public static void main(String[] args) {
                    //try with resources "syntax will close the file
            try( FileInputStream fileInputStream = new FileInputStream("/Users/porschabuttercup/Desktop/Batch17/Employees.xlsx")) {


            } catch (IOException f) {
                System.out.println("Please check the file path");
            }
                }
            }



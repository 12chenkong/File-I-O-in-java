package File;

import java.io.*;
import java.util.Scanner;

public class WriteAndRead {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int op;
        do {
            System.out.println("1.Write to file:");
            System.out.println("2.Read to file: ");
            System.out.println("3.exit the program");
             op=scanner.nextInt();
            switch (op){
                case 1->{
                    System.out.println("How many name to you have: ");
                    int num=scanner.nextInt();
                    scanner.nextLine();
                    String []names=new String[num];
                    for(int i=0;i<names.length;i=i+1){
                        System.out.print("Enter name:");
                        names[i]=scanner.nextLine();
                    }
                    try {
                        BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Sovan Computer\\Documents\\SLS_homewrk\\HomeWork\\src\\message.txt"));
                        for(String i:names){
                            bw.write("\n"+i);
                        }
                        // close the file that you have just opened
                        bw.close();
                    }catch (Exception ex){
                        ex.printStackTrace();
                    }

                }
                case 2->{

                    try {
                        BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Sovan Computer\\Documents\\SLS_homewrk\\HomeWork\\src\\message.txt"));
                        String line;
                        while ((line=reader.readLine())!=null){
                            System.out.println(line);
                        }
                        reader.close();
                    }catch (IOException ex){
                        ex.printStackTrace();
                    }

                }
            }


        }while (op!=3);

    }
    }
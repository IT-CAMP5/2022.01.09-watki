package pl.camp.it.pliki;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            //****** ZAPIS DO PLIKU *******//
            String a = "Mateusz Bereda";
            Cat cat = new Cat("kajtek", "dachowiec", 10);
            Cat cat2 = new Cat("Mruczek", "brytyjski", 5);

            BufferedWriter writer = new BufferedWriter(new FileWriter("plik.txt"));
            writer.write(cat.toString());
            writer.newLine();
            writer.write(cat2.toString());
            writer.close();


            //***** ODCZYT Z PLIKU ******/
            BufferedReader reader = new BufferedReader(new FileReader("plik.txt"));

            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                String[] parts = line.split(";");
                //Cat cat1 = new Cat(parts[0],parts[1],Integer.parseInt(parts[2]));
                Cat cat1 = new Cat();
                cat1.setName(parts[0]);
                cat1.setRace(parts[1]);
                cat1.setAge(Integer.parseInt(parts[2]));

                System.out.println(cat1.getName());
                System.out.println(cat1.getRace());
                System.out.println(cat1.getAge());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

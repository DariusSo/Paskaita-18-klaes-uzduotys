package org.example;

import java.io.IOException;
import java.nio.file.Path;
import java.sql.SQLException;

public class Main {
    private static final String URL = "jdbc:mysql://localhost:3306/pirmaDB";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    public static void main(String[] args) throws IOException, SQLException {
        Failas f = new Failas(URL, USERNAME, PASSWORD);
        f.isFailoIMasyva();
        f.rusiuok();
        f.spausdintIFaila(f.masyvas);
        FailoBazineInformacija b = new FailoBazineInformacija();
        System.out.println(b.getFileSizeInKB(Path.of(b.path)));
        f.spausdintRusiuotusFailuPavadinimus(f.path);
        f.idetiSkaiciusIDB();
    }


}
package com.motoclub.bbdd;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class InsertDataInBBDD {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Connection con = null;
        Statement statement = null;
        PreparedStatement preparedStatement;
        ResultSet resultSet = null;

        String csvFile = "/home/cristian/Documentos/Spring/SpringMotoClub/src/main/resources/April_2020_MPSOV.csv";
        BufferedReader br = null;
        String line = "";
        String csvSplit = ",";

        Class.forName("com.mysql.cj.jdbc.Driver");

        con = DriverManager
                .getConnection("jdbc:mysql://localhost/motorbikes?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true&user=root");


        try {
            br = new BufferedReader(new FileReader(csvFile));

            while ((line = br.readLine()) != null) {
                String[] motorbikes = line.split(csvSplit);
                preparedStatement = con.prepareStatement("insert into motorbike values('"+motorbikes[0]+"' ,"+"'"+motorbikes[1]+"' ,"+"'"+motorbikes[3]+"' ,"+"'"+motorbikes[6]+"' ,"+"'"+motorbikes[5]+"');");
                System.out.println("Inserting: "+motorbikes[0]+ " "+ motorbikes[1]+" "+ motorbikes[3]+" "+ motorbikes[6]+" "+ motorbikes[5]);
                preparedStatement.execute();
            }
        }catch (FileNotFoundException e){
        }catch (IOException e) {
            e.printStackTrace();
        } finally {
            con.close();
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
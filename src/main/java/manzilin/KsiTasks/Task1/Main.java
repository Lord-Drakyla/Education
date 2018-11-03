package manzilin.KsiTasks.Task1;

import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection("jdbc:h2:mem:study",
                "Rinat", "");
             Statement statement = connection.createStatement()
        ) {

            statement.execute("CREATE TABLE Components(" +
//            {VC=74.9000,MM=39.9480,LIQDEN=1.3730,TB=87.3000,TC=150.8000,Formula="AR",
//                    TDEN=90.0000,Number=1.0000,PC=48.1000,DIPM=0.0000,ZC=0.2910,Name="АРГОН",
//                    OMEGA=-0.0040,TFP=83.8000},
//            {VC=0.0000,MM=117.1690,LIQDEN=1.3500,TB=285.7000,TC=452.0000,Formula="BCL3",
//                    TDEN=284.0000,Number=2.0000,PC=38.2000,DIPM=0.0000,ZC=0.0000,Name="БОРА ТРИХЛОРИД",
//                    OMEGA=0.1500,TFP=165.9000},
                    "id INTEGER, name VARCHAR, CriticalVolume DOUBLE, MolecularWeight DOUBLE, " +
                    "LIQDEN DOUBLE,  BoilerTemperature DOUBLE, CriticalTemperature DOUBLE," +
                    "Formula VARCHAR, TDEN DOUBLE, CriticalPressure DOUBLE, DIPM DOUBLE," +
                    "CriticalZ DOUBLE, OMEGA DOUBLE, NormalMeltingPoint DOUBLE)");
            statement.execute("INSERT INTO Components VALUES (" +
                    "0, 'АРГОН', 74.9000, 39.9480, 1.3730, 87.3000, 150.8000, 'AR', 90.0000," +
                    "48.1000, 0.0000, 0.2910, -0.0040, 83.8000 )");
            statement.execute("INSERT INTO Components VALUES (" +
                    "1, 'БОРА ТРИХЛОРИД', 0.0000 ,117.1690 ,1.3500 ,285.7000 ,452.0000, 'BCL3',284.0000," +
                    "38.2000, 0.0000, 0.0000, 0.1500, 165.9000 )");
//            statement.execute("INSERT INTO Components VALUES (" +
//                    ", '', , , , ,, '',," +
//                    ", , , ,  )");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM Components");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("name"));
            }
//            Syntax error in SQL statement "CREATE TALE[*]"; expected "OR, FORCE, VIEW, ALIAS, SEQUENCE, USER, TRIGGER, ROLE, SCHEMA, CONSTANT, DOMAIN, TYPE, DATATYPE, AGGREGATE, LINKED, MEMORY, CACHED, LOCAL, GLOBAL, TEMP, TEMPORARY, TABLE, SYNONYM, PRIMARY, UNIQUE, HASH, SPATIAL, INDEX"; SQL statement:
//            CREATE TALE [42001-197]
//            statement.execute("CREATE TALE");
            resultSet.close();
//            statement.close();
//            connection.close();
            System.out.println(connection.isClosed());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}

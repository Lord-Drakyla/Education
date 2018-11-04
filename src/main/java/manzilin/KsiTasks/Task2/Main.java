package manzilin.KsiTasks.Task2;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.*;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

/**
 * todo использовать Spring.data  - упрощение.
 */
public class Main {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        DataSource dataSource = context.getBean(DataSource.class);
        JdbcTemplate template = new JdbcTemplate(dataSource);
        template.execute("CREATE TABLE Components(" +
                "id INTEGER, name VARCHAR(100), CriticalVolume DOUBLE, MolecularWeight DOUBLE, " +
                "LIQDEN DOUBLE,  BoilerTemperature DOUBLE, CriticalTemperature DOUBLE," +
                "Formula VARCHAR(100), TDEN DOUBLE, CriticalPressure DOUBLE, DIPM DOUBLE," +
                "CriticalZ DOUBLE, OMEGA DOUBLE, NormalMeltingPoint DOUBLE)");
        template.execute((ConnectionCallback<Object>) con -> {
            System.out.println(con.getMetaData().getURL());
            System.out.println(con.getMetaData().getUserName());
            return null;
        });
        template.execute("INSERT INTO Components VALUES (" +
                "0, 'АРГОН', 74.9000, 39.9480, 1.3730, 87.3000, 150.8000, 'AR', 90.0000," +
                "48.1000, 0.0000, 0.2910, -0.0040, 83.8000 )");
        Boolean ok = template.execute((StatementCallback<Boolean>) stmt -> {
            stmt.execute("INSERT INTO Components VALUES (" +
                    "1, 'БОРА ТРИХЛОРИД', 0.0000 ,117.1690 ,1.3500 ,285.7000 ,452.0000, 'BCL3',284.0000," +
                    "38.2000, 0.0000, 0.0000, 0.1500, 165.9000 )");
            return Boolean.TRUE;
        });
//            template.execute("INSERT INTO Components VALUES (" +
//                    ", '', , , , ,, '',," +
//                    ", , , ,  )");

        template.execute((PreparedStatementCreator) con -> con.prepareStatement("INSERT INTO Components VALUES (" +
                        "?,?,?,?,?,?,?,?,?,?,?,?,?,?)"),
                (PreparedStatementCallback<Object>) ps -> {
                    ps.setInt(1, 2);
                    ps.setString(2, "БОРА ТРИФТОРИД");
                    ps.setDouble(3, 0.0000);
                    ps.setDouble(4, 67.8050);
                    ps.setDouble(5, 0.0000);
                    ps.setDouble(6, 173.3000);
                    ps.setDouble(7, 260.8000);
                    ps.setString(8, "BF3");
                    ps.setDouble(9, 0.0000);
                    ps.setDouble(10, 49.2000);
                    ps.setDouble(11, 0.0000);
                    ps.setDouble(12, 0.0000);
                    ps.setDouble(13, 0.4200);
                    ps.setDouble(14, 146.5000);
                    ps.execute();
                    return null;
                });
        NamedParameterJdbcTemplate namedTemplate = new NamedParameterJdbcTemplate(template);
        Map<String, Object> params = new HashMap<>();
        params.put("id", 3);
        params.put("name", "БРОМ");
        params.put("CriticalVolume", 127.0000);
        params.put("MolecularWeight", 159.8080);
        params.put("LIQDEN", 3.1190);
        params.put("BoilerTemperature", 331.9000);
        params.put("CriticalTemperature", 584.0000);
        params.put("Formula", "BR2");
        params.put("TDEN", 293.0000);
        params.put("CriticalPressure", 102.0000);
        params.put("DIPM", 0.2000);
        params.put("CriticalZ", 0.2700);
        params.put("OMEGA", 0.1320);
        params.put("NormalMeltingPoint", 266.0000);
        namedTemplate.update("INSERT INTO Components VALUES (:id, :name, :CriticalVolume, :MolecularWeight, :LIQDEN, " +
                ":BoilerTemperature, :CriticalTemperature, :Formula, :TDEN, :CriticalPressure,:DIPM, " +
                ":CriticalZ, :OMEGA, :NormalMeltingPoint)", params);
        System.out.println("ok = " + ok);
        template.query("SELECT * FROM Components", (RowCallbackHandler) rs -> {
            System.out.println(rs.getString("name"));
        });
        Integer count = template.queryForObject("SELECT COUNT (*) FROM Components", Integer.class);
        System.out.println("count - " + count);
        Map<String, Object> customerMap = template.queryForMap("SELECT * FROM Components WHERE id = 1");
        System.out.println(customerMap.get("name"));
    }
}

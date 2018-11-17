package manzilin.lesson.parking.impl;

import org.postgresql.ds.PGPoolingDataSource;
import manzilin.lesson.parking.dao.ContractDAO;

import javax.sql.DataSource;

public class ContractDAOImpl implements ContractDAO {
    public ContractDAOImpl(DatabaseImpl pool) {
    }
}

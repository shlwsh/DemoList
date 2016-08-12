package Demo.mysql;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by smq on 16/8/12.
 */
public class mysqlDaoTest {
    @Test
    public void selectnamelist() throws Exception {
        mysqlDao db = new mysqlDao();
        db.connSQL();
        db.selectnamelist();
    }

    @Test
    public void runSql() throws Exception {


    }

}
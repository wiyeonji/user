package hotel.myapp.persistence;

import java.sql.Connection;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {

	@Autowired // �ʿ��� ���� ��ü�� Ÿ�Կ� �ش��ϴ� ���� ã�� ������ ��
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;

	@Test
	public void testConnetion() {
		try(Connection con = dataSource.getConnection();
			SqlSession session = sqlSessionFactory.openSession();
			) {
			System.out.println("con=" + con);
			System.out.println("session" + session);
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}

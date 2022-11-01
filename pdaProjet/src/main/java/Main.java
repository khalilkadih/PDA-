import com.java.Dao.UserDao;
import com.java.Entitys.User;
public class Main {

	public static void main(String[] args) {
		UserDao userdao = new UserDao();
		User user = new User("taha","taha@gmail.com","taha2000",234234);
		userdao.insertEntity(user);
		System.out.print("affichage de user ");
		userdao.findEntity(1);
		
		
	}

}

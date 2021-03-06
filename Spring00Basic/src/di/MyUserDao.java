package di;

import java.util.HashMap;
import java.util.Map;

// My 회사에 UserDao 인터페이스를 전달해서 My 회사에서 각 메소드를 구현한 것
public class MyUserDao implements UserDao {
	
	Map<Integer, User> table = new HashMap<Integer, User>();

	@Override
	public void insert(User user) {
		table.put(user.getId(), user);
	}

	@Override
	public User select (int id) {
		return table.get(id);
	}

}

/**
 * 测试类
 * Created by qianzhihao on 2017/1/20.
 */
public class Test {
    public static void main(String[] args) {
        User user1 = new User("haha","111");
        User user2 = new User("jojo","666");
        Service service = new Service();
        service.addUser(user1);
        service.addUser(user2);
        service.showUsers();
    }
}

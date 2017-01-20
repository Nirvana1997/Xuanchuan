import java.util.ArrayList;

/**
 * 服务器类
 * Created by qianzhihao on 2017/1/20.
 */
public class Service {
    /**
     * 用户列表
     */
    private ArrayList<User> userList = new ArrayList<>();

    /**
     * 添加一个用户
     * @param user 用户信息
     */
    public void addUser(User user){
        userList.add(user);
    }

    /**
     * 打印所有用户
     */
    public void showUsers(){
        for(User user:userList){
            System.out.println(user.userInfo());
        }
    }
}

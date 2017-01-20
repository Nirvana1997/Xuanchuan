/**
 * 用户类
 * Created by qianzhihao on 2017/1/20.
 */
public class User {
    /**
     * 用户名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    /**
     * 返回用户信息
     * @return 用户信息
     */
    public String userInfo(){
        return (name+":"+password);
    }
}

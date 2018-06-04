package template;

/************************************************
 * <p>Copyright © by whxxykj</p>
 * <p>All right reserved.</p>
 * <p>Create Author: Willie</p>
 * <p> Create Date  : 2018/4/13</p>
 * <p>Last version : 1.0</p>
 * <p>Description  : </p>
 * <p>Last Update Date:</p>
 * <p>Change Log:</p>
 **************************************************/
public class NormalLogin {
    public boolean login(LoginModel lm) {
        UserModel userModel = this.findUserByUserId(lm.getUserId());
        if (userModel != null) {
            if (userModel.getUserId().equals(lm.getUserId()) && userModel.getPwd().equals(lm.getPwd())) {
                return true;
            }
        }
        return false;
    }

    private UserModel findUserByUserId(String userId) {
        UserModel um = new UserModel();
        um.setUserId(userId);
        um.setName("test");
        um.setPwd("test");
        um.setUuid("userId001");
        return um;
    }
}

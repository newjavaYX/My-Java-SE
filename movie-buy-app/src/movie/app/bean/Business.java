package movie.app.bean;

import java.util.List;
import java.util.Map;

public class Business extends User{
//    店铺名称
    private String shopName;
//    店铺地址
    private String address;

    public Business(String loginName, String userName, String passWord, char sex, String phone, double money, String shopName, String address) {
        super(loginName, userName, passWord, sex, phone, money);
        this.shopName = shopName;
        this.address = address;
    }

    public Business(String shopName, String address) {
        this.shopName = shopName;
        this.address = address;
    }
    public Business(){

    }



    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

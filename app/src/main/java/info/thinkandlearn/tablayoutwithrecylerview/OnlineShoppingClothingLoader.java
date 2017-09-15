package info.thinkandlearn.tablayoutwithrecylerview;


import java.util.ArrayList;

/**
 * Created by Admin on 04-09-2017.
 */

public class OnlineShoppingClothingLoader {
    private ArrayList<OnlineShoppingPojo> onlineShoppingPojos;

    private static OnlineShoppingClothingLoader instance = null;

    private OnlineShoppingClothingLoader() {

    }

    public static OnlineShoppingClothingLoader getInstance() {
        if(instance == null) {
            instance = new OnlineShoppingClothingLoader();
        }
        return instance;
    }

    public ArrayList getOnlineShoppingPojoList() {
        if(onlineShoppingPojos==null){
            onlineShoppingPojos = new ArrayList<OnlineShoppingPojo>();
        }
        return onlineShoppingPojos;
    }

    public void addOnlineShoppingPojoTogetOnlineShoppingPojoList(String id, String imageUrl, String title, String marketPrice, String discountPrice, String discountRate){
        if(onlineShoppingPojos==null){
            onlineShoppingPojos = new ArrayList<OnlineShoppingPojo>();
        }
        onlineShoppingPojos.add(new OnlineShoppingPojo(id, imageUrl, title,marketPrice, discountPrice, discountRate));
    }

    public void resetList() {
        onlineShoppingPojos = new ArrayList<OnlineShoppingPojo>();
    }
}

package info.thinkandlearn.tablayoutwithrecylerview;


import java.util.ArrayList;

/**
 * Created by Admin on 04-09-2017.
 */

public class OnlineShoppingGroceryLoader {
    private ArrayList<OnlineShoppingPojo> onlineShoppingPojos;

    private static OnlineShoppingGroceryLoader instance = null;

    private OnlineShoppingGroceryLoader() {

    }

    public static OnlineShoppingGroceryLoader getInstance() {
        if(instance == null) {
            instance = new OnlineShoppingGroceryLoader();
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

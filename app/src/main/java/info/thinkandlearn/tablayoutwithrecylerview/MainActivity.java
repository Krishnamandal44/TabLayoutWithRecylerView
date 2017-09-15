package info.thinkandlearn.tablayoutwithrecylerview;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class MainActivity extends AppCompatActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout)findViewById(R.id.tablayout);
        viewPager=(ViewPager)findViewById(R.id.viewpager);

        TabLayoutAdapter obj = new TabLayoutAdapter(getSupportFragmentManager());
        viewPager.setAdapter(obj);
        tabLayout.setupWithViewPager(viewPager);
        loadOnlineShoppingElectronicsFromServer();
        loadOnlineShoppingClothingFromServer();
        loadOnlineShoppingGroceryFromServer();

    }
    private void loadOnlineShoppingElectronicsFromServer() {
        OnlineShoppingElectronicsLoader onlineShoppingElectronicsLoader = OnlineShoppingElectronicsLoader.getInstance();
        onlineShoppingElectronicsLoader.resetList();
        IonConnector ionConnector = IonConnector.getInstance();
        try {
            JsonObject result = ionConnector.getJson(this,"https://api.myjson.com/bins/zlls1");
            JSONObject resultJSONAsString = new JSONObject(result.toString());
            if (resultJSONAsString.getString("result").equals("success")){
//                JSONArray navBarJSONArray = resultJSONAsString.getJSONArray("top_nav_bar");
                Gson gson = new Gson();
                ArrayList<JsonObject> onlineShoppingJsonObjects = gson.fromJson(result.get("electronics"),
                        new TypeToken<ArrayList<JsonObject>>(){}.getType());

                for (JsonObject onlineShoppingJsonObject: onlineShoppingJsonObjects) {
                    JSONObject onlineShoppingJSONObject = new JSONObject(onlineShoppingJsonObject.toString());
                    String id = onlineShoppingJSONObject.getString("id");
                    String imageUrl = onlineShoppingJSONObject.getString("image_url");
                    String title = onlineShoppingJSONObject.getString("title");
                    String marketPrice = onlineShoppingJSONObject.getString("market_price");
                    String discountPrice = onlineShoppingJSONObject.getString("discount_price");
                    String discountRate = onlineShoppingJSONObject.getString("discount_rate");
                    GlideConnector.getInstance().imageDownloadOnly(getApplicationContext(), imageUrl);
                    onlineShoppingElectronicsLoader.addOnlineShoppingPojoTogetOnlineShoppingPojoList(id, imageUrl, title,marketPrice, discountPrice, discountRate);
                }
            }
        } catch (ExecutionException | InterruptedException | JSONException e) {
            e.printStackTrace();
        }
    }
    private void loadOnlineShoppingClothingFromServer() {
        OnlineShoppingClothingLoader onlineShoppingClothingLoader = OnlineShoppingClothingLoader.getInstance();
        onlineShoppingClothingLoader.resetList();
        IonConnector ionConnector = IonConnector.getInstance();
        try {
            JsonObject result = ionConnector.getJson(this,"https://api.myjson.com/bins/6vjp5");
            JSONObject resultJSONAsString = new JSONObject(result.toString());
            if (resultJSONAsString.getString("result").equals("success")){
//                JSONArray navBarJSONArray = resultJSONAsString.getJSONArray("top_nav_bar");
                Gson gson = new Gson();
                ArrayList<JsonObject> onlineShoppingJsonObjects = gson.fromJson(result.get("clothing"),
                        new TypeToken<ArrayList<JsonObject>>(){}.getType());

                for (JsonObject onlineShoppingJsonObject: onlineShoppingJsonObjects) {
                    JSONObject onlineShoppingJSONObject = new JSONObject(onlineShoppingJsonObject.toString());
                    String id = onlineShoppingJSONObject.getString("id");
                    String imageUrl = onlineShoppingJSONObject.getString("image_url");
                    String title = onlineShoppingJSONObject.getString("title");
                    String marketPrice = onlineShoppingJSONObject.getString("market_price");
                    String discountPrice = onlineShoppingJSONObject.getString("discount_price");
                    String discountRate = onlineShoppingJSONObject.getString("discount_rate");
                    GlideConnector.getInstance().imageDownloadOnly(getApplicationContext(), imageUrl);
                    onlineShoppingClothingLoader.addOnlineShoppingPojoTogetOnlineShoppingPojoList(id, imageUrl, title,marketPrice, discountPrice, discountRate);
                }
            }
        } catch (ExecutionException | InterruptedException | JSONException e) {
            e.printStackTrace();
        }
    }
    private void loadOnlineShoppingGroceryFromServer() {
        OnlineShoppingGroceryLoader onlineShoppingGroceryLoader = OnlineShoppingGroceryLoader.getInstance();
        onlineShoppingGroceryLoader.resetList();
        IonConnector ionConnector = IonConnector.getInstance();
        try {
            JsonObject result = ionConnector.getJson(this,"https://api.myjson.com/bins/ty50d");
            JSONObject resultJSONAsString = new JSONObject(result.toString());
            if (resultJSONAsString.getString("result").equals("success")){
//                JSONArray navBarJSONArray = resultJSONAsString.getJSONArray("top_nav_bar");
                Gson gson = new Gson();
                ArrayList<JsonObject> onlineShoppingJsonObjects = gson.fromJson(result.get("grocery"),
                        new TypeToken<ArrayList<JsonObject>>(){}.getType());

                for (JsonObject onlineShoppingJsonObject: onlineShoppingJsonObjects) {
                    JSONObject onlineShoppingJSONObject = new JSONObject(onlineShoppingJsonObject.toString());
                    String id = onlineShoppingJSONObject.getString("id");
                    String imageUrl = onlineShoppingJSONObject.getString("image_url");
                    String title = onlineShoppingJSONObject.getString("title");
                    String marketPrice = onlineShoppingJSONObject.getString("market_price");
                    String discountPrice = onlineShoppingJSONObject.getString("discount_price");
                    String discountRate = onlineShoppingJSONObject.getString("discount_rate");
                    GlideConnector.getInstance().imageDownloadOnly(getApplicationContext(), imageUrl);
                    onlineShoppingGroceryLoader.addOnlineShoppingPojoTogetOnlineShoppingPojoList(id, imageUrl, title,marketPrice, discountPrice, discountRate);
                }
            }
        } catch (ExecutionException | InterruptedException | JSONException e) {
            e.printStackTrace();
        }
    }
}

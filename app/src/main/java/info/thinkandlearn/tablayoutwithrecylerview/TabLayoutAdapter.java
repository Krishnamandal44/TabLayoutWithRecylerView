package info.thinkandlearn.tablayoutwithrecylerview;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


/**
 * Created by pc31 on 24-08-2017.
 */

public class TabLayoutAdapter extends FragmentStatePagerAdapter {

//    private int[] images ={samsung, samsung, samsung,samsung,samsung,samsung,samsung,samsung};
//    private int[] images1 ={ic_home_service_color, ic_business_service_color, samsung};
//    private String[] names = {"LG 108cm (43) Full HD LED Smart TV","LG 108cm (43) Full HD LED Smart TV","LG 108cm (43) Full HD LED Smart TV","LG 108cm (43) Full HD LED Smart TV","LG 108cm (43) Full HD LED Smart TV","LG 108cm (43) Full HD LED Smart TV"};
//    private String[] names1 = {"Home service","business", "samsung"};

    public TabLayoutAdapter(FragmentManager fragmentManager) {
            super(fragmentManager);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    ElectronicsLoadFragment electronicsLoadFragment = new ElectronicsLoadFragment();
                    //electronicsLoadFragment.addItems(images, names);
                    return electronicsLoadFragment;
                case 1:
                    ClothingLoadFragment clothingLoadFragment = new ClothingLoadFragment();
                    //onlineShopLoadFragment1.addItems(images1, names1);
                    return clothingLoadFragment;
                case 2:
                    GroceryLoadFragment groceryLoadFragment = new GroceryLoadFragment();
                    //onlineShopLoadFragment1.addItems(images1, names1);
                    return groceryLoadFragment;
                default:
                    return null;
            }
        }
        @Override
        public int getCount() {
            return 3;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "Electronics";
                case 1:
                    return "Clothing";
                case 2:
                    return "Grocery";
                default:
                    return null;
            }

        }
}

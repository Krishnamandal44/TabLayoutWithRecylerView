package info.thinkandlearn.tablayoutwithrecylerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class ClothingLoadFragment extends Fragment {
    private OnlineShoppingPojo onlineShoppingPojo;
    private List<OnlineShoppingPojo> onlineShoppingPojos = new ArrayList<>();
//    private int[] images;
//    private String[] names;
//    public void addItems(int[] images, String[] names){
//        this.images = images;
//        this.names = names;
//    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.fragment_online_shop_load,container,false);
        addServiceRecyclerView(view);
        return view;
    }


    private void addServiceRecyclerView(View view ){
        LinearLayoutManager layoutManager= new GridLayoutManager(getActivity(),2);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_g);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(layoutManager);


//        String[] blackIcons = getResources().getStringArray(R.array.service_category);
//        int blackIconsArrayLength = names.length;
//        for (int i = 0; i<blackIconsArrayLength; i++){
//            topRecyclerPojo = new TopRecyclerPojo(""+i, names[i], images[i]);
//            topRecyclerPojoList.add(topRecyclerPojo);
//        }
        final ArrayList<OnlineShoppingPojo> onlineShoppingPojos = OnlineShoppingClothingLoader.getInstance().getOnlineShoppingPojoList();
        OnlineShoppingRecyclerAdapter adapter = new OnlineShoppingRecyclerAdapter(onlineShoppingPojos, R.layout.online_shopping_child_view, getActivity());
        recyclerView.setAdapter(adapter);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(getActivity(), recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {
//                        if (position == 0){
//                            Intent acServiceIntent = new Intent(getActivity(), OnlineShoppingProductDetailsVolley.class);
//                            acServiceIntent.putExtra("ProductId",onlineShoppingPojos.get(position).getId());
//                            acServiceIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                            startActivity(acServiceIntent);
                            //onClickProductDetails(view);
                       // }
//                        if (position == 6){
//                            onClickOnlineShoppingBtn(view);
//                        }
                    }

                    @Override
                    public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
    } //////////////////////////**********onClickHomeSerViceBtn*****///////////////////////////////////////


}

package info.thinkandlearn.tablayoutwithrecylerview;

import android.content.Context;
import android.graphics.Paint;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Admin on 29-07-2017.
 */

public class OnlineShoppingRecyclerAdapter extends RecyclerView.Adapter<OnlineShoppingRecyclerAdapter.ViewHolder>{

    private List<OnlineShoppingPojo> onlineShoppingPojos;
    private Context context;
    private int child;

    public OnlineShoppingRecyclerAdapter(List<OnlineShoppingPojo> itemList, Context context) {
        this.onlineShoppingPojos = itemList;
        this.context = context;
    }

    public OnlineShoppingRecyclerAdapter(List<OnlineShoppingPojo> itemList, int child, Context context) {
        this.onlineShoppingPojos = itemList;
        this.context = context;
        this.child = child;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(child,parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {
        OnlineShoppingPojo onlineShoppingPojo = onlineShoppingPojos.get(position);
        holder.productName.setText(onlineShoppingPojo.getTitle());
        holder.marketPrice.setText(onlineShoppingPojo.getMarketPrice());
        holder.discountPrice.setText(onlineShoppingPojo.getDiscountPrice());
        holder.discounRate.setText(onlineShoppingPojo.getDiscountRate());
        GlideConnector.getInstance().loadImageDirectly(context, onlineShoppingPojo.getImageUrl(), holder.productImage);
    }

    @Override
    public int getItemCount() {
        return onlineShoppingPojos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView productName;
        TextView marketPrice;
        TextView discountPrice;
        TextView discounRate;
        ImageView productImage;
        LinearLayout view;

        public ViewHolder(View itemView) {
            super(itemView);
            productImage = (ImageView) itemView.findViewById(R.id.product_image);
            productName = (TextView) itemView.findViewById(R.id.product_name);
            marketPrice = (TextView) itemView.findViewById(R.id.market_price);
            discountPrice = (TextView) itemView.findViewById(R.id.discount_price);
            discounRate = (TextView) itemView.findViewById(R.id.discount_rate);
            marketPrice.setText(R.string.strike_25000_strike);
            marketPrice.setPaintFlags(marketPrice.getPaintFlags() | Paint.STRIKE_THRU_TEXT_FLAG);
            view = (LinearLayout) itemView;
        }
    }
}

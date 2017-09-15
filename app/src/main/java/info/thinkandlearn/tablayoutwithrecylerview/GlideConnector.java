package info.thinkandlearn.tablayoutwithrecylerview;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

/**
 * Created by Admin on 05-09-2017.
 */

public class GlideConnector {

    private static GlideConnector instance = null;

    private GlideConnector() {

    }

    public static GlideConnector getInstance() {
        if(instance == null) {
            instance = new GlideConnector();
        }
        return instance;
    }


    //create the progressDialog object
    public ProgressDialog createProgressDialog(Context context){
        final ProgressDialog dlg = new ProgressDialog(context);
        dlg.setTitle("Loading...");
        dlg.setIndeterminate(false);                            //indeterminate= circular progress
        dlg.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
        return dlg;
    }


    // directly load image in the ImageView
    public void loadImageDirectly(Context context, String imageURL, ImageView imageView, int placeholder, int error) {
        Glide.with(context)
                .load(imageURL)
                .thumbnail(0.5f)
                .placeholder(placeholder)
                .error(error)
                .crossFade()
                .into(imageView);
    }

    // directly load image in the ImageView
    public void loadImageDirectly(Context context, String imageURL, ImageView imageView, int placeholder) {
        Glide.with(context)
                .load(imageURL)
                .thumbnail(0.5f)
                .placeholder(placeholder)
                .crossFade()
                .into(imageView);
    }

    // directly load image in the ImageView
    public void loadImageDirectly(Context context, String imageURL, ImageView imageView) {
        Glide.with(context)
                .load(imageURL)
                .thumbnail(0.1f)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .placeholder(R.drawable.icon_placeholder)
                .crossFade()
                .into(imageView);
    }

    // directly load image in the ImageView
    public void imageDownloadOnly(Context context, String imageURL) {
        Glide.with(context)
                .load(imageURL)
                .thumbnail(0.1f)
                .preload();
    }
}

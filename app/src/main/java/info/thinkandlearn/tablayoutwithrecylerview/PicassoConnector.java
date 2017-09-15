package info.thinkandlearn.tablayoutwithrecylerview;

import android.app.ProgressDialog;
import android.content.Context;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

/**
 * Created by Admin on 05-09-2017.
 */

public class PicassoConnector {

    private static PicassoConnector instance = null;

    private PicassoConnector() {

    }

    public static PicassoConnector getInstance() {
        if(instance == null) {
            instance = new PicassoConnector();
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
        Picasso.with(context)
                .load(imageURL)
                .placeholder(placeholder)
                .error(error)
//                .resize(95, 95)
                .into(imageView);
    }

    // directly load image in the ImageView
    public void loadImageDirectly(Context context, String imageURL, ImageView imageView, int placeholder) {
        Picasso.with(context)
                .load(imageURL)
                .placeholder(placeholder)
//                .error(error)
//                .resize(95, 95)
                .into(imageView);
    }

    // directly load image in the ImageView
    public void loadImageDirectly(Context context, String imageURL, ImageView imageView) {
        Picasso.with(context)
                .load(imageURL)
//                .placeholder(placeholder)
//                .error(error)
//                .resize(95, 95)
                .into(imageView);
    }
}

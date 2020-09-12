package chao.sample.spa.thirdparty.qiyu;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import chao.sample.spa.thirdparty.R;
import com.qiyukf.unicorn.api.UnicornGifImageLoader;

import java.io.Serializable;

public class GlideGifImageLoader implements UnicornGifImageLoader, Serializable {

    Context context;

    public GlideGifImageLoader(Context context) {
        this.context = context.getApplicationContext();
    }


    @Override
    public void loadGifImage(String url, ImageView imageView, String imgName) {
        if (url == null || imgName == null) {
            return;
        }
        Glide.with(context).load(url).error(R.drawable.nim_default_img_failed).into(imageView);
    }
}
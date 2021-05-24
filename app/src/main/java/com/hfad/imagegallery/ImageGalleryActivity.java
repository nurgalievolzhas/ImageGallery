package com.hfad.imagegallery;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class ImageGalleryActivity extends SingleFragmentActivity {

    public static Intent newIntent(Context context){
        return new Intent(context,ImageGalleryActivity.class);
    }

    @Override
    protected Fragment createFragment() {
        return ImageGalleryFragment.newInstance();
    }

}

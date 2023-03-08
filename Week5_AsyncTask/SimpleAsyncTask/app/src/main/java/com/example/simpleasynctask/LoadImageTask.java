package com.example.simpleasynctask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.widget.ImageView;

import java.util.Random;

public class LoadImageTask extends AsyncTask<Void, Void, Bitmap> {

    private Context mContext;
    private ImageView mImageView;
    private int[] mImageResources;

    public LoadImageTask(Context context, ImageView imageView, int[] imageResources) {
        mContext = context;
        mImageView = imageView;
        mImageResources = imageResources;
    }

    @Override
    protected Bitmap doInBackground(Void... params) {
        int index = new Random().nextInt(mImageResources.length);
        Bitmap bitmap = BitmapFactory.decodeResource(mContext.getResources(), mImageResources[index]);

        // Calculate the new dimensions for the bitmap
        float scale = mContext.getResources().getDisplayMetrics().density;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int newWidth = (int) (width / scale);
        int newHeight = (int) (height / scale);
        return bitmap;
    }

    @Override
    protected void onPostExecute(Bitmap bitmap) {
        mImageView.setImageBitmap(bitmap);
    }
}


package com.test.loadImage;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;

public class LoadImages extends Activity implements AsyncImageLoader.AsyncImageCallback {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void loadImage() {
		new AsyncImageLoader("http://somewhere.net/foo.png", this);
	}

	@Override
	public void onImageReceived(String url, Bitmap bm) {
		if (bm == null) {
			System.err.println("Could not load picture '" + url + "'!");
		} else if ("http://somewhere.net/foo.png".equals(url)) {
			// paintFoo(bm);
		}
	}
}

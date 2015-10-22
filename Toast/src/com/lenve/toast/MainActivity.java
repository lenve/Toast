package com.lenve.toast;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

	private Toast toast;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	public void onClick(View v) {
		switch (v.getId()) {
		case R.id.btn1:
			ToastUtil.showTextLong(this, "111");
			break;
		case R.id.btn2:
			ToastUtil.showTextLong(this, "222");
			break;
		case R.id.btn3:
			Toast.makeText(this, "333", Toast.LENGTH_LONG).show();
		case R.id.btn4:
			Toast.makeText(this, "444", Toast.LENGTH_LONG).show();
			break;
		default:
			break;
		}
	}

	@Override
	public void onBackPressed() {
		super.onBackPressed();
		ToastUtil.cancelToast();
		toast.cancel();
	}
}

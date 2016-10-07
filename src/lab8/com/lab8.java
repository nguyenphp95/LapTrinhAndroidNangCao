package lab8.com;

import java.util.Random;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import manhinhdieukhien.com.R;

public class lab8 extends Activity implements OnClickListener {
	Button btnTao,btnDong;
	int notiId;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab8);
		btnTao = (Button) findViewById(R.id.btnTao);
		btnDong = (Button) findViewById(R.id.btnDong);
		
		btnTao.setOnClickListener(this);
		btnDong.setOnClickListener(this);
			
	}
	@Override
	public void onClick(View v) {
		if (v==btnTao) {
			TaoNotification();
		}
		if (v==btnDong) {
			DongNotification();
		}
		
	}
	private void DongNotification() {
		NotificationManager notiMa = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		//notiMa.cancel(notiId);
		notiMa.cancelAll();
	}
	private void TaoNotification() {
		//Tạo mã Random
		notiId = HamTaoMa();
		//Bước 1 : Tạo Builder
		Notification.Builder noti = new Notification.Builder(this);
		noti.setSmallIcon(R.drawable.ic_launcher);
		noti.setContentTitle("Có thông báo mới " +notiId);
		noti.setContentText("Nhấn để cập nhật version");
		//Bước 2: Tạo Pending Intent
		Intent intent = new Intent(this,lab8_update.class);
		intent.putExtra("requestCode", notiId);
		PendingIntent pendingintent = PendingIntent.getActivity(this, notiId, intent, PendingIntent.FLAG_UPDATE_CURRENT);
		//Bước 3: Gán các thành phần cho Builder:
		noti.setContentIntent(pendingintent);
		
		Uri uri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
		noti.setSound(uri);
		
		//Bước 4: Kích hoạt Notification thông qua Notification Manager:
		
		NotificationManager notiMa = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notiMa.notify(notiId,noti.build());
		
	}
	private int HamTaoMa() {
		Random random = new Random();
		int ma = random.nextInt();
		return ma;
	}
}

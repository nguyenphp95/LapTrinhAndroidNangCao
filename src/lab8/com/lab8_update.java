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
import android.widget.TextView;
import manhinhdieukhien.com.R;

public class lab8_update extends Activity {
	TextView txtThongBao;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab8_update);
		txtThongBao = (TextView) findViewById(R.id.txtThongBao);
		//Nhận code từ trang MainActivity để thực hiện đóng đúng thông báo vừa click
		int requestCode = getIntent().getExtras().getInt("requestCode");
		//Hàm đóng thông báo
		DongNotification(requestCode);
		// Gán giá trị ra ngoài màn hình
		txtThongBao.setText("Đã đóng thông báo số: " + requestCode+ "\n Có thể dùng id này để hiển thị chi tiết tin nào đó");
	}
	private void DongNotification(int notiId) {
		NotificationManager notiMa = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
		notiMa.cancel(notiId);
	}
	
	

}

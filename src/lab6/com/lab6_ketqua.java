package lab6.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import manhinhdieukhien.com.R;

public class lab6_ketqua extends Activity implements OnClickListener {
	TextView txtHoTen,txtCongTac,txtHocTap,txtHonNhan,txtDiaChi,txtSDT;
	Button btnQuayVe;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6_ketqua);
		
		txtHoTen = (TextView) findViewById(R.id.txtHoTen);
		txtCongTac = (TextView) findViewById(R.id.txtCongTac);
		txtHocTap = (TextView) findViewById(R.id.txtHocTap);
		txtHonNhan = (TextView) findViewById(R.id.txtHonNhan);
		txtDiaChi = (TextView) findViewById(R.id.txtDiaChi);
		txtSDT = (TextView) findViewById(R.id.txtSDT);
		
		
		btnQuayVe = (Button) findViewById(R.id.btnQuayVe);
		
		
		btnQuayVe.setOnClickListener(this);
		
		
		String gtnhan = getIntent().getExtras().getString("hotennguoidk");
		txtHoTen.setText(gtnhan);	
		
		String gtnhan1 = getIntent().getExtras().getString("noicongtac");
		txtCongTac.setText(gtnhan1);
		
		String gtnhan2 = getIntent().getExtras().getString("noihoctap");
		txtHocTap.setText(gtnhan2);
		
		String gtnhan3 = getIntent().getExtras().getString("tinhtranghonnhan");
		txtHonNhan.setText(gtnhan3);
		
		String gtnhan4 = getIntent().getExtras().getString("diachiht");
		txtDiaChi.setText(gtnhan4);
		
		String gtnhan5 = getIntent().getExtras().getString("sodienthoai");
		txtSDT.setText(gtnhan5);
		
		
	}
	@Override
	public void onClick(View v) {
		if(v==btnQuayVe){
			Intent intent = new Intent(this,lab6.class);
			startActivity(intent);
		}
		
	}

}

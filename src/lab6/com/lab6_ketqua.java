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
	TextView txtRelease;
	Button btnBack;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6_ketqua);
		
		txtRelease = (TextView) findViewById(R.id.txtRelease);
		btnBack = (Button) findViewById(R.id.btnBack);
		
		btnBack.setOnClickListener(this);
		
		
		String gtnhan = getIntent().getExtras().getString("hoten");
		txtRelease.setText(gtnhan);				
	}
	@Override
	public void onClick(View v) {
		if(v==btnBack){
			Intent intent = new Intent(this,lab6.class);
			startActivity(intent);
		}
		
	}

}

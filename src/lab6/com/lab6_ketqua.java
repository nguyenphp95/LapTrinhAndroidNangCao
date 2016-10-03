package lab6.com;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;
import manhinhdieukhien.com.R;

public class lab6_ketqua extends Activity {
	TextView txtRelease;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6_ketqua);
		
		txtRelease = (TextView) findViewById(R.id.txtRelease);
		
		String gtnhan = getIntent().getExtras().getString("hoten");
		txtRelease.setText(gtnhan);				
	}

}

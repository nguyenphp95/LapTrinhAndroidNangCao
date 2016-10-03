package lab6.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import manhinhdieukhien.com.R;

public class lab6 extends Activity implements OnClickListener{
	Button btnSend;
	EditText edtInput;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6);
		
		btnSend = (Button) findViewById(R.id.btnSend);
		edtInput = (EditText) findViewById(R.id.edtInput);
		
		btnSend.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		if (v==btnSend) {
			String hoten;
			hoten = edtInput.getText().toString();
			Intent intent = new Intent(getApplicationContext(),lab6_ketqua.class);
			intent.putExtra("hoten", hoten); //Chuyển gói có tên là hoten
			startActivity(intent);
		}
		
	}
}

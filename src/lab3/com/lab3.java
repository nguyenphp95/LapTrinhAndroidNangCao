package lab3.com;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import manhinhdieukhien.com.R;
import quantri.com.quantri;

public class lab3 extends Activity implements OnClickListener{
	Button btnLogin;
	TextView txtReg,txtPass;
	//Tao Broadcast Reciever
	BroadcastReceiver Receiver = new BroadcastReceiver() {
		
		@Override
		public void onReceive(Context context, Intent intent) {
			// Lay wifi
			ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(context.CONNECTIVITY_SERVICE);			
			if(connectivityManager.getActiveNetworkInfo() !=null){
				btnLogin.setEnabled(true);
				Toast.makeText(getBaseContext(),"Wifi True", Toast.LENGTH_LONG).show();
			}else{
				btnLogin.setEnabled(false);
				Toast.makeText(getBaseContext(), "Wifi false", Toast.LENGTH_LONG).show();
			}
		}
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab3);
		btnLogin = (Button) findViewById(R.id.btnLogin);
		txtReg = (TextView) findViewById(R.id.txtReg);
		txtPass = (TextView) findViewById(R.id.txtPass);
		
		btnLogin.setOnClickListener(this);
		
		
		
	}

	@Override
	public void onClick(View v) {
		if (v==btnLogin) {
			String user = txtReg.getText().toString();
			String pass = txtPass.getText().toString();
			if (user.equalsIgnoreCase("admin") && pass.equalsIgnoreCase("admin")) {
				Intent intent = new Intent(getApplicationContext(),quantri.class);
				startActivity(intent);				
			}
		}
		
	}
}

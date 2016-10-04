package lab7.com;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import manhinhdieukhien.com.R;


public class lab7 extends Activity implements OnClickListener{
	
	Button btnKetQua;
	EditText edtSoa,edtSob,edtSoc;
	TextView txtResult;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab7);
		
		btnKetQua = (Button) findViewById(R.id.btnKetQua);
		edtSoa = (EditText) findViewById(R.id.edtSoa);
		edtSob = (EditText) findViewById(R.id.edtSob);
		edtSoc = (EditText) findViewById(R.id.edtSoc);
		txtResult = (TextView) findViewById(R.id.txtResult);
		

		
		btnKetQua.setOnClickListener(this);
		
		


		
		
		
	}
	@Override
	public void onClick(View v) {
		if (v==btnKetQua) {
			double delta,a,b,c,x1,x2,x;
			a=Double.parseDouble(edtSoa.getText().toString());
			b=Double.parseDouble(edtSob.getText().toString());
			c=Double.parseDouble(edtSoc.getText().toString());
			delta=(b*b) -(4*a*c);			
			x1 =((-b - Math.sqrt(delta))/(2*a));
			x2 =((-b + Math.sqrt(delta))/(2*a));
			x=(-b/(2*a));
			if(delta>0){
				txtResult.setText("PT co 2 nghiem X1:"+ x1 +"va X2:" +x2);	
			}if(delta<0){
				txtResult.setText("PT vo nghiem");
			}if(delta==0){
				txtResult.setText("PT co nghiem kep X" + x);
			}
		}
		
	}
}

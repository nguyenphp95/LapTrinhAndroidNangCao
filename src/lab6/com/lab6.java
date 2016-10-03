package lab6.com;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import manhinhdieukhien.com.R;

public class lab6 extends Activity implements OnClickListener{
	Button btnGui;
	EditText edtHoTen,edtCongTac,edtHocTap,edtHonNhan,edtDiaChi,edtSDT;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab6);
		
		btnGui = (Button) findViewById(R.id.btnGui);
		edtHoTen = (EditText) findViewById(R.id.edtHoTen);
		edtCongTac = (EditText) findViewById(R.id.edtCongTac);
		edtHocTap = (EditText) findViewById(R.id.edtHocTap);
		edtHonNhan = (EditText) findViewById(R.id.edtHonNhan);
		edtDiaChi = (EditText) findViewById(R.id.edtDiaChi);
		edtSDT = (EditText) findViewById(R.id.edtSDT);
		
		
		btnGui.setOnClickListener(this);
		
	}
	@Override
	public void onClick(View v) {
		if (v==btnGui) {
			String hoten = edtHoTen.getText().toString();
			String congtac = edtCongTac.getText().toString();
			String hoctap = edtHocTap.getText().toString();
			String honnhan = edtHonNhan.getText().toString();
			String diachi = edtDiaChi.getText().toString();
			String sdt = edtSDT.getText().toString();
			
			Intent intent = new Intent(getApplicationContext(),lab6_ketqua.class);
			
			intent.putExtra("hotennguoidk", hoten); //Chuyển gói(package) có tên là "hotennguoidk"
			intent.putExtra("noicongtac", congtac);	
			intent.putExtra("noihoctap", hoctap);
			intent.putExtra("tinhtranghonnhan", honnhan);	
			intent.putExtra("diachiht", diachi);	
			intent.putExtra("sodienthoai", sdt);	

			

			
			startActivity(intent);
		}
		
	}
}

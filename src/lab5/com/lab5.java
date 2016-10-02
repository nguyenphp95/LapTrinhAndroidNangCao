package lab5.com;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
import lab5.com_adpater.DanhBaAdapter;
import lab5.com_model.DanhBa;
import manhinhdieukhien.com.MainActivity;
import manhinhdieukhien.com.R;

public class lab5 extends Activity {
	ListView lvDanhBa;
	ArrayList<DanhBa> danhsachDanhBa;
	DanhBaAdapter danhbaadapter;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_lab5);
		
		lvDanhBa = (ListView) findViewById(R.id.listDanhBa);
		danhsachDanhBa=new ArrayList<DanhBa>();
		danhsachDanhBa.add(new DanhBa(1, "Hoang" , "88888"));
		danhsachDanhBa.add(new DanhBa(2, "Quoc" , "77777"));
		danhsachDanhBa.add(new DanhBa(3, "Tuan" , "66666"));
		danhsachDanhBa.add(new DanhBa(4, "Nam" , "555555"));
		danhbaadapter = new DanhBaAdapter(lab5.this, R.layout.activity_lab5_item_new, danhsachDanhBa);
		
		lvDanhBa.setAdapter(danhbaadapter);
		
	}
}

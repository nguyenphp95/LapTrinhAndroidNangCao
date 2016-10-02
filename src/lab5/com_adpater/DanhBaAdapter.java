package lab5.com_adpater;

import java.util.List;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import lab5.com_model.DanhBa;
import manhinhdieukhien.com.R;

//Lớp này kế thừa từ ArrayAdapter và chỉnh sửa lại View
public class DanhBaAdapter extends ArrayAdapter<DanhBa>{
	Activity context;
	int resource;
	List<DanhBa> objects;
	public DanhBaAdapter(Activity context, int resource, List<DanhBa> objects) {
		super(context, resource, objects);	
		this.context = context;
		this.resource = resource;
		this.objects = objects;
	}
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// LayoutInflater là một lớp dùng để Build cái layout bình thường (item_new.xml) trở thành 1 cái code java
			LayoutInflater inflater= this.context.getLayoutInflater();
			View row=inflater.inflate(this.resource, null); // this=item_new.xml
			//Muốn lấy các thành phần giao diện thì cần làm như sau
			TextView txtTen=(TextView) row.findViewById(R.id.txtTenDanhBa);
			TextView txtPhone=(TextView) row.findViewById(R.id.txtSdt);
			ImageButton btnCall = (ImageButton) row.findViewById(R.id.btnCall);
			ImageButton btnSMS = (ImageButton) row.findViewById(R.id.btnSMS);
			ImageButton btnDetail = (ImageButton) row.findViewById(R.id.btnDetail);
			
			// Làm sao để vẽ dựa vào positon(Số lần lặp)
			//Trả về danh bạ muốn vẽ
			
			DanhBa danhba = this.objects.get(position);
			txtTen.setText(danhba.getTen());
			txtPhone.setText(danhba.getPhone());
			return row;
			
			
	}
	



}

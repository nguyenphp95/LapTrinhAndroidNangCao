package lab4.com;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;
import manhinhdieukhien.com.R;

public class lab4 extends Activity {
	 final CharSequence myList[] = { "Tea", "Coffee", "Milk" };
	 RelativeLayout rl;
 @Override
 protected void onCreate(Bundle savedInstanceState) {
	  super.onCreate(savedInstanceState);
	  setContentView(R.layout.activity_lab4);
	  
	  rl = (RelativeLayout) findViewById(R.id.myRL);
	  final Button btn = (Button) findViewById(R.id.btnDialog);
	  
	  final AlertDialog.Builder ad = new AlertDialog.Builder(this);
	  ad.setTitle("What do you Like ?");
	  ad.setSingleChoiceItems(myList, -1,  new DialogInterface.OnClickListener() {
	
	   @Override
	   public void onClick(DialogInterface arg0, int arg1) {
		    Toast.makeText(getApplicationContext(),"You Choose : " + myList[arg1],Toast.LENGTH_LONG).show();		      
	   }
	  });
	  ad.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {	
		   @Override
		   public void onClick(DialogInterface dialog, int which) {
			    Toast.makeText(getApplicationContext(),
			      "You Have Cancel the Dialog box", Toast.LENGTH_LONG)
			      .show();
		   }
	  });
	
	  btn.setOnClickListener(new OnClickListener() {
	
	   @Override
	   public void onClick(View arg0) {
		   ad.show();
	   }
	  });

 }

 @Override
 public boolean onCreateOptionsMenu(Menu menu) {
	  getMenuInflater().inflate(R.menu.main, menu);
	  return true;
 }

}
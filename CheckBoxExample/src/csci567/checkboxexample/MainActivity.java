package csci567.checkboxexample;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		CheckBox checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
		CheckBox checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
		checkBox1.setOnClickListener(this);
		checkBox2.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	public void onCheckboxClicked(View view) {
	    // Is the view now checked?
	    boolean checked = ((CheckBox) view).isChecked();
	    // Check which checkbox was clicked
	    switch(view.getId()) {
		    case R.id.checkBox1:
	            if (checked){
	            	TextView txt = (TextView) findViewById(R.id.textView1);
	            	//Replace the text in the textView with the following text.      
	            	txt.setText("Check Box 1 Checked");
	            	Toast.makeText(this, "Check Box 1 Checked", Toast.LENGTH_LONG).show();
	            }                
	            else{
	            	TextView txt = (TextView) findViewById(R.id.textView1);
	            	//Replace the text in the textView with the following text.      
	            	txt.setText("Check Box 1 Unchecked");
	            	Toast.makeText(this, "Check Box 1 Unchecked", Toast.LENGTH_LONG).show();
	            }
	            break;
		    case R.id.checkBox2:
	            if (checked){
	            	TextView txt = (TextView) findViewById(R.id.textView1);
	            	//Replace the text in the textView with the following text.      
	            	txt.setText("Check Box 2 Checked");
	            	Toast.makeText(this, "Check Box 2 Checked", Toast.LENGTH_LONG).show();
	            }                
	            else{
	            	TextView txt = (TextView) findViewById(R.id.textView1);
	            	//Replace the text in the textView with the following text.      
	            	txt.setText("Check Box 2 Unchecked");
	            	Toast.makeText(this, "Check Box 2 Unchecked", Toast.LENGTH_LONG).show();
	            }
	            break;
	          
	    }
	}


	@Override
	public void onClick(View view) {
		switch(view.getId()) {
	    	case R.id.checkBox1:
	    		//Fall through into checkBox2
	    	case R.id.checkBox2:
	    		onCheckboxClicked(view);
	    		break;
		}
		
	}

}

package com.materialdesign.dialogs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private Toolbar toolbar;
	private Button btnAlert;
	private AlertDialog alertDialog;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toolbar = (Toolbar) findViewById(R.id.toolbar_personal);
		setSupportActionBar(toolbar);

		AlertDialog.Builder builder = new AlertDialog.Builder(this);
		builder.setTitle("Confirmation");
		builder.setMessage("Showing Confirmation Alert Dialog");
		builder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialogInterface, int i) {
				Toast.makeText(MainActivity.this, "You has selected Yes option", Toast.LENGTH_SHORT).show();
			}
		});
		builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface dialogInterface, int i) {
				Toast.makeText(MainActivity.this, "You has selected No option", Toast.LENGTH_SHORT).show();
			}
		});
		alertDialog = builder.create();

		btnAlert = findViewById(R.id.btnAlert);
		btnAlert.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				alertDialog.show();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		//return super.onCreateOptionsMenu(menu);

		getMenuInflater().inflate(R.menu.menu, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(@NonNull MenuItem item) {
		switch (item.getItemId()) {
			case R.id.cart_menu: {
				Toast.makeText(this, "Cart menu action, selected", Toast.LENGTH_SHORT).show();
				break;
			}
			case R.id.search_menu: {
				Toast.makeText(this, "Search menu action, selected", Toast.LENGTH_SHORT).show();
				break;
			}
			case R.id.profile_menu: {
				Toast.makeText(this, "Profile menu action, selected", Toast.LENGTH_SHORT).show();
				break;
			}
			case R.id.settings_menu: {
				Toast.makeText(this, "Settings menu action, selected", Toast.LENGTH_SHORT).show();
				break;
			}
			case R.id.about_menu: {
				Toast.makeText(this, "About menu action, selected", Toast.LENGTH_SHORT).show();
				break;
			}
		}
		return super.onOptionsItemSelected(item);
	}
}
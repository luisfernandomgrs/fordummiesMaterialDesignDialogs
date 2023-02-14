package com.materialdesign.dialogs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

	private Toolbar toolbar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		toolbar = (Toolbar) findViewById(R.id.toolbar_personal);
		setSupportActionBar(toolbar);
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
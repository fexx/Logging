package com.usando.logging;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.widget.TextView;

public class LoggingActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_logging);
		
		TextView text = new TextView(getApplicationContext());
		text.setText("Emitindo mensagens de Log com o LogCat."
				+ " Veja na View LogCat as mensagens de Log emitidas por esta Activity.");
		
		Log.i("Trabalhando com Logs", "Mensagem de informação");
		Log.w("Trabalhando com Logs", "Mensagem de aviso");
		Log.e("Trabalhando com Logs", "Mensagem de erro");
		Log.d("Trabalhando com Logs", "Mensagem de depuração");
		Log.v("Trabalhando com Logs", "Mensagem de depuração detalhada");
		
		setContentView(text);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.logging, menu);
		return true;
	}

}

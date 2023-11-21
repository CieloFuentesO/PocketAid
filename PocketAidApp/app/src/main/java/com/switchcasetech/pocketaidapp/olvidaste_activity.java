package com.switchcasetech.pocketaidapp;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;

public class olvidaste_activity extends Activity {

	
	private View _bg__olvidaste;
	private View _bg__tituloolvidaste_ek1;
	private TextView preguntaolvidaste;
	private TextView textoolvidaste;
	private View _bg___botonrecuperar_ek1;
	private View fondorecuperar;
	private TextView textorecuperar;
	private TextView volver;
	private View _bg__correoelectronico_ek1;
	private View fondocorreo;
	private TextView titulotexto;
	private TextView correotexto;
	private View _bg__email_ek1;
	private ImageView cuadradocarta;
	private ImageView carta;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.olvidaste);

		
		_bg__olvidaste = (View) findViewById(R.id._bg__olvidaste);
		_bg__tituloolvidaste_ek1 = (View) findViewById(R.id._bg__tituloolvidaste_ek1);
		preguntaolvidaste = (TextView) findViewById(R.id.preguntaolvidaste);
		textoolvidaste = (TextView) findViewById(R.id.textoolvidaste);
		_bg___botonrecuperar_ek1 = (View) findViewById(R.id._bg___botonrecuperar_ek1);
		fondorecuperar = (View) findViewById(R.id.fondorecuperar);
		textorecuperar = (TextView) findViewById(R.id.textorecuperar);
		volver = (TextView) findViewById(R.id.volver);
		_bg__correoelectronico_ek1 = (View) findViewById(R.id._bg__correoelectronico_ek1);
		fondocorreo = (View) findViewById(R.id.fondocorreo);
		titulotexto = (TextView) findViewById(R.id.titulotexto);
		correotexto = (TextView) findViewById(R.id.correotexto);
		_bg__email_ek1 = (View) findViewById(R.id._bg__email_ek1);
		cuadradocarta = (ImageView) findViewById(R.id.cuadradocarta);
		carta = (ImageView) findViewById(R.id.carta);
	
		
		//custom code goes here
	
	}
}
	
	
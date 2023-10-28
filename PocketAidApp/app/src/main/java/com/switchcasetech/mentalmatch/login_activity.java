package exportkit.figma;

import android.app.Activity;
import android.os.Bundle;


import android.view.View;
import android.widget.TextView;
import android.widget.ImageView;
import android.content.Intent;

import com.switchcasetech.mentalmatch.R;

	public class login_activity extends Activity {

	
	private View _bg__login;
	private TextView titulologin;
	private View _bg___botoniniciar_ek1;
	private View fondoiniciar;
	private TextView textoiniciar;
	private View _bg__otrasopciones_ek1;
	private TextView textoopciones;
	private ImageView linea2opciones;
	private ImageView linea1opciones;
	private TextView _recuperar_cuenta;
	private TextView _registro;
	private View _bg__correoelectronico_ek1;
	private View fondocorreo;
	private TextView titulotexto;
	private TextView correotexto;
	private View _bg__email_ek1;
	private ImageView cuadradocarta;
	private ImageView carta;
	private View _bg__contra_ek1;
	private View fondocontra;
	private TextView contra_ek2;
	private TextView titulocontra;
	private View _bg__candadoicono_ek1;
	private View _bg__grupocandado_ek1;
	private ImageView cuadradocandado;
	private ImageView candado;
	private View _bg__ocultaricono_ek1;
	private ImageView ojoicono;
	private ImageView logosinfondo;

	@Override
	public void onCreate(Bundle savedInstanceState) {

		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);

		
		_bg__login = (View) findViewById(R.id._bg__login);
		titulologin = (TextView) findViewById(R.id.titulologin);
		_bg___botoniniciar_ek1 = (View) findViewById(R.id._bg___botoniniciar_ek1);
		fondoiniciar = (View) findViewById(R.id.fondoiniciar);
		textoiniciar = (TextView) findViewById(R.id.textoiniciar);
		_bg__otrasopciones_ek1 = (View) findViewById(R.id._bg__otrasopciones_ek1);
		textoopciones = (TextView) findViewById(R.id.textoopciones);
		linea2opciones = (ImageView) findViewById(R.id.linea2opciones);
		linea1opciones = (ImageView) findViewById(R.id.linea1opciones);
		_recuperar_cuenta = (TextView) findViewById(R.id._recuperar_cuenta);
		_registro = (TextView) findViewById(R.id._registro);
		_bg__correoelectronico_ek1 = (View) findViewById(R.id._bg__correoelectronico_ek1);
		fondocorreo = (View) findViewById(R.id.fondocorreo);
		titulotexto = (TextView) findViewById(R.id.titulotexto);
		correotexto = (TextView) findViewById(R.id.correotexto);
		_bg__email_ek1 = (View) findViewById(R.id._bg__email_ek1);
		cuadradocarta = (ImageView) findViewById(R.id.cuadradocarta);
		carta = (ImageView) findViewById(R.id.carta);
		_bg__contra_ek1 = (View) findViewById(R.id._bg__contra_ek1);
		fondocontra = (View) findViewById(R.id.fondocontra);
		contra_ek2 = (TextView) findViewById(R.id.contra_ek2);
		titulocontra = (TextView) findViewById(R.id.titulocontra);
		_bg__candadoicono_ek1 = (View) findViewById(R.id._bg__candadoicono_ek1);
		_bg__grupocandado_ek1 = (View) findViewById(R.id._bg__grupocandado_ek1);
		cuadradocandado = (ImageView) findViewById(R.id.cuadradocandado);
		candado = (ImageView) findViewById(R.id.candado);
		_bg__ocultaricono_ek1 = (View) findViewById(R.id._bg__ocultaricono_ek1);
		ojoicono = (ImageView) findViewById(R.id.ojoicono);
		logosinfondo = (ImageView) findViewById(R.id.logosinfondo);
	
		
		_recuperar_cuenta.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), olvidaste_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		
		
		_registro.setOnClickListener(new View.OnClickListener() {
		
			public void onClick(View v) {
				
				Intent nextScreen = new Intent(getApplicationContext(), register___usuario_activity.class);
				startActivity(nextScreen);
			
		
			}
		});
		

	
	}
}
	
	
package com.example.tresenrayafinal;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

public class TresEnRaya extends Activity {

	private TextView jugar;
    private TextView confi;
    private TextView acercade;
    private TextView salir;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView texto = (TextView) findViewById(R.id.titulo);
        Animation animacion = AnimationUtils.loadAnimation(this,R.anim.girozoom);
        texto.startAnimation(animacion);
                
        Button jugar = (Button) findViewById(R.id.jugar);
        Animation animacion2 = AnimationUtils.loadAnimation(this,R.anim.aparecer);
        jugar.startAnimation(animacion2);
        
        Button config = (Button) findViewById(R.id.acercaDe);
        Animation animacion3 = AnimationUtils.loadAnimation(this, R.anim.desplazarderecha);
        config.startAnimation(animacion3);
        
        Button acercade = (Button) findViewById(R.id.salir);
        Animation animacion4 = AnimationUtils.loadAnimation(this,R.anim.aparecer);
        acercade.startAnimation(animacion4);
        
        this.jugar = (TextView) findViewById(R.id.jugar);
        this.acercade = (TextView) findViewById(R.id.acercaDe);
        this.salir = (TextView) findViewById(R.id.salir);
        
    }

    public void pulsaSalir(View view){
        
    	finish();	    
	} 
    
        
    public void pulsaJugar(View view){
        
    	Intent i = new Intent(this, Juego.class);
        startActivity(i);
	} 
    
public void pulsaJugarCpu(View view){
        
    	Intent i = new Intent(this, JuegoCpu.class);
        startActivity(i);
	} 
    
    public void pulsaAcercaDe(View view){
        
    	 Intent i = new Intent(this, AcercaDe.class);
         startActivity(i);
	} 
}

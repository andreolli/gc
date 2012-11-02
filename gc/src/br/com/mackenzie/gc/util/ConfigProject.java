package br.com.mackenzie.gc.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



public class ConfigProject {
	
	public static String pegarPropriedade(String param){
		File arquivo = null;
		Properties props = new Properties(); 
		FileInputStream streamArquivo = null;
		String texto = null;	
		try {   
			arquivo = new File("configProject.properties");
			streamArquivo = new FileInputStream(arquivo);
            props.load(streamArquivo);   
            texto = props.getProperty(param);
 		} catch (FileNotFoundException ex) {   
            ex.printStackTrace();   
        } catch (IOException ex) {   
            ex.printStackTrace();   
        }finally{
            try {
            	if(streamArquivo != null){
            		streamArquivo.close();
            	}
    		} catch (IOException e) {
    			e.printStackTrace();   
    		}
        }   
         		
		
		return texto;
	}
	
}

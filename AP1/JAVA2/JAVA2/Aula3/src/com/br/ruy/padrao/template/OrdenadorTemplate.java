package com.br.ruy.padrao.template;

import com.br.ruy.padrao.template.dto.MusicaMP3;
import java.util.ArrayList;


public abstract class OrdenadorTemplate {
    
    public abstract boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2);
    
    public ArrayList<MusicaMP3> ordenarMusica
                                    (ArrayList<MusicaMP3> lista){
        
        ArrayList<MusicaMP3> novalista = new ArrayList<MusicaMP3>();
        // Movimentou todos os elementos
        // de Lista para NovaLista
        for (MusicaMP3 musicaMP3 : lista) {
            novalista.add(musicaMP3);
        }
        //Ordenação Interna
        for(int i=0; i<novalista.size(); i++){
            for(int j=i+1; j<novalista.size(); j++){
                if( isPrimeiro(novalista.get(i), novalista.get(j)) ){
                    MusicaMP3 temp = novalista.get(j);
                    novalista.set(j, novalista.get(i));
                    novalista.set(i, temp);
                }
            }
        }
        
        
        
        return novalista;
    }
    
}

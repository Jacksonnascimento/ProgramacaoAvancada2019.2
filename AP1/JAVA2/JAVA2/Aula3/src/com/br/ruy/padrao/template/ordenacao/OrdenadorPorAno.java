package com.br.ruy.padrao.template.ordenacao;

import com.br.ruy.padrao.template.OrdenadorTemplate;
import com.br.ruy.padrao.template.dto.MusicaMP3;


public class OrdenadorPorAno extends OrdenadorTemplate{

    @Override
    public boolean isPrimeiro(MusicaMP3 musica1, MusicaMP3 musica2) {
        return (musica1.getAno() > musica2.getAno());
    }
    
}

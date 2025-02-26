package com.marcelosantosc.especialistaspring.Dspringdata.A15Embeddable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class EmbeddableFoo {

    @Column(name = "campo_1")
    private String campo1;

    @Column(name = "campo_2")
    private String campo2;
}

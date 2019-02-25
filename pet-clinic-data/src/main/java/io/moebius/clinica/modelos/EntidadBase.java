package io.moebius.clinica.modelos;

import java.io.Serializable;

public class EntidadBase implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

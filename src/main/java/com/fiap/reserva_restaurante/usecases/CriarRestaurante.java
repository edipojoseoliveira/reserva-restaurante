package com.fiap.reserva_restaurante.usecases;

import com.fiap.reserva_restaurante.entities.Restaurante;
import com.fiap.reserva_restaurante.gateways.RepositorioDeRestaurante;

public class CriarRestaurante {

    private final RepositorioDeRestaurante repositorioDeRestaurante;

    public CriarRestaurante(RepositorioDeRestaurante repositorioDeRestaurante) {
        this.repositorioDeRestaurante = repositorioDeRestaurante;
    }

    public Restaurante cadastrarRestaurante(Restaurante restaurante) {
        return this.repositorioDeRestaurante.cadastrarRestaurante(restaurante);
    }

}

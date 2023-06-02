package com.unip.aps.controller;

import com.unip.aps.model.ONG;

import java.util.ArrayList;
import java.util.List;

public class ONGController {
    private static final String ONGSBRASIL_URL = "https://www.ongsbrasil.com.br/default.asp";

    public List<ONG> buscarOngsProximas(String name, String address) {
        // Aqui você pode implementar a lógica para buscar ONGs com base nas informações fornecidas.
        // Você pode usar APIs de geolocalização, bancos de dados ou outras fontes de dados.
        // Por enquanto, vamos retornar uma lista de ONGs fictícias como exemplo.

        List<ONG> ongs = new ArrayList<>();
        ongs.add(new ONG("ONG A", "Descrição da ONG A", "111111111"));
        ongs.add(new ONG("ONG B", "Descrição da ONG B", "222222222"));
        ongs.add(new ONG("ONG C", "Descrição da ONG C", "333333333"));

        return ongs;
    }
}

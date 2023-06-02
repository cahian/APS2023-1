package com.unip.aps;

import java.util.ArrayList;
import java.util.List;

public class ONGSearchService {
    public List<String> searchNGOs(String name, String address) {
        // Aqui você pode implementar a lógica para buscar ONGs com base nas informações fornecidas.
        // Você pode usar APIs de geolocalização, bancos de dados ou outras fontes de dados.
        // Por enquanto, vamos retornar uma lista de ONGs fictícias como exemplo.

        List<String> ongs = new ArrayList<>();
        ongs.add("ONG A");
        ongs.add("ONG B");
        ongs.add("ONG C");

        return ongs;
    }
}

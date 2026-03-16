package com.emergencias.service;

import com.emergencias.model.CentroSalud;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class CentroSaludService {

    public static ArrayList<CentroSalud> cargarCentros() {

        ArrayList<CentroSalud> centros = new ArrayList<>();

        try {
            Gson gson = new Gson();
            Type tipoLista = new TypeToken<List<CentroSalud>>() {}.getType();

            FileReader reader = new FileReader("Proyecto-de-emergencias/Proyecto-de-emergencias/centros_salud.json");
            centros = gson.fromJson(reader, tipoLista);

        } catch (Exception e) {
            System.out.println("Error leyendo el JSON");
            e.printStackTrace();
        }

        return centros;
    }
}


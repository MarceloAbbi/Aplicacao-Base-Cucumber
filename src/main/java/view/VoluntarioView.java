package view;

import model.Voluntario;

import java.util.List;

public class VoluntarioView {

    public static void listaVoluntario(Voluntario voluntario) {
        System.out.println(voluntario.getId()+" - "+ voluntario.getNome() +"("+ voluntario.getFones().get(0));
    }

    public static void listaVoluntarios(List<Voluntario> lista) {
        for(Voluntario al : lista) {
            listaVoluntario(al);
        }
    }
}

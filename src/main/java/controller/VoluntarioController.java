package controller;

import model.Voluntario;
import model.Telefone;
import repository.VoluntarioRepository;
import repository.ChaveExisteException;
import view.VoluntarioView;

import java.util.List;


public class VoluntarioController {


    public Voluntario createVoluntario(String nome, long id, int ddd, String numero, char tipo) {
        Voluntario voluntario = new Voluntario(nome, id);
        voluntario.addFone(new Telefone(ddd,numero,tipo, true,null));
        try {
            VoluntarioRepository.getInstance().insertVoluntario(voluntario);
        } catch (ChaveExisteException e) {
            System.out.println("chave "+voluntario.getId()+" já cadastrada\n");
            voluntario = null;
        }
        return voluntario;
    }

    public void listaVoluntarios() {
        VoluntarioRepository repo1 = VoluntarioRepository.getInstance();
        VoluntarioRepository repo2 = VoluntarioRepository.getInstance();
        VoluntarioRepository repo3 = VoluntarioRepository.getInstance();
        VoluntarioRepository repo4 = VoluntarioRepository.getInstance();

        List<Voluntario> lista = VoluntarioRepository.getInstance().buscaTodos();
        VoluntarioView.listaVoluntario((Voluntario) lista);
    }
}

package repository;

import model.Voluntario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VoluntarioRepository {
    private Map<Long, Voluntario> dados;
    private static VoluntarioRepository instance;

    private VoluntarioRepository() {
        dados = new HashMap<Long, Voluntario>();
    }

    public static VoluntarioRepository getInstance() {
        if (instance == null) {
            instance = new VoluntarioRepository();
        }
        return instance;
    }

    public void insertVoluntario(Voluntario voluntario) throws ChaveExisteException {
        if (!dados.containsKey(voluntario.getId())) {
            dados.put(voluntario.getId(), voluntario);
        } else {
            throw new ChaveExisteException();
        }

    }

    public void updateVoluntario(Voluntario voluntario) throws ChaveInexisteException {
        if (dados.containsKey(voluntario.getId())) {
            dados.put(voluntario.getId(), voluntario);
        } else {
            throw new ChaveInexisteException();
        }

    }


    public Voluntario buscaVoluntarioId(long idv) {
        return dados.get(idv);
    }
    public List<Voluntario> buscaTodos() {
        List<Voluntario> voluntarios = new ArrayList<Voluntario>();
        voluntarios.addAll(dados.values());
        return voluntarios;
    }
    public Voluntario deleteVoluntario(long idv) {
        return dados.remove(idv);
    }


}

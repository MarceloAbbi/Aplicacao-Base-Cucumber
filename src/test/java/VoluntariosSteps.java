import controller.VoluntarioController;
import model.Voluntario;

import repository.VoluntarioRepository;

public class VoluntariosSteps {
    VoluntarioController voluntarioContr;

    @io.cucumber.java.en.Given("o app iniciou")
    public void oAppIniciou() {


    }

    @io.cucumber.java.en.And("foi criado o Controller")
    public void foiCriadoOController() {

        voluntarioContr  = new VoluntarioController();
    }

    @io.cucumber.java.en.And("^chamado o metodo de criacao$")
    public void chamadoOMetodoDeCriacao() {
        Voluntario vl = voluntarioContr.createVoluntario("voluntario 1", 1, 51, "1", 'R');
        assert (vl.getId() == 1);
        assert (vl.getNome().equals("voluntario 1"));
    }

    @io.cucumber.java.en.Then("^o voluntario foi salvo no repository$")
    public void oVoluntarioFoiSalvoNoRepository() {
        Voluntario vl = VoluntarioRepository.getInstance().buscaVoluntarioId(1);
        assert (vl.getId() == 1);
        assert (vl.getNome().equals("voluntario 1"));
    }
}

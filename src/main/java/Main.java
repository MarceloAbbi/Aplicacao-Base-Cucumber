import controller.VoluntarioController;

public class Main {
    public static void main(String[] args) {
        System.out.println("retornou com exito");
        VoluntarioController controller = new VoluntarioController();

        controller.createVoluntario("João",123456,51,"999999999",'R');
        controller.createVoluntario("Pedro",654321,51,"999999999",'R');
        controller.createVoluntario("Maria",145236,51,"999999999",'R');
        controller.createVoluntario("Julia",563214,51,"999999999",'R');
        controller.listaVoluntarios();
    }
}

public class Principal {

    public static void main(String args){

        Carro car = new Carro();
        Carro carAro = new Carro(14);
        Carro carTresParametros = new Carro(14, "HB 20 sense", 60000, "preto" );
        Carro carQuatroParametros = new Carro(14, "HB 20 sense", 60000, "preto");

        System.out.print (carAro.getAro());
        System.out.print (carTresParametros);
        System.out.print (carTresParametros);
        System.out.print (carTresParametros);

    }
}

    

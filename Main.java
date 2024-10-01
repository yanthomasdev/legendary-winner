public class Main {
    public static void main(String[] args) {
        Aritmetica cálculoA = new Aritmetica();
        Geometrica cálculoG = new Geometrica();
        
        Disciplina d = new Disciplina(cálculoA);
        
        d.setNome("Padrões de Desenvolvimento");
        
        d.setP1(10);
        d.setP2(5);
        
        d.CalcularMédia();
        
        System.out.println("Usando média aritmética:\n");
        System.out.println(
            String.format("P1: %.2f P2: %.2f Média: %.2f Situação: %s",
            d.getP1(),d.getP2(), d.getMédia(), d.getSituação())
        );
        
        d.setCalcMédia(cálculoG);
        d.setP1(8);
        d.setP2(5);
        d.CalcularMédia();
        
        System.out.println("Usando média geométrica:\n");
        System.out.println(
            String.format("P1: %.2f P2: %.2f Média :%.2f Situação: %s",
            d.getP1(),d.getP2(), d.getMédia(), d.getSituação())
        );
    }
}


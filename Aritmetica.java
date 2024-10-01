public class Aritmetica implements ICalcMedia {
    public double CalculaMédia(double a, double b) {
        return (a + b) / 2;
    }
    
    public String Situação(double média) {
        if (média > 5) 
            return "Aprovado";
        else
            return "Reprovado";
    }
}
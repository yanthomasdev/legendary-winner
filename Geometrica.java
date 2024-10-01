public class Geometrica implements ICalcMedia {
    public double CalculaMédia(double a, double b) {
        return Math.sqrt(a * b);
    }
    
    public String Situação(double média) {
        if (média > 7) 
            return "Aprovado";
        else
            return "Reprovado";
    }
}
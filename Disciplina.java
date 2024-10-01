public class Disciplina {
    private ICalcMedia calcMédia;
    private double média;
    private String nome;
    private double p1;
    private double p2;
    private String situação;
    
    public Disciplina() {}
    
    public Disciplina(ICalcMedia calcMédia) {
        this.calcMédia = calcMédia;
    }
    
    public ICalcMedia getCalcMédia() {
        return this.calcMédia;
    }
    
    public void setCalcMédia(ICalcMedia calcMédia) {
        this.calcMédia = calcMédia;
    }
    
    public double getMédia() {
        return this.média;
    }
    
    public void setMédia(double média) {
        this.média = média;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getP1() {
        return this.p1;
    }
    
    public void setP1(double p1) {
        this.p1 = p1;
    }
    
    public double getP2() {
        return this.p2;
    }
    
    public void setP2(double p2) {
        this.p2 = p2;
    }
    
    public String getSituação() {
        return this.situação;
    }
    
    public void setSituação(String situação) {
        this.situação = situação;
    }
    
    public void CalcularMédia() {
        double média = this.calcMédia.CalculaMédia(this.p1, this.p2);
        this.setMédia(média);
        
        this.setSituação(this.calcMédia.Situação(média));
    }
}
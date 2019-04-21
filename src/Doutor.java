
public class Doutor {
    private String illness[] = null;
    private String sintomasPaciente[] = null;
    private String sintomas[][] = null;
    private Paciente p;
    
    public Doutor(Paciente p, DataSetComponent data){
        this.p = p;
        this.illness = data.requestAttributes();
        this.sintomas = data.requestInstances();
        this.sintomasPaciente = new String[illness.length];
    }

    public void getIllness(){
        for(int i = 0; i < illness.length - 1; i++){
            System.out.println("DOCTOR: Are you " + illness[i] + "?");
            String resp = p.consulta(illness[i]);
            this.sintomasPaciente[i] = resp;
        }
    }
    public void diagnostico(){
        for(int i = 0; i < this.sintomas.length - 1; i++){
            for(int j = 0; j < this.sintomasPaciente.length - 1; j++){
                if(!this.sintomasPaciente[j].equalsIgnoreCase(this.sintomas[i][j])){
                    break;
                }
                else{
                    if(j == this.sintomasPaciente.length - 2){
                        System.out.println("DIAGNOSTIC: You are " + this.sintomas[i][j + 1]);
                    }
                }
            }
            
        }
    }
}

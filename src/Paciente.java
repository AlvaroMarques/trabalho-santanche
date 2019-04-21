public class Paciente {
    private String illness[] = null;
    private String sintomas[][] = null;
    private int random;

    public Paciente(DataSetComponent data){
        String atributos[] = data.requestAttributes();
        this.illness = atributos;
        String instancias[][] = data.requestInstances();
        this.sintomas = instancias;
        int min = 0;
        int max = (int)Math.floor(this.sintomas.length - 1);
        this.random = (int)Math.floor(Math.random() * (max - min + 1)) + min;
        //System.out.println(this.random);
    }
    public String consulta(String pergunta){
        for(int i = 0; i < illness.length; i ++){
            if(pergunta.toLowerCase().contains(illness[i].toLowerCase())){
                if(sintomas[this.random][i].equalsIgnoreCase("t")){
                    System.out.println("PATIENT: YES");
                }else{
                    System.out.println("PATIENT: NO");
                }
                return sintomas[this.random][i];
            }
        }
        return "";
    }
}

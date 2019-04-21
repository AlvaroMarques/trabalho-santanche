
public class Main {

	public static void main(String[] args) {
		DataSetComponent data = new DataSetComponent();
		data.setDataSource("../../../../db/zombie/zombie-health-spreadsheet-ml-training.csv");        
		Paciente p = new Paciente(data);
		Doutor d = new Doutor(p, data);
		d.getIllness();
		d.diagnostico();

	}

}

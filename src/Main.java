import java.sql.ResultSet;
import java.sql.SQLException;
public class Main {

	public static void main(String[] args) {
		MyDataAcces conexion = new MyDataAcces();
		ResultSet resultado;
		String nombres;
		
		resultado = conexion.getQuery("select * from persona");
		
		try {
			while(resultado.next()){
				nombres = resultado.getString("nombre");
				System.out.println("nombre: "+nombres);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}

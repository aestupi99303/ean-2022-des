public class Universidad {

	private string nombre;
	private string nombreDelRector;
	private string ciudad;
	private List<Facultad>
}
	
	public class Facultad {

		private string nombre;
		private int numeroDeProfesores;
		private int numeroDeEstudiantes;
		private int numeroDeCarreras;
		private int numeroDeCursos;
		private List<Estudiante.Profesor.Persona>
		private List<Carrera>
	}
		
		public class Estudiante extends Persona{

			private string nombre;
			private string semestre;
			private string carrera;
			private int fechaDeIngreso;
		}
		
		public class Profesor extends Persona{

			private string nombre;
			private string profesion;
			private string nacionalidad;
			private int sueldo;
		}

		public class Persona {

			private int cedula;
			private int fechaDeNacimiento;
			private string nombre;
			private string lugarDeNacimiento;
		}
		
public class Carrera {

		private int nombre;
		private int numeroDeCreditosTotales;
		private int numeroDeSemestres;
		private int nivel;
		private string facultad;
		private List<Cursos>
		
}

public class Cursos {

	private int codigoDeCurso;
	private string nombreDelCurso;
	private int numeroDeCreditos;
	private string carrera;
	private int numeroDeSalon;
	private string profesor;
	private int numeroDeEstudiantes;
}

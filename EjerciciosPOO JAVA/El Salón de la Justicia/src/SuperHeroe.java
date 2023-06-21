import java.util.ArrayList;

public class SuperHeroe {

	private String nombre;
	private int presupuestoMensual;
	private ArrayList<Asistente> asis = new ArrayList<Asistente>();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String Nombre) {
		this.nombre = Nombre;
	}

	public int getPresupuestoMensual() {
		return presupuestoMensual;
	}

	public void setPresupuestoMensual(int PresupuestoMensual) {
		this.presupuestoMensual = PresupuestoMensual;
	}

	public ArrayList<Asistente> getAsis() {
		return asis;
	}

	public void setAsis(ArrayList<Asistente> asis) {
		this.asis = asis;
	}
	public void agregar(Asistente ps) {
		this.asis.add(ps);
	}
	public SuperHeroe(String nombre, int presupuestoMensual, ArrayList<Asistente> asis) {
		super();
		this.nombre = nombre;
		this.presupuestoMensual = presupuestoMensual;
		this.asis = asis;
	}

	public SuperHeroe() {
		// TODO Auto-generated constructor stub
	}

	public int CantAsistentes() {
		return getAsis().size();
	}

	public float losSueldosAsistentosos() {
		float aux = 0;
		for (Asistente asistente : asis) {
			aux += asistente.salario();
		}
		return aux;
	}

	public boolean victimaDeLosImpuestos() {
		return losSueldosAsistentosos() > getPresupuestoMensual();
	}

	public float vaquita() {
		return getPresupuestoMensual() - losSueldosAsistentosos();
	}

	public int asistentesCotiza2() {
		int aux = 0;
		for (Asistente asistente : asis) {
			if (asistente.estaCotizado()) {
				aux++;
			}
		}
		return aux;
	}
}
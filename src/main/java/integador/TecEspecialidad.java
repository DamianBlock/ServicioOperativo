package integador;



import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "ESPECIALIDAD")

public class TecEspecialidad {

    @ManyToMany (mappedBy = "especialidades")
    private List<Tecnico> tecnicos;

    @OneToOne(mappedBy = "incidenteEspecialidad")
    private TipoIncidente tipoIncidente;

    @Id
    @Column(name = "idESPECIALIDAD")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTecEspecialidad;

    @Column(name = "nombre_Especialidad")
    private String nombreEspecialidad;

    @Column(name = "descripcion")
    private String descripcionEspecialidad;


}

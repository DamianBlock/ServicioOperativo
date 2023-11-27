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
@Table(name = "TIPO_PROBLEMA")

public class TipoIncidente {

    @OneToOne
    @JoinColumn(name="idTIPO_PROBLEMA", referencedColumnName = "idESPECIALIDAD")
    private TecEspecialidad incidenteEspecialidad;

    @ManyToOne
    @JoinColumn(name= "INCIDENTE_idINCIDENTE", referencedColumnName= "idINCIDENTE")
    private Incidente incidentes;



    @Id
    @Column(name ="idTIPO_PROBLEMA")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTipoProblema;



}

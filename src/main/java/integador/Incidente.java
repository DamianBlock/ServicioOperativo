package integador;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "INCIDENTE")

public class Incidente {
    @Id
    @Column(name = "idIncidente")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idIncidente;

    @ManyToOne
    @JoinColumn(name= "OPERADOR_idOPERADOR", referencedColumnName= "idOPERADOR")
    private Operador operador;

    @ManyToOne
    @JoinColumn(name= "SERVICIO_idSERVICIO", referencedColumnName= "idSERVICIO")
    private Servicio servicio;

    @ManyToOne
    @JoinColumn(name= "CLIENTE_idCliente", referencedColumnName= "idCliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name= "TECNICO_idTECNICO", referencedColumnName= "idTECNICO")
    private Tecnico tecnico;

    @OneToMany
    private List<TipoIncidente> tipoIncidentes;




    @Column(name = "descripcion")
    private String descripcionIncidente;

    @Column(name = "estado")
    private String estado;

    @Column(name = "fecha_de_inicio")
    private LocalDate fechaDeInicio;

    @Column(name = "fecha_de_resolucion_estimada")
    private LocalDate fechaDeResolucionEstimada;

    @Column(name = "fecha_de_resolucion_real")
    private LocalDate fechaDeResolucionReal;


}
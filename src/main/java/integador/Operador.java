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
@Table(name = "OPERADOR")

public class Operador {
    @Id
    @Column(name = "idOPERADOR")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idOperador;

    @Column(name = "Nombre")
    private String nombreOperador;

    @Column(name = "Apellido")
    private String apellidoOperador;

    @Column(name ="domicilio")
    private String domicilioOperador;

    @Column(name ="telefono")
    private double telefonoOperador;

    @OneToMany
    @JoinColumn(name = "OPERADOR_idOPERADOR", referencedColumnName = "idOPERADOR")
    private List<Incidente> incidentes;



}
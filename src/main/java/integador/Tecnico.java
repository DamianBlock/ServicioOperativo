package integador;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "TECNICO")
public class Tecnico {

    @OneToMany
    private List<Incidente> indicente;

    @ManyToMany
    private List<TecEspecialidad> especialidades;


    @Id
    @Column(name= "idTECNICO")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idTecnico;

    @Column(name ="nombre")
    private String nombreTecnico;

    @Column(name ="apellido")
    private String apellidoTecnico;

    @Column(name = "dni")
    private int dniTecnico;

    @Column(name = "email")
    private int emailTecnico;

    @Column(name = "telefono")
    private int telefonoTecnico;

    @Column(name = "fecha_nacimiento")
    private Date fechaNacTecnico;

    @Column(name = "fecha_alta")
    private Date fechaAltaTecnico;

    @Column(name = "fecha_baja")
    private Date fechaBajaTecnico;


}

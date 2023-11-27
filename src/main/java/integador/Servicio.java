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
@Table(name = "SERVICIO")
public class Servicio {

    @Id
    @Column(name = "idSERVICIO")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idServicio;

    @Column(name = "nombre_Servicio")
    private String nombreServicio;

    @Column(name = "descripcion")
    private String descripcionServicio;


    @ManyToMany (mappedBy = "servicios")
    private List<Cliente> clientes;

    @OneToMany
    private List<Incidente> incidente;

}

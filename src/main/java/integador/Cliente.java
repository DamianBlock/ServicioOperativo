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
@Table(name = "CLIENTE")
public class Cliente {

    @ManyToMany
    private List<Servicio> servicios;

    @OneToMany
    private List<Incidente> incidente;

    @Id
    @Column(name = "idCliente")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int idCliente;

    @Column(name = "razonSocial")
    private String razonSocial;

    @Column(name = "cuit")
    private int cuitCliente;

    @Column(name = "CUIL")
    private int cuilCliente;

    @Column(name = "email")
    private int emailCliente;

    @Column(name = "telefono")
    private int telefonoCliente;

    @Column(name = "Fecha_Nacimiento")
    private Date fechaNacCliente;


}

package Application;

import Modelo.Proveedor;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class App {

    private static EntityManager em;

    private static EntityManagerFactory emf;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        try{
            emf = Persistence.createEntityManagerFactory("mysql_persistence");
            em = emf.createEntityManager();

            // Pide por parámetro el id del cliente
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el id del cliente que quieres consultar:");
            int id_cliente = sc.nextInt();

            // Obtiene una lista con todos los proveedores del cliente indicado
            List<Proveedor> proveedoresList = (List<Proveedor>) em.createQuery("FROM Proveedor where id_cliente =" + id_cliente).getResultList();

            // Comprueba si la lista está vacía, si lo está, muestra un mensaje de error, si no, genera el fichero con los datos de los proveedores
            if(proveedoresList.isEmpty()){
                System.out.println("El cliente con id " + id_cliente + " no tiene proveedores asignados");
            }else{
                String header = "id_proveedor;nombre;fecha_alta;id_cliente";
                generateFile(proveedoresList, header);
            }
        }catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }finally{
            if (em != null) {
                em.close();
            }
            if (emf != null) {
                emf.close();
            }
        }

    }

    // Genera un fichero de texto con la lista de proveedores, pasa por parámetro el directorio donde se guardará el fichero
    private static void generateFile(List<Proveedor> proveedorList, String header) {
        BufferedOutputStream bos = null;

        // Crea un fichero en el directorio del usuario, ejemplo(C:\Users\Usuario\proveedores.txt)
        File file = new File(System.getProperty("user.home") + "/proveedores.csv");

        // Guarda la lista de proveedores en el fichero
        try {
            bos = new BufferedOutputStream(new FileOutputStream(file));
            bos.write(header.getBytes());

            for (Proveedor proveedor : proveedorList) {
                String line = proveedor.getId_proveedor() + ";" + proveedor.getNombre() + ";" + formatDate(proveedor.getFecha_alta()) + ";" + proveedor.getId_cliente();
                bos.write("\n".getBytes());
                bos.write(line.getBytes());
            }

            System.out.println("El fichero proveedores.csv se ha creado en " + System.getProperty("user.home"));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al guardar la lista en el fichero");
        } finally {
            try {
                if (bos != null) {
                    bos.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
            }
        }
    }

    private static String formatDate(Date date){
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(date);
    }
}


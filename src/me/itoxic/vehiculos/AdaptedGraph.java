package me.itoxic.vehiculos;

import java.util.ArrayList;

/**
 *
 * Esta clase se basa en la clase Grafo y su función es
 * proveer una utilidad para el manejo del programa.
 *
 */
public class AdaptedGraph {

    protected int size;
    private int [][] grafoAM;

    public AdaptedGraph(int vertices) {
        size = vertices;
        grafoAM = new int[size][size];
    }

    /**
     * Este metodo permite añadir una arista al grafo
     * basandose en un lugar 'desde' a un lugar 'hasta'
     * con su correspondiente peso.
     *
     * @from Desde.
     * @to Hasta.
     * @weight El peso de la arista.
     */
    public void addEdge(int from, int to, int weight) {
        grafoAM[from][to] = weight;
    }

    /**
     * Metodo que retorna el un ArrayList con el numero de todos los vertices que tengan una conexion
     * con uno.
     *
     * @vertice Numero del vertice para extraer sucesores.
     */
    public ArrayList<Integer> getSuccessors(int vertice) {

        ArrayList<Integer> sucesores = new ArrayList<Integer>();

        for(int i = 0; i < size; i++)
            sucesores.add(i);

        return sucesores;

    }
    /**
     * Metodo que retorna el valor o peso de un arco entre dos vertices.
     *
     * @source Desde.
     * @destination Hasta.
     */
    public int getWeight(int source, int destination) {
        return grafoAM[source][destination];
    }

    /**
     *
     * @return Obtener el tamaño del grafo.
     */
    public  int size() {
        return size;
    }

}

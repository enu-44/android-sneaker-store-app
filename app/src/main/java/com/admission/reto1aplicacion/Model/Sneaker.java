package com.admission.reto1aplicacion.Model;
import com.admission.reto1aplicacion.R;

public class Sneaker {
    private int id;
    private static String name;

    private int idDrawable;

    public Sneaker(int id, String name, int idDrawable) {
        this.id = id;
        this.name = name;
        this.idDrawable = idDrawable;
    }

    public int getIdDrawable() {
        return idDrawable;
    }

    public void setIdDrawable(int idDrawable) {
        this.idDrawable = idDrawable;
    }

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Sneaker.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static Sneaker[] ITEMS = {
            new Sneaker(1, "nunsplash", R.drawable.sneaker1),
            new Sneaker(2, "baleta_1", R.drawable.sneaker2),
            new Sneaker(3, "botas_Seguridad", R.drawable.sneaker3),
            new Sneaker(4, "c", R.drawable.sneaker4),
            new Sneaker(5, "colegiales", R.drawable.sneaker5),
            new Sneaker(6, "newbalance", R.drawable.sneaker6),
            new Sneaker(7, "pimas", R.drawable.sneaker7),
            new Sneaker(8, "tillas", R.drawable.sneaker8),
            new Sneaker(9, "usama_unsplash", R.drawable.sneaker9),

    };

    public static Sneaker getItem(int id) {
        for (Sneaker sneakerActual : ITEMS) {
            if (sneakerActual.getId() == id) {
                return sneakerActual;
            }
        }
        return null;

    }
}

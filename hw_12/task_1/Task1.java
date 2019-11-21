package hw_12.task_1;

import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        /*Ĺńňü ňîâŕđ, ęîňîđűé ďîńňóďŕĺň íŕ ńęëŕä ěŕăŕçčíŕ(ďóńęŕé ýňî áóäĺň ęîëëĺęöč˙).
        Âŕě íĺîáőîäčěî óęŕçŕňü äŕňó č âđĺě˙, â ęîňîđîĺ ňîâŕđ ďîńňóďčë (íŕďđčěĺđ ďđč äîáŕâëĺíčč
        ĺăî â ęîëëĺęöčţ, ň.ĺ. ńęëŕä)*/
        try {
            // у Warehouse стоило сделать поле timeAdded и сетать его перед добавлением в хранилище
            List<Warehouse> productWarehouse = new LinkedList<>();
            productWarehouse.add(new Warehouse("Apple"));
            productWarehouse.add(new Warehouse("Orange"));
            timeProduct(productWarehouse);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // List<Warehouse> productWarehouse зачем тебе этот аргумент в методе, если ты его не используешь?
    public static void timeProduct(List<Warehouse> productWarehouse) {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
    }
}

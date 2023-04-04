
// сортировка
package Seminar_expample.Seminar3;

import java.lang.reflect.Array;
import java.security.cert.CollectionCertStoreParameters;
import java.text.CollationElementIterator;
import java.text.CollationKey;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task4 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8));
        System.out.println(list1);
        list1.sort(null);
        System.out.println(list1);
        Collections.sort(list1, Collections.reverseOrder());
        System.out.print(list1);
        ;
    }
}

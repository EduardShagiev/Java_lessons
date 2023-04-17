// Урок 6. Хранение и обработка данных ч3: множество коллекций Set
// Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объём ЖД
// 3 - Операционная система
// 4 - Цвет …
// Далее нужно запросить минимальные значения для указанных критериев — сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

package Home_work.HW_6;

import java.util.*;

public class laptop {
    public String NameBrend;
    public String Model;
    public int SN;
    public int MemoryRam;
    public int MemoryDisk;
    public String VideoCard;
    public String OS;

    public laptop(String NameBrend, String Model, int SN, int MemoryRam, int MemoryDisk, String VideoCard, String OS) {

        this.NameBrend = NameBrend;
        this.Model = Model;
        this.SN = SN;
        this.MemoryRam = MemoryRam;
        this.MemoryDisk = MemoryDisk;
        this.VideoCard = VideoCard;
        this.OS = OS;
    }

    void getAllInf() {
        System.out.printf(
                "Brend= %s, Model = %s  S/N = %d CapacityMemRam = %d CapcityHD = %d TypeGPU = %s, Windows = %s \n",
                NameBrend, Model, SN, MemoryRam, MemoryDisk, VideoCard, OS);
    }

    void SetMemRam(int MemoryRam) {
        this.MemoryRam = MemoryRam;
    }

    void SetOS(String OS) {
        this.OS = OS;
    }

    public String getModel() {
        return Model;
    }

    public String getNameBrend() {
        return NameBrend;
    }

    public static List<String> propertiesForFilter() {
        List<String> list = new ArrayList<>();
        list.add("MemoryRAM");
        list.add("OperatingSystem");
        list.add("CapacityHDD");
        list.add("Model");

        return list;

    }

}

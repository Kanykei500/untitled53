import java.util.*;

public class Main {
    public static void main(String[] args) {
/*        Java Collection: LinkedList Exercises [7 көнүгүү]
        1. LinkedList тизменин биринчи элементин алуу үчүн Java программасын жазыңыз.
        LinkedList<Integer> list = new LinkedList<>();
        list.add(2);
        list.add(5);
        list.add(10);
        System.out.println(list.get(0));*/
/*
 2. LinkedList тизменин акыркы элементин алуу үчүн Java программасын жазыңыз.
        List<Integer> list1 = new LinkedList<>(Arrays.asList(
                2, 5, 7, 3, 9
        ));
        System.out.println(list1.getClass());
*/

 /*       3. LinkedList тизмеде белгилүү бир элемент бар же жок экенин текшерүү үчүн Java программасын жаз.
        LinkedList<Character> list2 = new LinkedList<>(Arrays.asList(
                'A', 'B', 'C', 'D'
        ));
        System.out.println(list2.contains('B'));

        4. LinkedList тизмени массивдердин тизмесине которуу үчүн Java программасын жазыңыз.
        LinkedList<String> list3 = new LinkedList<>(Arrays.asList(
                "Peaksoft",
                "Space X",
                "Google"

        ));
        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Game zone");
        list4.add("Facebook");
        System.out.println(list3);
        System.out.println(list4);
        list4.addAll(list3);
        System.out.println(list4);
*/
 /*       5. Эки LinkedList тизмесин салыштыруу үчүн Java программасын жазыңыз.
        LinkedList<String> str = new LinkedList<>(Arrays.asList("1", "2", "3"));
        LinkedList<String> str2 = new LinkedList<>(Arrays.asList("1", "2", "3", "4"));
        Iterator<String> iterator = str.iterator();
        Iterator<String> iterator1 = str2.iterator();
*/

 /*       6. LinkedList тизме бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
        LinkedList<Integer> list5 = new LinkedList<>(Arrays.asList(1, 4, 7, 9));
        System.out.println(list5.isEmpty());



        7. LinkedList тизмедеги элементти алмаштыруу үчүн Java программасын жазыңыз.
        LinkedList<Integer>list6=new LinkedList<>(Arrays.asList(2,7,9,3,4));
        System.out.println(list6);
        for (int i = 0; i <=list6.size() ; i++) {
            System.out.println(i);
        }*/
/*
        Java Collection: HashSet Exercises [12 көнүгүү]

        The Hash Set: [
      new BankAccount("OPTIMA","41692222" "7000")
        new BankAccount("KYRGYZSTAN","41691111" "5000")
        new BankAccount("DEMIR","41693333" "9000")
        new BankAccount("RSK","41694444" "100000")
        HashSet<BankAccount>hashSet=new HashSet<>(Arrays.asList(
               new BankAccount("OPTIMA","41692222" ,"7000"),
             new BankAccount("KYRGYZSTAN","41691111", "5000"),
                new BankAccount("DEMIR","41693333", "9000"),
                 new BankAccount("RSK","41694444", "100000")));
        System.out.println(hashSet);*/
/*        1. Көрсөтүлгөн элементти HashSet топтомунун аягына кошуу үчүн Java программасын жазыңыз.
          hashSet.add(new BankAccount("Bakai","41695555","12000"));
        System.out.println(hashSet);*/
/*
        2. HashSet тизмедеги бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
        Set<Integer>integerSet=new HashSet<>(Arrays.asList(1,4,5,6));
        System.out.println(integerSet);
        Iterator<Integer> iterator=integerSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());*/
/*
        3. HashSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
        Set<String>set1=new HashSet<>(Arrays.asList("Talas","Bishkek","Osh","Batken"));
        System.out.println(set1.size());*/
 /*       4. HashSet топтомун бошотуу үчүн Java программасын жазыңыз.
        Set<Character> characters2 = new HashSet<>(Arrays.asList('A','B','C'));
        System.out.println(characters2);
        characters2.clear();
        System.out.println(characters2);*/
/*        5. HashSet топтомунун бош же жок экенин текшерүү үчүн Java программасын жазыңыз.
        Set<String>set3=new HashSet<>(Arrays.asList("Winter","Autumn"));
        System.out.println(set3);

        System.out.println(set3.isEmpty());


        6. HashSet топтомун башка хэш топтомуна клондоо үчүн Java программасын жазыңыз.
        Set<Integer>set4=new HashSet<>(Arrays.asList(15,20,30,45));
        System.out.println(set4);
        Set<Integer>set5=new HashSet<>(set4);
        System.out.println(set5);


        7. HashSet топтомун массивге айландыруу үчүн Java программасын жазыңыз.
        Set<String>set7=new HashSet<>(Arrays.asList("KG", "USA", "KZ"));
        System.out.println(set7);
        String[]massiv=new String[set7.size()];
        set7.toArray(massiv);
        for (String m:massiv) {
            System.out.println(m);

        }




        8. HashSet топтомун трисет топтомуна айландыруу үчүн Java программасын жазыңыз.
        Set<String>hashSet=new HashSet<>(Arrays.asList("Peaksoft","Space X","Google"));
        Set<String>treeSet=new TreeSet<>();
        System.out.println(hashSet);
        treeSet.addAll(hashSet);
        System.out.println(treeSet);


        9. HshSet топтомун List/ ArrayListке айландыруу үчүн Java программасын жазыңыз.
               Set<String>set6=new HashSet<>(Arrays.asList("Kanykei","Aiperi","Aisuluu"));
        System.out.println(set6);
        ArrayList<String>arrayList=new ArrayList<>(set6);
        System.out.println(arrayList);


        10. Эки HashSet топтомун салыштыруу үчүн Java программасын жазыңыз.
        Set<Integer>set8=new HashSet<>(Arrays.asList(23,45,67,27));
        System.out.println(set8);
        Set<Integer>set9=new HashSet<>(Arrays.asList(23,45,67,27));
        System.out.println(set8.equals(set9));



        11. Эки топтомду салыштыруу жана эки топтомдо бирдей элементтерди сактоо үчүн
        Java программасын жазыңыз.
        Set<String>set0=new HashSet<>(Arrays.asList("Black","White","Pink"));
        System.out.println(set0);
        Set<String>set1=new HashSet<>(Arrays.asList("Yellow","Brown","Red"));
        System.out.println(set1);
        System.out.println(set0.retainAll(set1));


        12. HashSet топтомунан бардык элементтерди алып салуу үчүн Java программасын жазыңыз.
        Set<Character>characterSet=new HashSet<>(Arrays.asList('d','h','b'));
        System.out.println(characterSet);
        characterSet.clear();
        System.out.println(characterSet);


        _____________________________________________________________________________________________

        Java Collection: TreeSet Exercises [16 көнүгүүлөр]

        1. Жаңы TreeSet топтомун түзүү үчүн Java программасын жазыңыз,
        бир нече түстөрдү  кошуп, TreeSet топтомун басып чыгарыңыз.
         Set<String>strings=new TreeSet<>(Arrays.asList("Blue","Red","Pink"));
        System.out.println(strings);


        2. TreeSet топтомундагы бардык элементтерди кайталоо үчүн Java программасын жазыңыз.
        Set<Character> characterSet = new TreeSet<>(Arrays.asList('q', 'r', 't'));
        System.out.println(characterSet);
        Iterator<Character> iterator = characterSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());


        3. Белгиленген TreeSet топтомунун бардык элементтерин башка TreeSet
        кошуу үчүн Java программасын жазыңыз.
            Set<Integer>integers=new TreeSet<>(Arrays.asList(10,1,2,3,4,5));
            System.out.println(integers);
            Set<Integer>integers1=new TreeSet<>(Arrays.asList(6,7,8,9));
            System.out.println(integers.addAll(integers1));*/
/*        4. Берилген TreeSet топтомундагы элементтердин тескери иреттүү көрүнүшүн
 түзүү үчүн Java программасын жазыңыз.
        TreeSet<String>set=new TreeSet<>();
        set.add("Кыргызстан");
        set.add("Россия");
        set.add("Китай");
        set.forEach(System.out::println);
        System.out.println(set.descendingSet());*/


/*        5. TreeSet топтомундагы биринчи жана акыркы элементтерди алуу үчүн Java программасын жазыңыз.
        TreeSet<Integer>integerTreeSet=new TreeSet<>();
        integerTreeSet.add(1);
        integerTreeSet.add(98);
        integerTreeSet.add(123);
        System.out.println(integerTreeSet);
        System.out.println(integerTreeSet.first());
        System.out.println(integerTreeSet.last());*/

/*       6. TreeSet тизмегин башка TreeSet топтомуна клондоо(clone) үчүн Java программасын жазыңыз.
        TreeSet<String>treeSet=new TreeSet<>();
        treeSet.add("Kanykei");
        treeSet.add("Saltanat");
        treeSet.add("Aiperi");
        System.out.println(treeSet);
        System.out.println(treeSet.clone());



      7. TreeSet топтомундагы элементтердин санын алуу үчүн Java программасын жазыңыз.
        TreeSet<Integer>treeSet1=new TreeSet<>(Arrays.asList(1,56,78,24,68,226,89,456,48,24));
        System.out.println(treeSet1);
        System.out.println(treeSet1.size());*/


/*       8. Эки TreeSet топтомун салыштыруу үчүн Java программасын жаз.
        TreeSet<Integer>set=new TreeSet<>(Arrays.asList(1,2,3));
        System.out.println(set);
        TreeSet<Integer>set1=new TreeSet<>(Arrays.asList(1,2,3));
        System.out.println(set1);
        System.out.println(set.equals(set1));*/


/*        9. Tree топтомундагы 7ден аз сандарды табуу үчүн Java программасын жаз.
        TreeSet<Integer>integerTreeSet=new TreeSet<>(Arrays.asList(1,2,456,78,34,23,67,78,3,5));
        System.out.println(integerTreeSet);
        System.out.println(integerTreeSet.headSet(7));*/


/*
        10. Берилген элементтен чоң же ага барабар болгон TreeSet жыйындысынын
        элементин алуу үчүн Java программасын жазыңыз.
        TreeSet<Integer> set5=new TreeSet<>(Arrays.asList(1,34,23,56));
        System.out.println(set5);
        System.out.println(set5.tailSet(20));
         System.out.println(set5.ceiling(50));



       11. Берилген элементтен кичине же ага барабар болгон TreeSet топтомундагы
        элементти алуу үчүн Java программасын жазыңыз.
        TreeSet<Integer>set6=new TreeSet<>(Arrays.asList(1,3,5,7,9,98,34));
        System.out.println(set6);
        System.out.println(set6.headSet(10));*/


    /*    12. TreeSet топтомунун биринчи элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
        TreeSet<Integer>set=new TreeSet<>(Arrays.asList(1,4,5,67,98));
        System.out.println(set);
        set.pollFirst();
        System.out.println(set);

        13. TreeSet топтомунун акыркы элементин алуу жана алып салуу үчүн Java программасын жазыңыз.
        TreeSet<Integer>set1=new TreeSet<>(Arrays.asList(4,6,7,2,9));
        System.out.println(set1);
        set1.pollLast();
        System.out.println(set1);

        14. Берилген элементти TreeSet жыйындысынан алып салуу үчүн Java программасын жазыңыз.
        TreeSet<Integer>set2=new TreeSet<>(Arrays.asList(45,6,2,4,89,34));
        System.out.println(set2);
        set2.remove(2);
        System.out.println(set2);*/

        }
    }










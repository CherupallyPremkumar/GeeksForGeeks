package Lists;

import java.util.*;
import java.util.stream.Collectors;

class Collectiooon {

    public static int min(List<Integer> list) {
        if (list == null) throw new NullPointerException();
        Iterator<Integer> iter = list.iterator();
        Integer candidate = iter.next();
        while (iter.hasNext()) {
            Integer next = iter.next();
            if (next.compareTo(candidate) < 0)
                candidate = next;
        }
        return candidate;
    }
    public static int max(List<Integer> list) {
        if (list == null) throw new NullPointerException();
        Iterator<Integer> iter = list.iterator();
        Integer candidate = iter.next();
        while (iter.hasNext()) {
            Integer next = iter.next();
            if (next.compareTo(candidate) > 0)
                candidate = next;
        }
        return candidate;
    }
}
public class JavaProgramtoFindaSublistinaList {
    static ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,8,9,10));
    public static List<Integer> subList(Integer fromIndex,Integer endIndex)
    {
       if(fromIndex>arrayList.size() && endIndex>arrayList.size()) throw new ArrayIndexOutOfBoundsException();
       if(fromIndex>endIndex) throw new IllegalArgumentException();
       ArrayList<Integer> arrayList1=new ArrayList<>();
        while (fromIndex<endIndex)
        {
            arrayList1.add(arrayList.get(fromIndex));
            fromIndex++;
        }
       return arrayList1;
    }
    public static List<Integer> splitaListintoTwoHalvesinJava(List<Integer> listOne,List<Integer> listTwo)
    {
          int mid=arrayList.size()/2;
          listTwo=subList(mid,arrayList.size());
          int size=arrayList.size();
          for (int i=0 ;i<listTwo.size();i++)
               listOne.add(arrayList.get(i));
        System.out.println(listTwo);
        return listOne;
    }
    public static int[] ListToArray(List<Integer> list)
    {
        int[] a=new int[list.size()];
        for (int i=0;i<list.size();i++)
            a[i]=list.get(i);
        return a;
    }
    public static List<Integer> ListToArray(int[] arr)
    {
        List<Integer> l=new ArrayList<>();
        for (int i=0;i<arr.length;i++)
            l.add(arr[i]);
        return l;
    }
    public static List<Integer> roateInteger(List<Integer> s,int value )
    {
        for (int i=0;i<value;i++)
        {
            s.add(s.get(i));
            s.remove(i);
        }
        return s;
    }
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(roateInteger(list,2));
      /*  ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.subList(1,4).clear();
        //System.out.println(subList(2,4));

       // System.out.println(Collectiooon.max(null));
        System.out.println(splitaListintoTwoHalvesinJava(new ArrayList<>(),arrayList));*/
    }
}


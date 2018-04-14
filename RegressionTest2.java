import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        int int4 = strSet2.size();
        java.util.NavigableSet<java.lang.String> strSet7 = strSet2.headSet("", false);
        java.lang.String str8 = strSet2.last();
        java.lang.Object obj9 = strSet2.clone();
        int int10 = strSet2.size();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet2);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        int int16 = strSet14.size();
        java.util.NavigableSet<java.lang.String> strSet19 = strSet14.headSet("", false);
        java.lang.String str20 = strSet14.last();
        java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet23 = strSet21.headSet("");
        java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet26 = strSet24.headSet("");
        boolean boolean27 = strSet21.retainAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Iterator<java.lang.String> strItor28 = strSet24.descendingIterator();
        strSet24.clear();
        java.lang.String str30 = strSet24.toString();
        java.util.SortedSet<java.lang.String> strSet32 = strSet24.tailSet("[]");
        int int33 = strSet24.size();
        boolean boolean34 = strSet14.retainAll((java.util.Collection<java.lang.String>) strSet24);
        boolean boolean35 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet14);
        java.util.NavigableSet<java.lang.String> strSet38 = strSet14.headSet("hi!", false);
        boolean boolean40 = strSet14.add("[]");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test02");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet2 = strSet0.headSet("");
        java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet5 = strSet3.headSet("");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet8 = strSet6.headSet("");
        boolean boolean9 = strSet3.retainAll((java.util.Collection<java.lang.String>) strSet6);
        java.util.NavigableSet<java.lang.String> strSet10 = strSet6.descendingSet();
        boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet10);
        java.lang.Object obj12 = strSet0.clone();
        java.util.Spliterator<java.lang.String> strSpliterator13 = strSet0.spliterator();
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
        boolean boolean16 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet15);
        java.lang.Class<?> wildcardClass17 = strSet14.getClass();
        java.util.stream.Stream<java.lang.String> strStream18 = strSet14.stream();
        boolean boolean19 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet14);
        java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertNotNull(strSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
        org.junit.Assert.assertNotNull(strStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test03");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        int int4 = strSet2.size();
        java.util.NavigableSet<java.lang.String> strSet7 = strSet2.headSet("", false);
        java.lang.String str8 = strSet2.last();
        java.lang.Object obj9 = strSet2.clone();
        java.lang.String str11 = strSet2.floor("");
        java.util.Iterator<java.lang.String> strItor12 = strSet2.descendingIterator();
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet15, strArray14);
        int int17 = strSet15.size();
        java.lang.String str19 = strSet15.ceiling("");
        java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>();
        boolean boolean22 = strSet20.add("hi!");
        java.util.SortedSet<java.lang.String> strSet24 = strSet20.headSet("");
        boolean boolean25 = strSet15.containsAll((java.util.Collection<java.lang.String>) strSet24);
        boolean boolean26 = strSet15.isEmpty();
        boolean boolean27 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet15);
        java.lang.String str28 = strSet15.first();
        java.util.TreeSet<java.lang.String> strSet29 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet30 = new java.util.TreeSet<java.lang.String>();
        boolean boolean31 = strSet29.removeAll((java.util.Collection<java.lang.String>) strSet30);
        java.util.NavigableSet<java.lang.String> strSet34 = strSet29.tailSet("", false);
        java.lang.String str35 = strSet29.pollFirst();
        java.lang.Object[] objArray36 = strSet29.toArray();
        java.lang.Object[] objArray37 = strSet15.toArray(objArray36);
        java.lang.String str38 = strSet15.toString();
        java.util.TreeSet<java.lang.String> strSet39 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet15);
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "hi!" + "'", str19.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + str28 + "' != '" + "hi!" + "'", str28.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(strSet34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[hi!]" + "'", str38.equals("[hi!]"));
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test04");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        int int4 = strSet2.size();
        java.util.NavigableSet<java.lang.String> strSet7 = strSet2.headSet("", false);
        java.util.NavigableSet<java.lang.String> strSet10 = strSet2.headSet("[hi!]", true);
        java.util.stream.Stream<java.lang.String> strStream11 = strSet2.parallelStream();
        java.util.Iterator<java.lang.String> strItor12 = strSet2.iterator();
        java.lang.Class<?> wildcardClass13 = strSet2.getClass();
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>();
        boolean boolean16 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet15);
        java.util.NavigableSet<java.lang.String> strSet19 = strSet14.tailSet("", false);
        java.util.stream.Stream<java.lang.String> strStream20 = strSet14.stream();
        try {
            boolean boolean21 = strSet2.contains((java.lang.Object) strStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: null");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strStream11);
        org.junit.Assert.assertNotNull(strItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertNotNull(strStream20);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test05");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        int int4 = strSet2.size();
        java.util.NavigableSet<java.lang.String> strSet7 = strSet2.headSet("", false);
        java.lang.String str8 = strSet2.last();
        java.lang.Object obj9 = strSet2.clone();
        int int10 = strSet2.size();
        java.util.TreeSet<java.lang.String> strSet11 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet2);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        int int16 = strSet14.size();
        java.util.NavigableSet<java.lang.String> strSet19 = strSet14.headSet("", false);
        java.lang.String str20 = strSet14.last();
        java.util.TreeSet<java.lang.String> strSet21 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet23 = strSet21.headSet("");
        java.util.TreeSet<java.lang.String> strSet24 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet26 = strSet24.headSet("");
        boolean boolean27 = strSet21.retainAll((java.util.Collection<java.lang.String>) strSet24);
        java.util.Iterator<java.lang.String> strItor28 = strSet24.descendingIterator();
        strSet24.clear();
        java.lang.String str30 = strSet24.toString();
        java.util.SortedSet<java.lang.String> strSet32 = strSet24.tailSet("[]");
        int int33 = strSet24.size();
        boolean boolean34 = strSet14.retainAll((java.util.Collection<java.lang.String>) strSet24);
        boolean boolean35 = strSet2.containsAll((java.util.Collection<java.lang.String>) strSet14);
        java.util.TreeSet<java.lang.String> strSet36 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet37 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet36);
        java.lang.String str38 = strSet36.pollFirst();
        java.util.Comparator<? super java.lang.String> wildcardComparator39 = strSet36.comparator();
        boolean boolean40 = strSet14.removeAll((java.util.Collection<java.lang.String>) strSet36);
        try {
            java.lang.String str41 = strSet36.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strItor28);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "[]" + "'", str30.equals("[]"));
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(wildcardComparator39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test06");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.add("hi!");
        java.util.SortedSet<java.lang.String> strSet4 = strSet0.headSet("");
        boolean boolean6 = strSet0.equals((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass7 = strSet0.getClass();
        java.util.TreeSet<java.lang.String> strSet8 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet10 = strSet8.headSet("");
        boolean boolean11 = strSet0.removeAll((java.util.Collection<java.lang.String>) strSet8);
        java.lang.String[] strArray13 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet14, strArray13);
        int int16 = strSet14.size();
        java.util.NavigableSet<java.lang.String> strSet19 = strSet14.headSet("", false);
        java.lang.String str20 = strSet14.last();
        java.lang.Object obj21 = strSet14.clone();
        java.lang.String str23 = strSet14.floor("");
        java.lang.String str24 = strSet14.pollFirst();
        java.util.Comparator<? super java.lang.String> wildcardComparator25 = strSet14.comparator();
        java.util.TreeSet<java.lang.String> strSet26 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet14);
        boolean boolean27 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet14);
        boolean boolean28 = strSet14.isEmpty();
        java.util.NavigableSet<java.lang.String> strSet29 = strSet14.descendingSet();
        java.util.NavigableSet<java.lang.String> strSet30 = strSet14.descendingSet();
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet33 = new java.util.TreeSet<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet33, strArray32);
        int int35 = strSet33.size();
        java.util.NavigableSet<java.lang.String> strSet38 = strSet33.headSet("", false);
        java.lang.String str39 = strSet33.last();
        java.lang.Object obj40 = strSet33.clone();
        java.lang.String str42 = strSet33.floor("");
        java.util.Iterator<java.lang.String> strItor43 = strSet33.descendingIterator();
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet46 = new java.util.TreeSet<java.lang.String>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet46, strArray45);
        int int48 = strSet46.size();
        java.lang.String str50 = strSet46.ceiling("");
        java.util.TreeSet<java.lang.String> strSet51 = new java.util.TreeSet<java.lang.String>();
        boolean boolean53 = strSet51.add("hi!");
        java.util.SortedSet<java.lang.String> strSet55 = strSet51.headSet("");
        boolean boolean56 = strSet46.containsAll((java.util.Collection<java.lang.String>) strSet55);
        boolean boolean57 = strSet46.isEmpty();
        boolean boolean58 = strSet33.containsAll((java.util.Collection<java.lang.String>) strSet46);
        java.lang.String str60 = strSet33.higher("[]");
        boolean boolean61 = strSet33.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream62 = strSet33.stream();
        java.util.Comparator<? super java.lang.String> wildcardComparator63 = strSet33.comparator();
        boolean boolean64 = strSet14.containsAll((java.util.Collection<java.lang.String>) strSet33);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "hi!" + "'", str20.equals("hi!"));
        org.junit.Assert.assertNotNull(obj21);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNull(wildcardComparator25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(strSet29);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
        org.junit.Assert.assertNotNull(strSet38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "hi!" + "'", str39.equals("hi!"));
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strItor43);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "hi!" + "'", str50.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertTrue("'" + str60 + "' != '" + "hi!" + "'", str60.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(strStream62);
        org.junit.Assert.assertNull(wildcardComparator63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test07");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.add("hi!");
        java.util.SortedSet<java.lang.String> strSet4 = strSet0.headSet("");
        boolean boolean6 = strSet0.equals((java.lang.Object) 10);
        java.util.stream.Stream<java.lang.String> strStream7 = strSet0.stream();
        java.lang.Object obj8 = strSet0.clone();
        java.util.stream.Stream<java.lang.String> strStream9 = strSet0.stream();
        java.lang.Object obj10 = strSet0.clone();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strStream7);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertNotNull(strStream9);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test08");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet2 = strSet0.headSet("");
        java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet5 = strSet3.headSet("");
        java.util.TreeSet<java.lang.String> strSet6 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet8 = strSet6.headSet("");
        boolean boolean9 = strSet3.retainAll((java.util.Collection<java.lang.String>) strSet6);
        java.util.NavigableSet<java.lang.String> strSet10 = strSet6.descendingSet();
        boolean boolean11 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet10);
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet10);
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
        java.util.TreeSet<java.lang.String> strSet14 = new java.util.TreeSet<java.lang.String>();
        boolean boolean15 = strSet13.removeAll((java.util.Collection<java.lang.String>) strSet14);
        java.util.NavigableSet<java.lang.String> strSet18 = strSet13.tailSet("", false);
        boolean boolean19 = strSet12.containsAll((java.util.Collection<java.lang.String>) strSet18);
        java.util.TreeSet<java.lang.String> strSet20 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet12);
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test09");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.add("hi!");
        java.util.SortedSet<java.lang.String> strSet4 = strSet0.headSet("");
        boolean boolean6 = strSet0.equals((java.lang.Object) 10);
        java.util.Iterator<java.lang.String> strItor7 = strSet0.descendingIterator();
        java.util.NavigableSet<java.lang.String> strSet10 = strSet0.headSet("", true);
        java.util.SortedSet<java.lang.String> strSet12 = strSet0.tailSet("[hi!]");
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet0);
        java.lang.String[] strArray15 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet16, strArray15);
        int int18 = strSet16.size();
        java.util.NavigableSet<java.lang.String> strSet21 = strSet16.headSet("", false);
        java.lang.String str22 = strSet16.last();
        java.util.NavigableSet<java.lang.String> strSet25 = strSet16.tailSet("hi!", true);
        java.util.Comparator<? super java.lang.String> wildcardComparator26 = strSet16.comparator();
        java.util.NavigableSet<java.lang.String> strSet31 = strSet16.subSet("", true, "", false);
        boolean boolean32 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet31);
        java.util.TreeSet<java.lang.String> strSet33 = new java.util.TreeSet<java.lang.String>();
        boolean boolean35 = strSet33.add("hi!");
        java.util.SortedSet<java.lang.String> strSet37 = strSet33.headSet("");
        boolean boolean39 = strSet33.equals((java.lang.Object) 10);
        java.lang.Class<?> wildcardClass40 = strSet33.getClass();
        java.util.TreeSet<java.lang.String> strSet41 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet43 = strSet41.headSet("");
        boolean boolean44 = strSet33.removeAll((java.util.Collection<java.lang.String>) strSet41);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet47 = new java.util.TreeSet<java.lang.String>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet47, strArray46);
        int int49 = strSet47.size();
        java.util.NavigableSet<java.lang.String> strSet52 = strSet47.headSet("", false);
        java.lang.String str53 = strSet47.last();
        java.lang.Object obj54 = strSet47.clone();
        java.lang.String str56 = strSet47.floor("");
        java.lang.String str57 = strSet47.pollFirst();
        java.util.Comparator<? super java.lang.String> wildcardComparator58 = strSet47.comparator();
        java.util.TreeSet<java.lang.String> strSet59 = new java.util.TreeSet<java.lang.String>((java.util.SortedSet<java.lang.String>) strSet47);
        boolean boolean60 = strSet33.addAll((java.util.Collection<java.lang.String>) strSet47);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet63 = new java.util.TreeSet<java.lang.String>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet63, strArray62);
        int int65 = strSet63.size();
        java.lang.String str66 = strSet63.last();
        java.util.NavigableSet<java.lang.String> strSet69 = strSet63.tailSet("", false);
        boolean boolean70 = strSet33.addAll((java.util.Collection<java.lang.String>) strSet69);
        boolean boolean71 = strSet0.addAll((java.util.Collection<java.lang.String>) strSet33);
        java.util.Iterator<java.lang.String> strItor72 = strSet0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "hi!" + "'", str22.equals("hi!"));
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNull(wildcardComparator26);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strSet37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(wildcardClass40);
        org.junit.Assert.assertNotNull(strSet43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 1 + "'", int49 == 1);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "hi!" + "'", str53.equals("hi!"));
        org.junit.Assert.assertNotNull(obj54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertTrue("'" + str57 + "' != '" + "hi!" + "'", str57.equals("hi!"));
        org.junit.Assert.assertNull(wildcardComparator58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + str66 + "' != '" + "hi!" + "'", str66.equals("hi!"));
        org.junit.Assert.assertNotNull(strSet69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNotNull(strItor72);
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test10");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet2 = strSet0.headSet("");
        java.util.TreeSet<java.lang.String> strSet3 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet5 = strSet3.headSet("");
        boolean boolean6 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet3);
        java.util.Iterator<java.lang.String> strItor7 = strSet3.descendingIterator();
        strSet3.clear();
        java.lang.String str9 = strSet3.toString();
        boolean boolean10 = strSet3.isEmpty();
        java.lang.Object obj11 = null;
        boolean boolean12 = strSet3.equals(obj11);
        java.lang.String str14 = strSet3.ceiling("[hi!]");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet17 = new java.util.TreeSet<java.lang.String>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet17, strArray16);
        int int19 = strSet17.size();
        java.util.NavigableSet<java.lang.String> strSet22 = strSet17.headSet("", false);
        java.lang.String str23 = strSet17.last();
        java.lang.Object obj24 = strSet17.clone();
        int int25 = strSet17.size();
        java.util.TreeSet<java.lang.String> strSet26 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet28 = strSet26.headSet("");
        java.util.TreeSet<java.lang.String> strSet29 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet31 = strSet29.headSet("");
        boolean boolean32 = strSet26.retainAll((java.util.Collection<java.lang.String>) strSet29);
        java.lang.String str33 = strSet29.pollFirst();
        java.lang.String[] strArray37 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[] strArray38 = strSet29.toArray(strArray37);
        java.lang.String str39 = strSet29.toString();
        java.lang.String str41 = strSet29.floor("");
        java.lang.Object[] objArray42 = strSet29.toArray();
        boolean boolean43 = strSet17.containsAll((java.util.Collection<java.lang.String>) strSet29);
        strSet17.clear();
        java.util.NavigableSet<java.lang.String> strSet49 = strSet17.subSet("hi!", false, "hi!", false);
        boolean boolean50 = strSet3.contains((java.lang.Object) "hi!");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSet5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "[]" + "'", str9.equals("[]"));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "hi!" + "'", str23.equals("hi!"));
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "[]" + "'", str39.equals("[]"));
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test11");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        int int4 = strSet2.size();
        java.lang.String str6 = strSet2.ceiling("");
        java.util.TreeSet<java.lang.String> strSet7 = new java.util.TreeSet<java.lang.String>();
        boolean boolean9 = strSet7.add("hi!");
        java.util.SortedSet<java.lang.String> strSet11 = strSet7.headSet("");
        boolean boolean13 = strSet7.equals((java.lang.Object) 10);
        java.util.Iterator<java.lang.String> strItor14 = strSet7.descendingIterator();
        java.util.NavigableSet<java.lang.String> strSet17 = strSet7.headSet("", true);
        java.util.SortedSet<java.lang.String> strSet19 = strSet7.tailSet("[hi!]");
        strSet7.clear();
        strSet7.clear();
        boolean boolean22 = strSet2.equals((java.lang.Object) strSet7);
        try {
            java.lang.String str23 = strSet7.first();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException; message: null");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi!" + "'", str6.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strSet11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strItor14);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test12");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.add("hi!");
        java.util.SortedSet<java.lang.String> strSet4 = strSet0.headSet("");
        java.util.Iterator<java.lang.String> strItor5 = strSet0.descendingIterator();
        java.util.NavigableSet<java.lang.String> strSet10 = strSet0.subSet("", false, "hi!", true);
        java.util.Spliterator<java.lang.String> strSpliterator11 = strSet0.spliterator();
        java.util.TreeSet<java.lang.String> strSet12 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet0);
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
        boolean boolean15 = strSet13.add("hi!");
        java.util.SortedSet<java.lang.String> strSet17 = strSet13.headSet("");
        boolean boolean19 = strSet13.equals((java.lang.Object) 10);
        java.util.Iterator<java.lang.String> strItor20 = strSet13.descendingIterator();
        int int21 = strSet13.size();
        java.util.Comparator<? super java.lang.String> wildcardComparator22 = strSet13.comparator();
        boolean boolean23 = strSet0.containsAll((java.util.Collection<java.lang.String>) strSet13);
        java.lang.String str24 = strSet0.pollFirst();
        java.util.TreeSet<java.lang.String> strSet25 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet27 = strSet25.headSet("");
        java.util.TreeSet<java.lang.String> strSet28 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet30 = strSet28.headSet("");
        boolean boolean31 = strSet25.retainAll((java.util.Collection<java.lang.String>) strSet28);
        java.lang.String str32 = strSet28.pollFirst();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[] strArray37 = strSet28.toArray(strArray36);
        java.lang.String str38 = strSet28.toString();
        java.lang.String str40 = strSet28.floor("");
        boolean boolean42 = strSet28.add("[hi!]");
        java.util.TreeSet<java.lang.String> strSet43 = new java.util.TreeSet<java.lang.String>();
        boolean boolean45 = strSet43.add("hi!");
        java.util.SortedSet<java.lang.String> strSet47 = strSet43.headSet("");
        java.util.NavigableSet<java.lang.String> strSet52 = strSet43.subSet("", false, "hi!", true);
        java.util.TreeSet<java.lang.String> strSet53 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet55 = strSet53.headSet("");
        java.util.TreeSet<java.lang.String> strSet56 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet58 = strSet56.headSet("");
        boolean boolean59 = strSet53.retainAll((java.util.Collection<java.lang.String>) strSet56);
        java.lang.String str60 = strSet56.pollFirst();
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[] strArray65 = strSet56.toArray(strArray64);
        java.io.Serializable[] serializableArray66 = strSet43.toArray((java.io.Serializable[]) strArray64);
        java.lang.Class<?> wildcardClass67 = strSet43.getClass();
        java.lang.String str69 = strSet43.floor("hi!");
        java.util.NavigableSet<java.lang.String> strSet72 = strSet43.tailSet("hi!", false);
        java.util.SortedSet<java.lang.String> strSet74 = strSet43.tailSet("[[], hi!]");
        boolean boolean75 = strSet28.retainAll((java.util.Collection<java.lang.String>) strSet43);
        boolean boolean76 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet43);
        java.lang.String str77 = strSet43.pollLast();
        try {
            java.util.NavigableSet<java.lang.String> strSet82 = strSet43.subSet("hi!", false, "", true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: fromKey > toKey");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strItor5);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNull(wildcardComparator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "hi!" + "'", str24.equals("hi!"));
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strArray36);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "[]" + "'", str38.equals("[]"));
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(strSet47);
        org.junit.Assert.assertNotNull(strSet52);
        org.junit.Assert.assertNotNull(strSet55);
        org.junit.Assert.assertNotNull(strSet58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(strArray64);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(serializableArray66);
        org.junit.Assert.assertNotNull(wildcardClass67);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + "hi!" + "'", str69.equals("hi!"));
        org.junit.Assert.assertNotNull(strSet72);
        org.junit.Assert.assertNotNull(strSet74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + str77 + "' != '" + "hi!" + "'", str77.equals("hi!"));
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test13");
        java.lang.String[] strArray1 = new java.lang.String[] { "hi!" };
        java.util.TreeSet<java.lang.String> strSet2 = new java.util.TreeSet<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet2, strArray1);
        int int4 = strSet2.size();
        java.util.NavigableSet<java.lang.String> strSet7 = strSet2.headSet("", false);
        java.lang.String str8 = strSet2.last();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet2);
        java.util.NavigableSet<java.lang.String> strSet10 = strSet2.descendingSet();
        java.lang.String str11 = strSet2.pollFirst();
        java.util.NavigableSet<java.lang.String> strSet14 = strSet2.headSet("[]", false);
        java.util.TreeSet<java.lang.String> strSet15 = new java.util.TreeSet<java.lang.String>((java.util.Collection<java.lang.String>) strSet2);
        java.lang.Class<?> wildcardClass16 = strSet15.getClass();
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!" + "'", str8.equals("hi!"));
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "hi!" + "'", str11.equals("hi!"));
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test14");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.add("hi!");
        java.util.SortedSet<java.lang.String> strSet4 = strSet0.headSet("");
        boolean boolean6 = strSet0.equals((java.lang.Object) 10);
        java.util.Iterator<java.lang.String> strItor7 = strSet0.descendingIterator();
        int int8 = strSet0.size();
        java.util.TreeSet<java.lang.String> strSet9 = new java.util.TreeSet<java.lang.String>();
        boolean boolean11 = strSet9.add("hi!");
        java.util.SortedSet<java.lang.String> strSet13 = strSet9.headSet("");
        java.util.NavigableSet<java.lang.String> strSet18 = strSet9.subSet("", false, "hi!", true);
        java.util.TreeSet<java.lang.String> strSet19 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet21 = strSet19.headSet("");
        java.util.TreeSet<java.lang.String> strSet22 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet24 = strSet22.headSet("");
        boolean boolean25 = strSet19.retainAll((java.util.Collection<java.lang.String>) strSet22);
        java.lang.String str26 = strSet22.pollFirst();
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "" };
        java.lang.String[] strArray31 = strSet22.toArray(strArray30);
        java.io.Serializable[] serializableArray32 = strSet9.toArray((java.io.Serializable[]) strArray30);
        java.lang.Object[] objArray33 = strSet9.toArray();
        java.lang.String str34 = strSet9.pollFirst();
        boolean boolean35 = strSet0.retainAll((java.util.Collection<java.lang.String>) strSet9);
        java.util.SortedSet<java.lang.String> strSet38 = strSet0.subSet("", "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(serializableArray32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertTrue("'" + str34 + "' != '" + "hi!" + "'", str34.equals("hi!"));
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(strSet38);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test15");
        java.util.TreeSet<java.lang.String> strSet0 = new java.util.TreeSet<java.lang.String>();
        boolean boolean2 = strSet0.add("hi!");
        java.util.SortedSet<java.lang.String> strSet4 = strSet0.headSet("");
        boolean boolean6 = strSet0.equals((java.lang.Object) 10);
        java.util.Iterator<java.lang.String> strItor7 = strSet0.descendingIterator();
        java.util.NavigableSet<java.lang.String> strSet10 = strSet0.headSet("", true);
        java.util.SortedSet<java.lang.String> strSet12 = strSet0.tailSet("[hi!]");
        java.util.TreeSet<java.lang.String> strSet13 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet15 = strSet13.headSet("");
        java.util.TreeSet<java.lang.String> strSet16 = new java.util.TreeSet<java.lang.String>();
        java.util.SortedSet<java.lang.String> strSet18 = strSet16.headSet("");
        boolean boolean19 = strSet13.retainAll((java.util.Collection<java.lang.String>) strSet16);
        java.util.Iterator<java.lang.String> strItor20 = strSet16.descendingIterator();
        java.util.stream.Stream<java.lang.String> strStream21 = strSet16.parallelStream();
        boolean boolean22 = strSet0.equals((java.lang.Object) strSet16);
        boolean boolean23 = strSet16.isEmpty();
        java.util.stream.Stream<java.lang.String> strStream24 = strSet16.stream();
        java.lang.String str26 = strSet16.floor("[, hi!]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strItor7);
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertNotNull(strSet15);
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strItor20);
        org.junit.Assert.assertNotNull(strStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strStream24);
        org.junit.Assert.assertNull(str26);
    }
}


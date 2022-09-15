package no.oslomet.cs.algdat.Oblig1;

////// Løsningsforslag Oblig 1 ////////////////////////

import java.lang.UnsupportedOperationException;
import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.Random;



public class Oblig1 {

    private Oblig1() {}

    ///// Oppgave 1 //////////////////////////////////////
    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r;         // en randomgenerator
        r = new Random();
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            bytt(a,k,i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }
    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }


    //********************************************************************
    public static int maks(int[] a) {
        if( a.length == 0){ // hvis tabell lengde er 0
            throw new NoSuchElementException
                    ("tomt tabellintervall!");

        }

        for (int i = 0; i < a.length -1; ++i){ // [0: a.length> -1 må være der! husk at array har er siste tom plass!
            if (a[i] > a[i +1]){// største tall sammenlignes med tall ved siden
                int temp = a[i]; //vi tar utgangspunktet fra den største tallen
                a[i] = a[i+1];// Største tall byttes ut med mindre tall
                a[i+1] = temp; // mindre tall byttes ut med den største som vi tatt vare på i temp
            }
        }

        return a[a.length-1]; // vi returnerer største tall
    }

    public static int ombyttinger(int[] a) {

        //throw new UnsupportedOperationException();
        if( a.length == 0){ // hvis tabell lengde er 0
            throw new NoSuchElementException
                    ("tomt tabellintervall!");
        }
        int ombytting = 0;

        for (int i = 0; i < a.length -1; ++i){ // [0: a.length> -1 må være der! husk at array har er siste tom plass!
            if (a[i] > a[i +1]){
                // hver gang vi møter en større tall, skal de bytte plass, og vi teller ombyttinger
                ombytting++;
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        return ombytting;
    }

    ///// Oppgave 2 //////////////////////////////////////
    public static int antallUlikeSortert(int[] a) {
        //throw new UnsupportedOperationException();
        if( a.length == 0){ // hvis tabell lengde er 0
            return 0;
        }

        int antallLike = 1;
        // Plukker alle elementene en av gangen start fra 1
        int i = 1;
        while (i < a.length)
        {
            int j = 0;
            // start fra første index og loop så lenge j < i
            while (j < i)
            {
                if (a[i] == a[j]) {
                    // hopp ut av loopen
                    break;
                }
                j++;
            }
            // Hvis den ikke har blitt printet tideligere,
            // printes den nå
            if (i == j) {
                antallLike++;
            }
            i++;
        }
        // Er array sortert?
        if(erSortert(a)== false){
            throw new IllegalStateException
                    ("Array er ikke sortert!");
        }

        return antallLike;

    }
    public static boolean erSortert(int[] a)  // legges i samleklassen Tabell
    {
        for (int i = 1; i < a.length; i++)      // starter med i = 1
            if (a[i-1] > a[i]) return false;      // en inversjon

        return true;
    }

    ///// Oppgave 3 //////////////////////////////////////
    public static int antallUlikeUsortert(int[] a) {
        //throw new UnsupportedOperationException();
        if( a.length == 0){ // hvis tabell lengde er 0
            return 0;
        }
        int likeTall = 0;
        //finner antal like tall
        for (int i = 0; i < a.length; i++) {
            for (int j = i+1; j < a.length; j++){
                if (a[i] == a[j]){
                    likeTall++;
                    break; // hopper ut av løkka første forløkke (finn ut hvorfor)
                }
            }
        }
        // hvis vi trekker like tall fra array length skal vi få antall ulike tall
        return (a.length - likeTall);
    }

    ///// Oppgave 4 //////////////////////////////////////
    public static void delsortering(int[] a) {

        kvikksortering(a);

        int oddetall = 0;

        int i = 0;
        while ( i < a.length)
        {
            if (a[i]%2 == 0)
            {}
            else {

                int temp = a[oddetall];
                a[oddetall] = a[i];
                a[i] = temp;
                oddetall++;
            }
            i++;
        }
        kvikksortering(a, oddetall, a.length);


    }

    private static int parter0(int[] a, int v, int h, int skilleverdi)  //******
    {
        while (true)                                  // stopper når v > h
        {
            while (v <= h && a[v] < skilleverdi) v++;   // h er stoppverdi for v
            while (v <= h && a[h] >= skilleverdi) h--;  // v er stoppverdi for h

            if (v < h) bytt(a,v++,h--);                 // bytter om a[v] og a[h]
            else  return v;  // a[v] er nåden første som ikke er mindre enn skilleverdi
        }
    }
    private static int sParter0(int[] a, int v, int h, int indeks)      //*****
    {
        bytt(a, indeks, h);           // skilleverdi a[indeks] flyttes bakerst
        int pos = parter0(a, v, h - 1, a[h]);  // partisjonerer a[v:h - 1]
        bytt(a, pos, h);              // bytter for å få skilleverdien på rett plass
        return pos;                   // returnerer posisjonen til skilleverdien
    }
    private static void kvikksortering0(int[] a, int v, int h)  // en privat metode *****
    {
        if (v >= h) return;  // a[v:h] er tomt eller har maks ett element
        int k = sParter0(a, v, h, (v + h)/2);  // bruker midtverdien
        kvikksortering0(a, v, k - 1);     // sorterer intervallet a[v:k-1]
        kvikksortering0(a, k + 1, h);     // sorterer intervallet a[k+1:h]
    }

    public static void kvikksortering(int[] a, int fra, int til) // a[fra:til> ****
    {
        kvikksortering0(a, fra, til - 1);  // v = fra, h = til - 1
    }

    public static void kvikksortering(int[] a)   // sorterer hele tabellen  *****
    {
        kvikksortering0(a, 0, a.length - 1);
    }

    ///// Oppgave 5 //////////////////////////////////////
    public static void rotasjon(char[] a) {

        //throw new UnsupportedOperationException();
        if(a.length < 1) //
            return;

        char sist = a[a.length-1];

        //for(int j = a.length-1; j > 0; j--)
        int j = a.length-1;

        while (j > 0)
        {
            a[j] = a[j-1];  //

            j--;
        }
        //Sist element blir satt på første plass
        a[0] = sist;

        //Printer rotert array
        System.out.println("Array after right rotation: ");
        for(int i = 0; i< a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    ///// Oppgave 6 //////////////////////////////////////
    public static void rotasjon(char[] a, int k) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 7 //////////////////////////////////////
    /// 7a)
    public static String flett(String s, String t) {
        //throw new UnsupportedOperationException();
        // lagrer endelig array
        StringBuilder stringFlettet = new StringBuilder();

        // looper gjennom stringen
        int i = 0;
        while (i < s.length() || i < t.length()){

            if (i < s.length()){
                stringFlettet.append(s.charAt(i));
            }

            if (i < t.length()){
                stringFlettet.append(t.charAt(i));
            }

            i++;
        }
        String ny = stringFlettet.toString();
        return ny;
    }

    /// 7b)
    public static String flett(String... s) {
        //throw new UnsupportedOperationException();

        // finner den lengdte verdien i arraye
        int makslengde = 0;
        int l = 0;
        while (l < s.length)
        {
            if (s[l].length() >= makslengde) {// sjekker hvor langd ord er value.lenght(), er det større ellrt lik 0
                makslengde = s[l].length();// hvis riktig sett 0 til value.length()
            }
            l++;
        }

        StringBuilder stringFlettet = new StringBuilder();

        for (int i = 0; i < makslengde; i++) {    // går gjenno ord
            for (int j = 0; j < s.length; j++) { // j skal gå gjennom bokstaver

                if (s[j].length() > i) {

                    stringFlettet.append(s[j].charAt(i));

                }
            }
        }
        String ferdig = stringFlettet.toString();
        return ferdig;

    }

    ///// Oppgave 8 //////////////////////////////////////
    public static int[] indekssortering(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 9 //////////////////////////////////////
    public static int[] tredjeMin(int[] a) {
        throw new UnsupportedOperationException();
    }

    ///// Oppgave 10 //////////////////////////////////////
    public static int bokstavNr(char bokstav) {
        throw new UnsupportedOperationException();
    }

    public static boolean inneholdt(String a, String b) {
        throw new UnsupportedOperationException();
    }

}  // Oblig1

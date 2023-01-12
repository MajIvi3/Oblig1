# Obligatorisk oppgave 1 i Algoritmer og Datastrukturer

Denne oppgaven er en innlevering i Algoritmer og Datastrukturer. 
> Oppgaven er levert av følgende student:
> * Majda Ivic, S362095, s362095@oslomet.no
>
>
> # Oppgavebeskrivelse




## Oppgave 1

Oppgave 1 består av to metoder:

1. Maks()-metoden itererer den gjennom array, og sammenligner hvert element med det som følger etter. Hvis det gjeldende elementet er større enn det neste, byttes de. Til slutt returnerer den det siste elementet i matrisen, som skal være det største elementet etter sorteringen.


2. Den andre metoden switches() bruker samme kode som max(), bortsett fra at jeg teller antall ombytninger  
Jeg arraye.

***Tidskompleksiteten til begge algoritmene er*** $O(n^2)$


***Svar på teoretisk delen***

1. Når blir det flest ombyttinger?
Flest ombytning har vi når største tall står på første plass, når tall er sortert i 
minkende rekkefølge dvs. n-1 ombytninger.

2. Når blir det færrest?
Minst ombytning har vi når tall er sortert i stigende rekkefølge da har vi flest ombytninger

3. Hvor mange blir det i gjennomsnitt?
Vi har situasjon der antall ombytningene kan variere fra  tabell til tabell. Det betyr at gjennomsnitt av 
dem større enn det største av tallene foran. Formelen for å finne ut av det er : $H_{n-1} \approx \log(n) - 0.423$
 
(dette er også snakk om naturlige logaritmer!)


Vi kan konkludere at public static int ombyttinger(int[]a) metoden er dårligere en public static int maks(int[] a) 
som vi har lært tidligere

## Oppgave 2

Denne algoritmen teller antall distinkte heltall i en sortert matrise. Den tar en rekke heltall som inndata og returnerer et heltall.

Algoritmen starter med å sjekke om inngangs-array er tom, hvis den er det, returnerer den umiddelbart 0, da det ikke er noen forskjellige heltall i en tom matrise.

Deretter deklarerer den en variabel *antallLike* og setter den til 1. Denne variabelen vil holde oversikt over antall distinkte heltall i inndatamatrisen.

Så er det to nestede while løkker. Den ytre løkken starter fra det andre elementet i array og gjentas til slutten av array, og den indre løkken starter fra det første elementet i array og gjentar til gjeldende element i den ytre løkken.

For hvert par elementer sjekker den indre løkke om de er like. Hvis de er det, bryter det den indre løkka.

Hvis den indre løkka fullføres uten å bryte, betyr det at det nåværende elementet i den ytre løkka er forskjellig fra alle elementene som kom før den. Så verdien av *antallLike* øker med 1.

Etter at begge løkkene er ferdige, sjekker algoritmen om inndata-array er sortert ved hjelp av *hjelperfunksjonen erSortert(int[] a)* . Hvis array ikke sorteres, kaster funksjonen en *IllegalStateException.*

Til slutt returnerer algoritmen verdien av *antallLike.*

***Tidskompleksiteten til denne algoritmen er*** $O(n)$

## Oppgave 3

Denne algoritmen teller antall distinkte heltall i en usortert array. Funksjonen tar en array med heltall som inndata og returnerer et heltall.

Algoritmen starter med å sjekke om inngangs-array er tom, hvis den er det, returnerer den umiddelbart 0, da det ikke er noen forskjellige heltall i en tom array.

Deretter deklarere den en variabel *likeTall* og setter den til 0. Denne variabelen vil holde oversikt over antall dupliserte heltall i innda-arry.

Deretter er det to nestede for løkker, den ytre løkken starter fra det første elementet i array og itererer til slutten av array, og den indre løkken starter fra neste element i den ytre løkkens gjeldende element og gjentas til slutten av array.

For hvert par elementer sjekker den indre loop om de er like. Hvis de er det, øker det verdien av *likeTall* med 1, og bryter den indre for-loop. På denne måten teller den indre loop bare den første forekomsten av hvert duplikatheltall.

Etter at begge loop er ferdige, returnerer algoritmen forskjellen mellom lengden på inndata-array og antall dupliserte heltall *likeTall* . Dette er lik antall distinkte heltall i inndatamatrisen.

***Tidskompleksiteten til denne algoritmen er*** $O(n^2)$ 


## Oppgave 4

Sorteringsalgoritmen som brukes her er quicksort, det er en splitt og hersk-algoritme som velger et pivotelement fra matrisen og partisjonerer de andre elementene i to undermatriser, elementer mindre enn pivoten og elementer større enn pivoten. Deretter sorterer den rekursivt de to undermatrisene.

Funksjonen *delsortering(int[] a)* kaller først *kvikksortering(a)-funksjonen*, som sorterer hele inndata-array. Etter at array er sortert, bruker algoritmen en while-loop *while ( i < a.length)* for å iterere over elementene i array.

For hvert element kontrollerer den om elementet er partall eller oddetall. Hvis elementet er jevnt, gjør det ingenting. Hvis elementet er oddetall, bytter det elementet med elementet i indeksen oddetall og øker verdien av oddetall med 1. På denne måten flyttes partallene til høyre side av matrisen, og oddetall flyttes til venstre side av matrisen.

Etter while-loopen er høyre side av array (siden med partallene) allerede sortert. Venstre side av matrisen (siden med oddetall) sorteres imidlertid ikke. Så algoritmen kaller *kvikksortering (a, oddetall, a.length)* -funksjonen for å sortere venstre side av matrisen.

***Tidskompleksiteten til denne algoritmen er*** $O(n log n)$ ***i gjennomsnitt og verste fall***


## Oppgave 5

Denne algoritmen utfører en operasjon som kalles høyre rotasjon. Det tar en array som input, og den roterer alle elementene ett trinn til høyre.



1. Det starter med å lagre det siste elementet i matrisen i en variabel som kalles sist'
2. Ved hjelp av en while-loop flyttes array-elementene ett trinn til høyre ved å starte ved den siste indeksen a[a.length-1] og iterere til den første indeksen (i > 0) i hver iterasjon, det nåværende elementet tilordnes verdien av det forrige elementet, på denne måten blir alle elementene i matrisen forskjøvet ett trinn til høyre.
3. Til slutt tilordnes det første elementet i array verdien av variabelen sist, dette setter det siste elementet som opprinnelig ble lagret til den første posisjonen til matrisen.

***Kompleksiteten til denne algoritmen er*** $O(n)$


## Oppgave 7

a)

Denne algoritmen utfører en operasjon som kalles "string flett". Det tar inn to strenger, *s* og *t* som input, og det skaper en ny streng ved vekselvis å ta tegn fra de to inndatastrengene.

Det starter med å opprette en ny tom strengbygger kalt *stringFlettet* som vil bli brukt til å lagre det endelige resultatet.

Deretter bruker den en while-loop som fortsetter å kjøre til slutten av en av inndatastrengene er nådd *(i < s.length() || i < t.length())*. Inne i while-loopen:


1. Hvis gjeldende indeks *i* er innenfor grensene for den første inndatastrengen, legges det til et tegn fra den første inndatastrengen i indeksen i det endelige strengverktøyet.
2. Hvis gjeldende indeks *i* er innenfor grensene for den andre inndatastrengen, legges et tegn fra den andre inndatastrengen ved indeksen til den endelige strengbyggeren.
3. Indeksen *i* økes med 1.

Til slutt oppretter den en ny streng ved å kalle *toString()* -metoden til strengbyggeren, og den returnerer den som den endelige utdataene.

***Tidskompleksiteten til funksjonen er*** $O(n)$

b)
 Denne algoritmen utfører også en operasjon som kalles "string flett", men denne gangen tar det et variabelt antall inngangsstrenger.
 
Det starter med å finne den maksimale lengden på alle inngangsstrengene, ved å initialisere en variabel makslengde til 0 og bruke en while-loop for å iterere over inngangsstrengene og sammenligne lengden på hver streng med variabelen makslengde og lagre maksimumsverdien. 

Deretter oppretter den en ny tom strengbygger kalt *stringFlettet* som vil bli brukt til å lagre det endelige resultatet.

Deretter bruker den to nestede for løkker for å iterere over inndatastrengene og tegnene.

1. Den ytre for løkke itererer fra 0 til maksimal lengde på inndatastrengene, og den indre for løkke itererer over inndatastrengene.
2. I hver iterasjon kontrollerer den om gjeldende inngangsstreng har en lengde som er større enn gjeldende indeks for ytre for løkke *(hvis (s[j].length() > i))* . Hvis den gjør det, legger den til tegnet i gjeldende indeks for inndatastrengen i den endelige strengbyggeren.

Til slutt oppretter den en ny streng ved å kalle *toString()* -metoden til strengbyggeren, og den returnerer den som den endelige utdataene.

***Tidskompleksiteten til funksjonen er*** $O(nm)$


***Kilde: Algoritmer og datastrukturer med Java Nettbasert lærebok***</br>
***Link:*** https://www.cs.hioa.no/~ulfu/appolonius/?fbclid=IwAR2DTWVDZ2qLxNY1SU6BHgtVg0J0pyZYsN1ZlkTxq34tTPfcHJeAdPnodSk


